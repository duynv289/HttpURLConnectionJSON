package com.example.liz.httpurlconnectionjsondemo.object;

public class License {
    private String mKey;
    private String mName;

    public License() {
    }

    public License(String key, String name) {
        mKey = key;
        mName = name;
    }

    public String getKey() {
        return mKey;
    }

    public void setKey(String key) {
        mKey = key;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    @Override
    public String toString() {
        return "License{" +
                "mKey='" + mKey + '\'' +
                ", mName='" + mName + '\'' +
                '}';
    }
}
