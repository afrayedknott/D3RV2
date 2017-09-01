package d3rv2.afrayedknot.com.d3rv2.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import d3rv2.afrayedknot.com.d3rv2.activities.R;
import d3rv2.afrayedknot.com.d3rv2.adapters.SavedDiceSetRecyclerViewAdapter;
import d3rv2.afrayedknot.com.d3rv2.data.PossibleDiceTypes;

/**
 * Created by redna on 7/23/2017.
 */

public class SavedDiceSetFragment extends Fragment {

    public RecyclerView recyclerView;
    public Context context;
    public RecyclerView.Adapter mDiceSetSaverRecyclerViewAdapter;
    public RecyclerView.LayoutManager recyclerViewLayoutManager;

    public ArrayList<String> mDiceSides = PossibleDiceTypes.getDiceSidesString();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.dicelists, container, false);

        // RecyclerView

        RecyclerView recyclerView;
        RecyclerView.LayoutManager recyclerViewLayoutManager;

        ArrayList<String> mDiceSides = PossibleDiceTypes.getDiceSidesString();

        recyclerView = (RecyclerView) view.findViewById(R.id.dicelists_recyclerview);
        recyclerViewLayoutManager = new LinearLayoutManager(getContext());

        recyclerView.setLayoutManager(recyclerViewLayoutManager);

        SavedDiceSetRecyclerViewAdapter mSavedDiceSetRecyclerViewAdapter = new SavedDiceSetRecyclerViewAdapter(mDiceSides,getContext());

        recyclerView.setAdapter(mDiceSetSaverRecyclerViewAdapter);

        return inflater.inflate(R.layout.dicelists, container, false);
    }
}
