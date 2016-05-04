package com.appenjoyer.progressbarrecyclerview;

import java.io.Serializable;

/**
 * Created by Joan on 27/12/2015.
 */
public class DataItems implements Serializable {


    private String Name;

    private String Surname;

    public DataItems() {

    }
    public DataItems(String Name, String Surname) {
        this.Name = Name;
        this.Surname = Surname;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

}
