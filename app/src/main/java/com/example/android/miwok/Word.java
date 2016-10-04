package com.example.android.miwok;

/**
 * Created by batman on 10/1/16.
 */

public class Word {

    /**Default translation of the word */
    private String mDefaultTranslation;

    /**Miwok translation of the word */
    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /** Get the default translation of the word */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /** Get the Miwok translation of the word */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

}