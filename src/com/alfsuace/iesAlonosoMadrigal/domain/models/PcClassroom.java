package com.alfsuace.iesAlonosoMadrigal.domain.models;

public class PcClassroom extends Classroom {

    private Integer pcNumber;
    private String pcType;


    //getters y setters

    public Integer getPcNumber() {
        return pcNumber;
    }

    public void setPcNumber(Integer pcNumber) {
        this.pcNumber = pcNumber;
    }

    public String getPcType() {
        return pcType;
    }

    public void setPcType(String pcType) {
        this.pcType = pcType;
    }
}
