package awsm.awsmizng.u.acricapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MatchAdapter extends RecyclerView.Adapter<MatchAdapter.CustomViewHolder> {
    private List<RetroMatches> matchList;

    public MatchAdapter(List<RetroMatches> list){
        matchList=list;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder{
        public final View myView;
        TextView tvMatch;
        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            myView=itemView;
            tvMatch=myView.findViewById(R.id.tvTeam1);
            //TODO findviewby id for textview from mmy view
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
    public void onBindViewHolder(@NonNull CustomViewHolder viewHolder, int i) {

        RetroMatches retroMatches = matchList.get(i);
        viewHolder.tvMatch.setText(retroMatches.getTeam1());
        //TODO set proper details here
    }

    @Override
    public int getItemCount() {
        return matchList.size();
    }
}
