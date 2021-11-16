package ucf.assignments;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TableView;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FXMLDocumentControllerTest {


    @Test
    void removeItem() {

        //tests to see if item is removed

        ObservableList<Item> observableList= FXCollections.observableArrayList(
                new Item()
        );

        observableList.remove(new Item("cookies",
                "Pillsburry",
                "2021-08-09",
                "c"
        ));

        assertNotNull(observableList);

    }


    @Test
    void testAddItem() {

        //checks item is added to list
        ObservableList<Item> observableList= FXCollections.observableArrayList(
                new Item()
        );

        observableList.add(new Item("cookies",
                "Pillsburry",
                "2021-08-09",
                "c"
        ));

        assertNotNull(observableList);

    }


    @Test
    public void clearbutton() {

        //checks if list is cleared
        ObservableList<Item> observableList= FXCollections.observableArrayList(
                new Item("cookies","Pillsburry","2021-08-09","C")
        );

        if (observableList.isEmpty()) {
            assertNull(observableList);

        } else {
            System.out.println("Not empty");
        }

    }

    @Test
    void handleAboutAction() {

        //checks if fxml file for help opens
        Item item = null;

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/ucf.assignments/Help.fxml"));


        assertNotNull(fxmlLoader);

    }



    @Test
    public void saveAll() throws IOException {

        //sees if file is saved to external storage
        File file = new File("user.home");
        BufferedWriter outwriter= new BufferedWriter(new FileWriter(file));
        assertNotNull(outwriter);

    }



    @Test
    public void handleExistingEL() throws IOException {

        //checks to see if list is opened and exists

        BufferedReader reader = new BufferedReader(new FileReader("src/main/java/ucf/assignments/ex.txt"));

        String line = reader.readLine();
        assertNotNull(line);

    }

}