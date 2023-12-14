package com.hzw.company.model;

public class Position {
    // 职务ID
    private String positionId;
    private String positionName;

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Position() {

    }

    public Position(String positionId, String positionName) {
        this.setPositionId(positionId);
        this.setPositionName(positionName);
    }
}
