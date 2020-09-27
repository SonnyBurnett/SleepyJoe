package com.example.sleepyjoe;

import android.media.MediaPlayer;

public class JoeObject {


//
// Name:    JoeObject
// Purpose: Handle the datamodel
// Author:  Taco Bakker
// Date:    12-09-2020
//
    private int mJoePicture;
    private int mJoeSound;
    private String mJoeTitle1;
    private String mJoeTitle2;


    public JoeObject(int mJoePicture, int mJoeSound, String mJoeTitle1, String mJoeTitle2) {
        this.mJoePicture = mJoePicture;
        this.mJoeSound = mJoeSound;
        this.mJoeTitle1 = mJoeTitle1;
        this.mJoeTitle2 = mJoeTitle2;
    }

    public int getmJoePicture() {
        return mJoePicture;
    }

    public void setmJoePicture(int mJoePicture) {
        this.mJoePicture = mJoePicture;
    }

    public int getmJoeSound() {
        return mJoeSound;
    }

    public void setmJoeSound(int mJoeSound) {
        this.mJoeSound = mJoeSound;
    }

    public String getmJoeTitle1() {
        return mJoeTitle1;
    }

    public void setmJoeTitle1(String mJoeTitle1) {
        this.mJoeTitle1 = mJoeTitle1;
    }

    public String getmJoeTitle2() {
        return mJoeTitle2;
    }

    public void setmJoeTitle2(String mJoeTitle2) {
        this.mJoeTitle2 = mJoeTitle2;
    }

}
