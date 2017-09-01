package d3rv2.afrayedknot.com.d3rv2.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import d3rv2.afrayedknot.com.d3rv2.adapters.DiceSetSaverRecyclerViewAdapter;
import d3rv2.afrayedknot.com.d3rv2.data.PossibleDiceTypes;

public class DiceSetSaverActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    RecyclerView.Adapter mDiceSetSaverRecyclerViewAdapter;
    RecyclerView.LayoutManager recyclerViewLayoutManager;

    ArrayList<String> mDiceSides = PossibleDiceTypes.getDiceSidesString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_set_saver);
        context = getApplicationContext();
        recyclerView = (RecyclerView) findViewById(R.id.dice_set_saver_recycler);
        recyclerViewLayoutManager = new LinearLayoutManager(context);

        recyclerView.setLayoutManager(recyclerViewLayoutManager);

        mDiceSetSaverRecyclerViewAdapter = new DiceSetSaverRecyclerViewAdapter(mDiceSides,this);

        recyclerView.setAdapter(mDiceSetSaverRecyclerViewAdapter);

    }
}
