package com.example.liz.httpurlconnectionjsondemo.object;

public class Owner {
    private String mId;
    private String mLogin;

    public Owner() {
    }

    public Owner(String ID, String login) {
        mId = ID;
        mLogin = login;
    }

    public String getID() {
        return mId;
    }

    public void setID(String ID) {
        mId = ID;
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
                "mID='" + mId + '\'' +
                ", mLogin='" + mLogin + '\'' +
                '}';
    }
}
