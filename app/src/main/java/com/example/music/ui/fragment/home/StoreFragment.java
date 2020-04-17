package com.example.music.ui.fragment.home;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.music.R;
import com.example.music.adapter.StoreListAdapter;
import com.example.music.data.StoreData;
import com.example.music.ui.fragment.BaseFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StoreFragment extends BaseFragment {

    @BindView(R.id.recycler_songs)
    RecyclerView recyclerSongs;
    private ArrayList<StoreData> mSongList;
    private GridLayoutManager gridLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_store, container, false);

        initFragment();
        ButterKnife.bind(this, view);

        // to set recycler with list
        initialize();
        return view;
    }

    private void initialize() {
        mSongList = new ArrayList<StoreData>();
        gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerSongs.setLayoutManager(gridLayoutManager);
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                mSongList.add(new StoreData(getString(R.string.music_item_name),
                        getString(R.string.music_item_author_name),
                        R.drawable.ic_launcher_foreground));
            }
        }
        StoreListAdapter storeListAdapter = new StoreListAdapter(getActivity(), mSongList);
        recyclerSongs.setAdapter(storeListAdapter);
    }
}
