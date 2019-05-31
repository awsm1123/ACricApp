package awsm.awsmizng.u.acricapp;

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

    public RetroMatches(String unqiue_id, String team1, String team2, String match_started) {
        this.unqiue_id = unqiue_id;
        this.team1 = team1;
        this.team2 = team2;
        this.match_started = match_started;
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
}
