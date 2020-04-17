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

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PlayListsAdapter extends RecyclerView.Adapter<PlayListsAdapter.ViewHolder> {

    private Context mContext;
    private Activity mActivity;
    private List<StoreData> mSongsDataList = new ArrayList<>();

    public PlayListsAdapter(Activity mActivity, List<StoreData> mSongsDataList) {
        this.mContext = mActivity;
        this.mActivity = (BaseActivity) mActivity;
        this.mSongsDataList = mSongsDataList;
    }

    @Override
    public PlayListsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_playlists,
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
        holder.imagePlay.setImageResource(mSongsDataList.get(position).getPlayImageId());
        holder.textMusicName.setText(mSongsDataList.get(position).getSongTitle());
        holder.textMusicAuthorName.setText(mSongsDataList.get(position).getSongAuthorName());
    }

    private void setAction(ViewHolder holder, int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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
        @BindView(R.id.image_play)
        ImageView imagePlay;
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
