package com.example.music.ui.fragment.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.music.R;
import com.example.music.ui.fragment.BaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlaySongFragment extends BaseFragment {

    @BindView(R.id.text_toolbar)
    TextView textToolbar;
    @BindView(R.id.image_music)
    ImageView imageMusic;

    private String mSongTitle;
    private int mSongImage;

    public PlaySongFragment(String mSongTitle, int mSongImage) {
        this.mSongTitle = mSongTitle;
        this.mSongImage = mSongImage;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_play_song, container, false);
        ButterKnife.bind(this, view);
        initFragment();

        //to make bottom navigation at home activity invisible
        getActivity().findViewById(R.id.bottom_home).setVisibility(View.GONE);

        return view;
    }

    @OnClick({R.id.image_back_toolbar, R.id.button_back, R.id.button_play, R.id.button_next})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.image_back_toolbar:
                onBack();
                break;
            case R.id.button_back:
                break;
            case R.id.button_play:
                break;
            case R.id.button_next:
                break;
        }
    }

    @Override
    public void onBack() {
        //to make bottom navigation at home activity visible
        getActivity().findViewById(R.id.bottom_home).setVisibility(View.VISIBLE);
        super.onBack();
    }
}
