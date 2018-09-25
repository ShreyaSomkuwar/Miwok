package com.example.android.miwok;

/**
 * Created by ASUS on 5/10/2017.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResId=HAS_NO_IMAGE;
    private int mAudioResID;
    private static final int HAS_NO_IMAGE=-1;

    public Word(String defaultTranslation, String miwokTranslation,int audioResId){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mAudioResID=audioResId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int resId,int audioResId){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResId=resId;
        mAudioResID=audioResId;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public int getmImageResId(){
        return mImageResId;
    }
    public boolean hasImage(){
        return mImageResId!=HAS_NO_IMAGE;
    }
    public int getmAudioResID(){
        return mAudioResID;
    }

}
