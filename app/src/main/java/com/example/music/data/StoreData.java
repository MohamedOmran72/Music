package com.example.music.data;

public class StoreData {
    private String mSongTitle;
    private String mSongAuthorName;
    private int mSongImageId;
    private int mPlayImageId;

    public StoreData(String mSongTitle, String mSongAuthorName, int mSongImageId, int mPlayImageId) {
        this.mSongTitle = mSongTitle;
        this.mSongAuthorName = mSongAuthorName;
        this.mSongImageId = mSongImageId;
        this.mPlayImageId = mPlayImageId;
    }

    public StoreData(String mSongTitle, String mSongAuthorName, int mSongImageId) {
        this.mSongTitle = mSongTitle;
        this.mSongAuthorName = mSongAuthorName;
        this.mSongImageId = mSongImageId;
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

    public int getPlayImageId() {
        return mPlayImageId;
    }

    public void setPlayImageId(int mPlayImageId) {
        this.mPlayImageId = mPlayImageId;
    }
}
