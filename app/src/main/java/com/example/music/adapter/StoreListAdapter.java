package com.example.music.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.music.R;
import com.example.music.data.StoreData;
import com.example.music.ui.activity.BaseActivity;
import com.example.music.ui.fragment.home.PlaySongFragment;
import com.example.music.utilities.HelperMethod;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StoreListAdapter extends RecyclerView.Adapter<StoreListAdapter.ViewHolder> {

    private Context mContext;
    private BaseActivity mActivity;
    private List<StoreData> mSongsDataList = new ArrayList<>();

    public StoreListAdapter(Activity mActivity, List<StoreData> mSongsDataList) {
        this.mContext = mActivity;
        this.mActivity = (BaseActivity) mActivity;
        this.mSongsDataList = mSongsDataList;
    }

    @Override
    public StoreListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_store,
                parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        setData(holder, position);
        setAction(holder, position);
    }

    private void setData(ViewHolder holder, int position) {
        holder.imageMusic.setImageResource(mSongsDataList.get(position).getSongImageId());
        holder.textMusicName.setText(mSongsDataList.get(position).getSongTitle());
        holder.textMusicAuthorName.setText(mSongsDataList.get(position).getSongAuthorName());
    }

    private void setAction(ViewHolder holder, int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PlaySongFragment playSongFragment =
                        new PlaySongFragment(mSongsDataList.get(position).getSongTitle(), mSongsDataList.get(position).getSongImageId());
                HelperMethod.replaceFragment(mActivity.getSupportFragmentManager(), R.id.frame_home_fragment_container, playSongFragment);

            }
        });
    }

    @Override
    public int getItemCount() {
        return mSongsDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private View view;

        @BindView(R.id.image_music)
        ImageView imageMusic;
        @BindView(R.id.text_music_name)
        TextView textMusicName;
        @BindView(R.id.text_music_author_name)
        TextView textMusicAuthorName;

        public ViewHolder(View itemView) {
            super(itemView);
            view = itemView;
            ButterKnife.bind(this, view);
        }
    }
}
