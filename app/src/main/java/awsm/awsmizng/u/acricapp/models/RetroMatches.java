package awsm.awsmizng.u.acricapp.models;

import com.google.gson.annotations.SerializedName;

public class RetroMatches {

 /*   @SerializedName("name")
    private String name;


    public RetroMatches(String name) {
        this.name = name;

    }

    public String getUser() {
        return name;
    }

    public void setUser(String name) {
        this.name = name;
    } */

    @SerializedName("unqiue_id")
    private String unqiue_id;

    @SerializedName("team-1")
    private String team1;

    @SerializedName("team-2")
    private String team2;

    @SerializedName("matchStarted")
    private String match_started;

    @SerializedName("winner_team")
    private String winner;

    @SerializedName("toss_winner_team")
    private String tossWinner;

    @SerializedName("date")
    private String date;

    @SerializedName("type")
    private String type;

    public RetroMatches(String unqiue_id, String team1, String team2, String match_started, String winner, String tossWinner, String date, String type) {
        this.unqiue_id = unqiue_id;
        this.team1 = team1;
        this.team2 = team2;
        this.match_started = match_started;
        this.winner = winner;
        this.tossWinner = tossWinner;
        this.date = date;
        this.type = type;
    }

    public String getUnqiue_id() {
        return unqiue_id;
    }

    public void setUnqiue_id(String unqiue_id) {
        this.unqiue_id = unqiue_id;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getMatch_started() {
        return match_started;
    }

    public void setMatch_started(String match_started) {
        this.match_started = match_started;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getTossWinner() {
        return tossWinner;
    }

    public void setTossWinner(String tossWinner) {
        this.tossWinner = tossWinner;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
