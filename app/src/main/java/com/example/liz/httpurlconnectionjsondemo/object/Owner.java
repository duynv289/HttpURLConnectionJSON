package com.example.liz.httpurlconnectionjsondemo.object;

public class Owner {
    private String mID;
    private String mLogin;

    public Owner() {
    }

    public Owner(String mID, String mLogin) {
        this.mID = mID;
        this.mLogin = mLogin;
    }

    public String getmID() {
        return mID;
    }

    public void setmID(String mID) {
        this.mID = mID;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "mID='" + mID + '\'' +
                ", mLogin='" + mLogin + '\'' +
                '}';
    }

    public String getmLogin() {
        return mLogin;
    }

    public void setmLogin(String mLogin) {
        this.mLogin = mLogin;
    }
}
