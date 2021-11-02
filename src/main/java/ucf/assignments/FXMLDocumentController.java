package ucf.assignments;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Christine Hawkins
 */
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;


public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Text actiontarget;

   // @FXML private TableView<ToDoList> tableView;
    //@FXML private TableColumn<ToDoList, String> Descriptionc;
    //@FXML private TableColumn<ToDoList, LocalDate> duedatec;
    //@FXML private TableColumn<ToDoList, CheckBox> completedc;
   // @FXML private TableView<ToDoList> Todolistview;
    //@FXML private TextField text;

    @FXML
    private void handleSubmitButtonAction(ActionEvent event) {

        //goes into table view of that todolist opened
        actiontarget.setText("Item saved");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void handleAboutAction(ActionEvent actionEvent) {
        //shows a txt file explaining application


    }

    public void handleKeyInput(KeyEvent keyEvent) {
        //function handles what user clicked on menu bar
    }

    public void handlenewfileButtonAction(ActionEvent actionEvent) {
        //goes into table view of  All todolist
        //saves file with name given to it
        actiontarget.setText("File saved");
    }




    //6
    public void handleNewF(ActionEvent actionEvent) {
        //opens textbox to create new list and input name of list
        // puts this file into table view of all files
    }

    //7
    public void handleDeleteL(ActionEvent actionEvent) {

        //Deletes the current list they are on
        //if(list is selected and handleDeleteL is selected)
        //Delete selected list from table view of all lists
    }

    //8
    public void handleSaveas(ActionEvent actionEvent) {

        //user is able to change file name to desired name to external drive
        //text box to change name
    }
    //9
    public void handleNewI(ActionEvent actionEvent) {
        //function for new item on current list
        //guide to open textbox to input item, description and due date
    }

    //10
    public void handleDeleteI(ActionEvent actionEvent) {

        //function to select and delete Item in the specified todolist
    }

    //11 12
    public void handleEditI(ActionEvent actionEvent) {

        //function to edit selected item in todolist
        // opens the item text box to edit the item and save it
    }

    //13
    public void handlecheckbox(ActionEvent actionEvent) {
        //checkbox item is complete in to do list
        //also shows in column as complete
    }

    //14
    public void handleExistingL(ActionEvent actionEvent) {

        //displays all lists
        //option to select list and open it
    }


    //17
    public void handleSave(ActionEvent actionEvent) {

        // saves file to external drive
    }

    public void handleExit(ActionEvent actionEvent) {
        //exits application
    }


    //15 and 16
    public void showCompletedTasks(ActionEvent completeTasksButtonPressed) {
        //Show only tasks that are checked off by using search method
        //filters list so it only shows completed items
    }

    //18
    public void handleSaveAll(ActionEvent actionEvent) {

        //saves every to do list and items to external drive
    }


    //19 and 20
    public void handleExistingEL(ActionEvent actionEvent) {
        //loads one or more to do list from external drive
        //Let user open .txt file
        //put list in the tableview of all lists
    }

    public void showLists(ActionEvent actionEvent) {
        //filter lists by searching in the textbox for it
    }
}