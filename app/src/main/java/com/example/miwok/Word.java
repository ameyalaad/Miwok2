package com.example.miwok;

import android.media.MediaPlayer;

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceID=NO_IMAGE_PROVIDED;

    private static int NO_IMAGE_PROVIDED=-1;

    private int mAudioResourceID;

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int audioResourceID){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceID=imageResourceID;
        mAudioResourceID=audioResourceID;
    }

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mAudioResourceID=audioResourceID;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceID(){return mImageResourceID;}

    public boolean hasImage(){
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceID(){ return mAudioResourceID;};
}
