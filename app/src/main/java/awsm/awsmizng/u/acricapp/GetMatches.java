package awsm.awsmizng.u.acricapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetMatches {
    @GET("matches/?apikey=gTJdcHeyEaZqvf0oO7QDJa8ShZW2") //matches?apikey=JUQuaCHs9yfYxcsT1InOJ1wOC9I3
    Call<MatchList> getAllMatches();
}
