package com.example;



import java.sql.Date;


public class MoonMission {
    private int missionId;
    private String spacecraft;
    private Date launchDate;
    private String carrierRocket;
    private String operator;
    private String missionType;
    private String outcome;

    public MoonMission(int missionId, String spacecraft, Date launchDate,
                       String carrierRocket, String operator, String missionType, String outcome) {
        this.missionId = missionId;
        this.spacecraft = spacecraft;
        this.launchDate = launchDate;
        this.carrierRocket = carrierRocket;
        this.operator = operator;
        this.missionType = missionType;
        this.outcome = outcome;
    }


    public String getSpacecraft() {

        return spacecraft;
    }

    public Date getLaunchDate() {
        return launchDate;
    }

    public String getCarrier() {
        return carrierRocket;
    }

    public int getMissionId() {

        return missionId;
    }

    public String getMissionName() {
        return missionType;
    }

    public void setSpacecraft(String Spacecraft) {

    }

    public void setCarrier(String carrier) {

    }

    public void setOperator(String operator) {
    }

    public void setLaunchDate(Date launchDate) {

    }

    public void setMissionType(String missionType) {

    }

    public void setOutcome(String outcome) {

    }

}