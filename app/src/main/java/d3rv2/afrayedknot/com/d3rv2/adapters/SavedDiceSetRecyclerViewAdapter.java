package d3rv2.afrayedknot.com.d3rv2.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import d3rv2.afrayedknot.com.d3rv2.data.SavedDiceSetScrollViewHolder;
import d3rv2.afrayedknot.com.d3rv2.activities.R;

/**
 * Created by redna on 8/1/2017.
 */

public class SavedDiceSetRecyclerViewAdapter extends RecyclerView.Adapter<SavedDiceSetScrollViewHolder>{

    ArrayList<String> list;
    Context context;

    public SavedDiceSetRecyclerViewAdapter(ArrayList<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public SavedDiceSetScrollViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Inflate the layout, initialize the View Holder
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.dicelists, parent, false);
        SavedDiceSetScrollViewHolder holder = new SavedDiceSetScrollViewHolder(v);
        return holder;

    }

    @Override
    public void onBindViewHolder(SavedDiceSetScrollViewHolder holder, int position) {

        //Use the provided View Holder on the onCreateViewHolder method to populate the current row on the RecyclerView
        holder.name.setText(list.get(position));
        holder.diceSummary.setText(list.get(position));

    }

    @Override
    public int getItemCount() {
        //returns the number of elements the RecyclerView will display
        return list.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}
