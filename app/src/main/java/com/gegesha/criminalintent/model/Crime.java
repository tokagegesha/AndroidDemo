package com.gegesha.criminalintent.model;

import java.util.UUID;

/**
 * Created by tornike on 17-Sep-16.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime() {
        this.mId = UUID.randomUUID();
    }

    /*
    * getter-setter
    */

    public UUID getmId() {
        return mId;
    }

    public void setmId(UUID mId) {
        this.mId = mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}
