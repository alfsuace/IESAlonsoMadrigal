package com.alfsuace.iesAlonosoMadrigal.domain.models;

public class TeachingClassroom extends Classroom {

    private Integer chairs;
    private String boardsType;


    //getters y setters

    public Integer getChairs() {
        return chairs;
    }

    public void setChairs(Integer chairs) {
        this.chairs = chairs;
    }

    public String getBoardsType() {
        return boardsType;
    }

    public void setBoardsType(String boardsType) {
        this.boardsType = boardsType;
    }
}

