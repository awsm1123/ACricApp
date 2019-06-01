package awsm.awsmizng.u.acricapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MatchDetails extends AppCompatActivity {

    static String id, winner, type, date, matchStarted, tossWinner;
    TextView tvwinner, tvtype, tvdate, tvmatchStarted, tvtossWinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_details);


        Intent intent = getIntent();
        id = intent.getStringExtra("UniqueID");
        winner = intent.getStringExtra("winner");
        tossWinner = intent.getStringExtra("tossWinner");
        matchStarted = intent.getStringExtra("matchStarted");
        type = intent.getStringExtra("type");
        date = intent.getStringExtra("date");

        tvdate = findViewById(R.id.tvDate);
        tvmatchStarted = findViewById(R.id.tvStarted);
        tvwinner = findViewById(R.id.tvWinner);
        tvtype = findViewById(R.id.tvType);
        tvtossWinner = findViewById(R.id.tvTossWinner);

        tvdate.setText("Date: " + date);
        tvmatchStarted.setText("Match Started: "+matchStarted);
        tvwinner.setText("Match Winner: "+winner);
        tvtossWinner.setText("Toss Winner: " + tossWinner);
        tvtype.setText("Match Type: "+type);


    }
}
