package d3rv2.afrayedknot.com.d3rv2.data;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import d3rv2.afrayedknot.com.d3rv2.activities.R;

/**
 * Created by redna on 8/1/2017.
 */

public class SavedDiceSetScrollViewHolder extends RecyclerView.ViewHolder {

    public TextView name;
    public TextView diceSummary;

    public SavedDiceSetScrollViewHolder(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.dicesetnames_textview);
        diceSummary = (TextView) itemView.findViewById(R.id.dicesetsummaries_textview);
    }
}
