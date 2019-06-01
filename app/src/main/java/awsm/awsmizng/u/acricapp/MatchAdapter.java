package awsm.awsmizng.u.acricapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

import awsm.awsmizng.u.acricapp.models.RetroMatches;

public class MatchAdapter extends RecyclerView.Adapter<MatchAdapter.CustomViewHolder> {
    private List<RetroMatches> matchList;

    public MatchAdapter(Context context, List<RetroMatches> list){
        matchList=list;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder{
        public final View myView;
        TextView tvMatch;
        View viewLeft, viewRight;
        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            myView=itemView;
            tvMatch=myView.findViewById(R.id.tvTeam1);
            viewLeft=myView.findViewById(R.id.viewLeft);
            viewRight=myView.findViewById(R.id.viewRight);
        }
    }
    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater= LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.match_row_layout, viewGroup, false);
        //TODO create row layout
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder viewHolder, final int i) {
        final RetroMatches retroMatches = matchList.get(i);
        viewHolder.itemView.setTag(retroMatches);
        viewHolder.tvMatch.setText(retroMatches.getTeam1() + " Vs " +retroMatches.getTeam2());

        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        viewHolder.viewLeft.setBackgroundColor(color);

        Random rnd2 = new Random();
        int color2 = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        viewHolder.viewRight.setBackgroundColor(color2);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MatchDetails.class);
                intent.putExtra("UniqueID", matchList.get(i).getUnqiue_id())
                        .putExtra("tossWinner",matchList.get(i).getTossWinner())
                        .putExtra("winner", matchList.get(i).getWinner())
                        .putExtra("matchStarted", matchList.get(i).getMatch_started())
                        .putExtra("date", matchList.get(i).getDate())
                        .putExtra("type", matchList.get(i).getType())
                ;
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return matchList.size();
    }
}
