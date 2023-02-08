package com.alfsuace.iesAlonosoMadrigal.domain.models;

public class Pupil extends Person {
    private String mother;
    private String father;
    private String email;


    //Getters and Setters

    public String getMadre() {
        return mother;
    }

    public void setMadre(String madre) {
        this.mother = madre;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
