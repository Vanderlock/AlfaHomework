package Lesson13;

import java.util.List;

public class MissionReport {
    private String missionName;
    private List<Alien> capturedAliens;
    private int squadSize;


    public MissionReport(String missionName, List<Alien> capturedAliens, int squadSize) {
        this.missionName = missionName;
        this.capturedAliens = capturedAliens;
        this.squadSize = squadSize;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Миссия: ").append(missionName).append("\n");
        sb.append("Поймано пришельцев: ").append(capturedAliens.size()).append("\n");
        sb.append("Размер отряда: ").append(squadSize);
        return sb.toString();
    }
}
