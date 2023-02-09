package com.alfsuace.iesAlonosoMadrigal.domain.models;

public class Registration {
    private String id;
    private Pupil pupil;
    private Course course;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Pupil getPupil() {
        return pupil;
    }

    public void setPupil(Pupil pupil) {
        this.pupil = pupil;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

}
