package ucf.assignments;

import javafx.beans.property.SimpleStringProperty;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Christine Hawkins
 */

//creates new to do list
public class TodoList {

    private final SimpleStringProperty Name= new SimpleStringProperty("");


    public TodoList() {

        this("");
    }

    public TodoList(String NameofList) {
      setName(NameofList);

    }

    public String getName() {

       return Name.get();
  }

    public void setName(String n) {

        Name.set(n);
    }


 //   public String OutputS(List<ToDoList> Lists) {
        //StringBuilder Output

        //for(num of toDoLists)
            //outputFileString = "'title'\n"
            //for(amount of tasks in current to do list)
                //Output = "'duedate'" + "'description'"
            //Output = "\n"

        //return string

   // }




}