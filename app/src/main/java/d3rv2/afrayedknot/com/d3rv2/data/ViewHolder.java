import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import d3rv2.afrayedknot.com.d3rv2.activities.R;

/**
 * Created by redna on 8/1/2017.
 */

public class ViewHolder extends RecyclerView.ViewHolder {

    TextView title;
    TextView description;
    ImageView imageView;

    ViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.title);
        description = (TextView) itemView.findViewById(R.id.description);
        imageView = (ImageView) itemView.findViewById(R.id.imageView);
    }
}
