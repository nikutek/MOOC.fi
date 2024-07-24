
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class Game {

    private String homeTeam;
    private String visitingTeam;
    private int homeTeamPoints;
    private int visitingTeamPoints;

    public Game(String homeTeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.visitingTeamPoints = visitingTeamPoints;
    }

    public String toString() {
        return homeTeam + ", " + visitingTeam + ", " + homeTeamPoints + ", " + visitingTeamPoints;
    }

    public ArrayList getTeams() {
        ArrayList<String> teams = new ArrayList<>();
        teams.add(homeTeam);
        teams.add(visitingTeam);
        return teams;
    }

    public String getWinner() {
        if (this.homeTeamPoints > this.visitingTeamPoints) {
            return this.homeTeam;
        } else if (this.visitingTeamPoints > this.homeTeamPoints) {
            return this.visitingTeam;
        } else {
            return "Draw";
        }
    }

}
