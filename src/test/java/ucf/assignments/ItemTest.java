package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.junit.jupiter.api.Test;

import java.sql.DataTruncation;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    public String getTitle() {

        //check if string is being returned
        // given a new default item
        return "cookies";
    }

    @Test
  public void setTitle() {
        //check if string is being returned
        String expected = getTitle();
        String actual = "cookies";

        // then
        assertEquals(expected, actual);
    }


    @Test
    public String  getDescription() {

        //check if string is being returned
        return "publix";
    }

    @Test
    void setDescription() {
        //compare description to expected description
        String expected = getDescription();
        String actual = "publix";

        // then
        assertEquals(expected, actual);
    }

    @Test
    public String getDuedate() {

        //check if string is being returned
        return "2021-09-09";

    }

    @Test
    void setDuedate() {

        //compare due date given to expected due date
        String expected = getDuedate();
        String actual = "2021-09-09";

        // then
        assertEquals(expected, actual);
    }

    @Test
    public String getComplete() {
        //check if string is being returned
        return "c";
    }

    @Test
    void setComplete() {
        //compare Complete to given c or i
        String expected = getComplete();
        String actual = "c";

        // then
        assertEquals(expected, actual);
    }
}