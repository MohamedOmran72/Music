package com.example.music.data;

public class SongData {
    private String mSongTitle;
    private String mSongAuthorName;
    private int mSongImageId;
    private boolean mIsFavorite;

    public SongData(String mSongTitle, String mSongAuthorName, int mSongImageId, boolean mIsFavorite) {
        this.mSongTitle = mSongTitle;
        this.mSongAuthorName = mSongAuthorName;
        this.mSongImageId = mSongImageId;
        this.mIsFavorite = mIsFavorite;
    }

    public String getSongTitle() {
        return mSongTitle;
    }

    public void setSongTitle(String mSongTitle) {
        this.mSongTitle = mSongTitle;
    }

    public String getSongAuthorName() {
        return mSongAuthorName;
    }

    public void setSongAuthorName(String mSongAuthorName) {
        this.mSongAuthorName = mSongAuthorName;
    }

    public int getSongImageId() {
        return mSongImageId;
    }

    public void setSongImageId(int mSongImageId) {
        this.mSongImageId = mSongImageId;
    }

    public boolean getIsFavorite() {
        return mIsFavorite;
    }

    public void setIsFavorite(boolean mIsFavorite) {
        this.mIsFavorite = mIsFavorite;
    }
}
