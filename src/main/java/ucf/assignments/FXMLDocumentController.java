package ucf.assignments;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Christine Hawkins
 */
import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;



public class FXMLDocumentController implements Initializable {


    @FXML private TableView<Item> tableView;



    public TableColumn<Item,String> colItem;
    public TableColumn<Item,String> colDes;
    public TableColumn<Item,String> colDD;
    public TableColumn<Item,String> colCompleted;


    @FXML private TextField ItemField;
    @FXML private TextField DescriptionField;
    @FXML private TextField DuedateField;
    @FXML private TextField filterInput;

    @FXML private TextField search;



    private Text actiontarget;


    //creates array list
   ObservableList<Item> observableList= FXCollections.observableArrayList(
           new Item("cookies","Pillsburry","2021-08-09","C")
   );



    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO



        colItem.setCellValueFactory(new PropertyValueFactory<>("Title"));
        colDes.setCellValueFactory(new PropertyValueFactory<>("Description"));
        colDD.setCellValueFactory(new PropertyValueFactory<>("Duedate"));
        colCompleted.setCellValueFactory(new PropertyValueFactory<>("Complete"));


        tableView.setEditable(true);
        tableView.setItems(observableList);
       colItem.setCellFactory(TextFieldTableCell.forTableColumn());
        colDes.setCellFactory(TextFieldTableCell.forTableColumn());
        colDD.setCellFactory(TextFieldTableCell.forTableColumn());
        colCompleted.setCellFactory(TextFieldTableCell.forTableColumn());


        //A description shall be between 1 and 256 characters in length
        DescriptionField.setTextFormatter(new TextFormatter<>(c -> c.getControlNewText().matches(".{0,256}") ? c : null));


    }



// adds item to list when button is pressed
    @FXML
    protected void addItem(ActionEvent event) {
        ObservableList<Item> data = tableView.getItems();
        data.add(new Item(ItemField.getText(),
                DescriptionField.getText(),
                DuedateField.getText(),
                filterInput.getText()
        ));

        ItemField.setText("");
        DescriptionField.setText("");
        DuedateField.setText("");
        filterInput.setText("");
    }


    //removes item when button is pressed
    @FXML
    public void removeItem(ActionEvent actionEvent) {
        ObservableList<Item> data2,singledata;
        data2=tableView.getItems();
        singledata=tableView.getSelectionModel().getSelectedItems();
        singledata.forEach(data2::remove);
    }




    //can edit any field of list
    public void onEditchanged(TableColumn.CellEditEvent<Item, String> itemStringCellEditEvent) {
        Item item=tableView.getSelectionModel().getSelectedItem();
        item.setTitle(itemStringCellEditEvent.getNewValue());
    }



    //clears entire list

    @FXML
    public void clearbutton(ActionEvent actionEvent) {


        tableView.getItems().clear();

    }




    //shows instructions about the app when you press help->about
    public void handleAboutAction(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/ucf.assignments/Help.fxml"));
            Parent root1=(Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }


    //exits app
    public void handleExit(ActionEvent actionEvent) {
        System.exit(0);
    }

    //save the list to external storage
    public void SaveAll(ObservableList<Item>observableList,File file) {

        try{
            BufferedWriter outwriter= new BufferedWriter(new FileWriter(file));

            for(Item items: observableList){
                outwriter.write(items.getTitle()+", ");
                outwriter.write(items.getDescription()+", ");
                outwriter.write(items.getDuedate()+", ");
                outwriter.write(items.getComplete()+" ");
                outwriter.newLine();
            }
            System.out.println(observableList);
            actiontarget.setText("File saved");
            outwriter.close();



        } catch(IOException e)
        {
            Alert alert= new Alert(Alert.AlertType.ERROR,"ERROR",ButtonType.OK);
            alert.setContentText("Sorry an error has occurred");
            alert.showAndWait();
            if(alert.getResult()==ButtonType.OK){
                alert.close();
            }

        }


    }


    public void handleSave(ActionEvent actionEvent) {

        Stage secondary =new Stage();
        FileChooser fileChooser= new FileChooser();

        fileChooser.setTitle("Save To Do List");
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));


        File file= fileChooser.showSaveDialog(secondary);
        if(file != null)
        {
            SaveAll(tableView.getItems(),file);
        }


    }

    //opens list from external storage txt file from program
    public void handleExistingEL(ActionEvent actionEvent) throws IOException {



        String line = "";
        String splitBy = ",";

        try {
            //reads input file
            BufferedReader reader = new BufferedReader(new FileReader("src/main/java/ucf/assignments/ex.txt"));
            while ((line = reader.readLine()) != null) {// splits at comma
                String[] array= line.split(splitBy);

                Item item= (new Item((array[0]),(array[1]),(array[2]),array[3]));
                tableView.getItems().add(item);

            }

           reader.close();

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }



    //filters to see which is "c" completed or "i" incomplete
    public void Seachrecord(KeyEvent keyEvent) {

            FilteredList<Item> filter = new FilteredList<>(observableList, b -> true);
            search.textProperty().addListener((observable, oldValue, newValue) -> {
                filter.setPredicate(items -> {
                    if (newValue == null || newValue.isEmpty()) {
                        return true;
                    }

                    String lowercasefilter = newValue.toLowerCase();

                    if (items.getComplete().toLowerCase().indexOf(lowercasefilter) != -1) {
                        return true;
                    }
                    return false;
                });

                SortedList<Item> sorteddata = new SortedList<>(filter);
                sorteddata.comparatorProperty().bind(tableView.comparatorProperty());

                tableView.setItems(sorteddata);
            });


    }
}