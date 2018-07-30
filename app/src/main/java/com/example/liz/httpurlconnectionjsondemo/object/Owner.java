package com.example.liz.httpurlconnectionjsondemo.object;

public class Owner {
    private String mID;
    private String mLogin;

    public Owner() {
    }

    public Owner(String ID, String login) {
        mID = ID;
        mLogin = login;
    }

    public String getID() {
        return mID;
    }

    public void setID(String ID) {
        mID = ID;
    }

    public String getLogin() {
        return mLogin;
    }

    public void setLogin(String login) {
        mLogin = login;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "mID='" + mID + '\'' +
                ", mLogin='" + mLogin + '\'' +
                '}';
    }
}
