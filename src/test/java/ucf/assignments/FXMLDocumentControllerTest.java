package ucf.assignments;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FXMLDocumentControllerTest {

    @org.junit.jupiter.api.Test
    void handleAboutAction() {

        //ensure when about button is clicked, it pops up txt file

    }

    @org.junit.jupiter.api.Test
    void handleKeyInput() {
        //ensure each button in menu bar selected is working
    }

    @org.junit.jupiter.api.Test
    void handlenewfileButtonAction() {

        //ensure new file is created and put into the listview

    }

    @org.junit.jupiter.api.Test
    void handleNewF() {

        //ensure new file when menu bar is clicked is created and put into list view
        //Compare list title created to expected title
    }

    @org.junit.jupiter.api.Test
    void handleDeleteL() {
        //check if list is deleted from listview
        //Check array of list to confirm it does not have list title
    }

    @org.junit.jupiter.api.Test
    void handleSaveas() {
        //change name of list and save txt file
        //compare saved txt file to expected txt file
    }

    @org.junit.jupiter.api.Test
    void handleNewI() {

        //create new item with title, description and due date
        //compare new item to expected item

    }

    @org.junit.jupiter.api.Test
    void handleDeleteI() {

        //create new item
        //use delete function to delete item
        // compare listview of tems before and after when item is deleted
    }


    @org.junit.jupiter.api.Test
    void handleEditI() {

        //edit selected item
        //change date or description
        //compare old item to edited item
        //compare expected output for the item
    }

    @org.junit.jupiter.api.Test
    void handlecheckbox() {
        //check some items on to do list
        //compare shown data to expected
    }

    @org.junit.jupiter.api.Test
    void handleExistingL() {

        //call previous list saved
        //compare listview object to expected listview
    }

    @org.junit.jupiter.api.Test
    void handleSave() {

        //compare current name of list txt saved with expected list txt saved
    }

    @org.junit.jupiter.api.Test
    void handleExit() {

        //test button quits application
    }

    @org.junit.jupiter.api.Test
    void showCompletedTasks() {
    }

    @org.junit.jupiter.api.Test
    void handleSaveAll() {
        //save all lists
        //check if they are formmatted and named correctly
        //compare expected lists to be saved with the ones saved
    }

    @org.junit.jupiter.api.Test
    void handleExistingEL() {
        //call previous list saved
        //compare listview object to expected listview
    }

    @org.junit.jupiter.api.Test
    void showLists() {

        //compare current listview to the listview when list is filtered by search bar
    }
}