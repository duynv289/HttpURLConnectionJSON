package com.example.liz.httpurlconnectionjsondemo.object;


public class Repo {
    private String mId;
    private String mName;
    private Owner mOwner;
    private License mLicense;

    public Repo() {
    }

    public Repo(String mId, String mName, Owner mOwner, License mLicense) {
        this.mId = mId;
        this.mName = mName;
        this.mOwner = mOwner;
        this.mLicense = mLicense;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public Owner getmOwner() {
        return mOwner;
    }

    public void setmOwner(Owner mOwner) {
        this.mOwner = mOwner;
    }

    public License getmLicense() {
        return mLicense;
    }

    public void setmLicense(License mLicense) {
        this.mLicense = mLicense;
    }

    @Override
    public String toString() {
        return "Repo{" +
                "mId='" + mId + '\'' +
                ", mName='" + mName + '\'' +
                ", mOwner=" + mOwner +
                ", mLicense=" + mLicense +
                '}';
    }
}
