package com.example;


import java.sql.SQLException;
import java.util.List;

public interface MoonMissionInterface {
    List<MoonMission> listAllMissions() throws SQLException;
    MoonMission findMoonMissionById(int missionId) throws SQLException;
    int countMissionsByYear(int year) throws SQLException;
}
