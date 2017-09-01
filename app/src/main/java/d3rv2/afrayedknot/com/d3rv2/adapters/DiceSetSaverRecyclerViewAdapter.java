package d3rv2.afrayedknot.com.d3rv2.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import d3rv2.afrayedknot.com.d3rv2.data.DiceSetSaverScrollViewHolder;
import d3rv2.afrayedknot.com.d3rv2.activities.R;

/**
 * Created by redna on 8/1/2017.
 */

public class DiceSetSaverRecyclerViewAdapter extends RecyclerView.Adapter<DiceSetSaverScrollViewHolder>{

    ArrayList<String> list;
    Context context;

    public DiceSetSaverRecyclerViewAdapter(ArrayList list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public DiceSetSaverScrollViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Inflate the layout, initialize the View Holder
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_dice_set_saver_recycler, parent, false);
        DiceSetSaverScrollViewHolder holder = new DiceSetSaverScrollViewHolder(v);
        return holder;

    }

    @Override
    public void onBindViewHolder(DiceSetSaverScrollViewHolder holder, int position) {

        //Use the provided View Holder on the onCreateViewHolder method to populate the current row on the RecyclerView
        holder.diceSides.setText(list.get(position));
        holder.diceCount.setText("0");
        holder.diceAdd.setText("+");
        holder.diceRemove.setText("-");

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
