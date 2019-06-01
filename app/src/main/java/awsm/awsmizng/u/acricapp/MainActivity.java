package awsm.awsmizng.u.acricapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

import awsm.awsmizng.u.acricapp.iterfaces.GetMatches;
import awsm.awsmizng.u.acricapp.models.MatchList;
import awsm.awsmizng.u.acricapp.models.RetroMatches;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ArrayList<RetroMatches> matchList;
    private MatchAdapter matchAdapter;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetMatches service = RetrofitClient.getRetrofitInstance().create(GetMatches.class);
        Call<MatchList> call = service.getAllMatches();

        call.enqueue(new Callback<MatchList>() {
            @Override
            public void onResponse(Call<MatchList> call, Response<MatchList> response) {
                matchList = response.body().getMatches();
                loadDataList(matchList);
            }

            @Override
            public void onFailure(Call<MatchList> call, Throwable t) {

            }
        });
      /*  call.enqueue(new Callback<List<RetroMatches>>() {
            @Override
            public void onResponse(Call<List<RetroMatches>> call, Response<List<RetroMatches>> response) {
                loadDataList(response.body());
            }

            @Override
            public void onFailure(Call<List<RetroMatches>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "F", Toast.LENGTH_SHORT).show();
            }
        });  */
    }

    private void loadDataList(List<RetroMatches> usersList) {

        recyclerView = findViewById(R.id.matchRecyclerView);
        matchAdapter = new MatchAdapter(getApplication(), usersList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(matchAdapter);
    }
}
