package com.alfsuace.iesAlonosoMadrigal.domain.models;

import java.util.Date;

public class Teacher extends Person {
    private String academicTitle;
    private Date registDate;


    //Getters and Setters

    public String getAcademicTitle() {
        return academicTitle;
    }

    public void setAcademicTitle(String academicTitle) {
        this.academicTitle = academicTitle;
    }

    public Date getRegistDate() {
        return registDate;
    }

    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }

}
