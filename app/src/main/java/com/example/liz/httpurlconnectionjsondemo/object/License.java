package com.example.liz.httpurlconnectionjsondemo.object;

public class License {
    private String mKey;
    private String mName;

    public License() {
    }

    public License(String mKey, String mName) {
        this.mKey = mKey;
        this.mName = mName;
    }

    public String getmKey() {
        return mKey;
    }

    public void setmKey(String mKey) {
        this.mKey = mKey;
    }


    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    @Override
    public String toString() {
        return "License{" +
                "mKey='" + mKey + '\'' +
                ", mName='" + mName + '\'' +
                '}';
    }
}
