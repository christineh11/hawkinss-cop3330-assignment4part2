package ucf.assignments;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Christine Hawkins
 */

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

//creates new item in to do list array

public class Item {


    private final SimpleStringProperty Title = new SimpleStringProperty("");
    private final SimpleStringProperty Description = new SimpleStringProperty("");
    private final SimpleStringProperty Duedate = new SimpleStringProperty("");
    private final SimpleStringProperty Complete = new SimpleStringProperty("");




    public Item() {
        this("", "", "","");
    }

    public Item(String Title, String Description, String Duedate, String Complete) {
        setTitle(Title);
        setDescription(Description);
        setDuedate(Duedate);
        setComplete(Complete);
    }

    public String getTitle() {
        return Title.get();
    }

    public void setTitle(String t) {
        Title.set(t);
    }

    public String getComplete() {
        return Complete.get();
    }

    public void setComplete(String c) {
        Complete.set(c);
    }

    public String getDescription() {
        return Description.get();
    }

    public void setDescription(String D) {
        Description.set(D);
    }

    public String getDuedate() {
        return Duedate.get();
    }

    public void setDuedate(String DD) {
        Duedate.set(DD);
    }




}

