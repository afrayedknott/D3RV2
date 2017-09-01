package d3rv2.afrayedknot.com.d3rv2.data;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import d3rv2.afrayedknot.com.d3rv2.activities.R;

/**
 * Created by redna on 8/1/2017.
 */

public class DiceSetSaverScrollViewHolder extends RecyclerView.ViewHolder {

    public TextView diceSides;
    public TextView diceCount;
    public TextView diceAdd;
    public TextView diceRemove;

    public DiceSetSaverScrollViewHolder(View itemView) {
        super(itemView);
        diceSides = (TextView) itemView.findViewById(R.id.dice_sides_text_view);
        diceCount = (TextView) itemView.findViewById(R.id.dice_count_text_view);
        diceAdd = (TextView) itemView.findViewById(R.id.dice_add_clickable_text_view);
        diceRemove = (TextView) itemView.findViewById(R.id.dice_removal_clickable_text_view);
    }
}
