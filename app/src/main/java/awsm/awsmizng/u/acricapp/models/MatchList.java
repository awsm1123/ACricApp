package awsm.awsmizng.u.acricapp.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class MatchList {
    @SerializedName("matches")
    private ArrayList<RetroMatches> matches;

    public ArrayList<RetroMatches> getMatches() {
        return matches;
    }

    public void setMatches(ArrayList<RetroMatches> matches) {
        this.matches = matches;
    }
}
