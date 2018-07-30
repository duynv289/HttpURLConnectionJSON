package com.example.liz.httpurlconnectionjsondemo.object;


public class Repo {
    private String mId;
    private String mName;
    private Owner mOwner;
    private License mLicense;

    public Repo() {
    }

    public Repo(String id, String name, Owner owner, License license) {
        mId = id;
        mName = name;
        mOwner = owner;
        mLicense = license;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Owner getOwner() {
        return mOwner;
    }

    public void setOwner(Owner owner) {
        mOwner = owner;
    }

    public License getLicense() {
        return mLicense;
    }

    public void setLicense(License license) {
        mLicense = license;
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
