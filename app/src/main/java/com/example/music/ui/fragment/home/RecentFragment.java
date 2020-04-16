package com.example.music.ui.fragment.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.music.R;
import com.example.music.adapter.MusicListAdapter;
import com.example.music.data.SongData;
import com.example.music.ui.fragment.BaseFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


public class RecentFragment extends BaseFragment {

    @BindView(R.id.recycler_songs)
    RecyclerView recyclerSongs;
    private ArrayList<SongData> mSongList;
    private LinearLayoutManager linearLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recent, container, false);

        initFragment();
        ButterKnife.bind(this, view);

        // to set recycler with list
        initialize();
        return view;
    }

    private void initialize() {
        mSongList = new ArrayList<SongData>();
        linearLayoutManager = new  LinearLayoutManager(getActivity());
        recyclerSongs.setLayoutManager(linearLayoutManager);
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                mSongList.add(new SongData(getString(R.string.music_item_name),
                        getString(R.string.music_item_author_name),
                        (int) R.drawable.ic_playlist,true));
            }else {
                mSongList.add(new SongData(getString(R.string.music_item_name),
                        getString(R.string.music_item_author_name),
                        (int) R.drawable.ic_playlist,false));
            }
        }
        MusicListAdapter musicListAdapter=new MusicListAdapter(getActivity(),mSongList);
        recyclerSongs.setAdapter(musicListAdapter);
    }
}
