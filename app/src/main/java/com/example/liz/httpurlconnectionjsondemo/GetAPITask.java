package com.example.liz.httpurlconnectionjsondemo;

import android.os.AsyncTask;
import android.util.Log;

import com.example.liz.httpurlconnectionjsondemo.object.License;
import com.example.liz.httpurlconnectionjsondemo.object.Owner;
import com.example.liz.httpurlconnectionjsondemo.object.Repo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class GetAPITask extends AsyncTask<String,Void,ArrayList<Repo>> {
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_OWNER = "owner";
    private static final String KEY_LOGIN_OWNER = "login";
    private static final String KEY_LICENSE = "license";
    private static final String KEY_KEY_LICENSE = "key";
    private static final String REQUEST_METHOD = "GET";
    private OnLoadFinishedListener mListener;

    public GetAPITask(OnLoadFinishedListener mListener) {
        this.mListener = mListener;
    }

    @Override
    protected ArrayList<Repo> doInBackground(String... strings) {
        StringBuilder sb = new StringBuilder();
        String api_url = strings[0];
        try {
            URL url = new URL(api_url);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod(REQUEST_METHOD);

            InputStreamReader in = new InputStreamReader(conn.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(in);
            String inputLine;
            while ((inputLine = bufferedReader.readLine()) != null){
                sb.append(inputLine);
            }
            bufferedReader.close();
            conn.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return getAPIFromResponse(sb.toString());
    }
    private ArrayList<Repo> getAPIFromResponse(String s){
        ArrayList<Repo> listAPI = new ArrayList<>();
        try {
            JSONArray jsonArray =  new JSONArray(s);
            for(int i = 0; i<jsonArray.length();i++){
                JSONObject repo = jsonArray.getJSONObject(i);
                String idrepo = repo.getString(KEY_ID);
                String namerepo = repo.getString(KEY_NAME);

                JSONObject owner = repo.getJSONObject(KEY_OWNER);
                String idowner = owner.getString(KEY_ID);
                String loginowner = owner.getString(KEY_LOGIN_OWNER);

                JSONObject license = repo.getJSONObject(KEY_LICENSE);
                String key = license.getString(KEY_KEY_LICENSE);
                String namelicense = license.getString(KEY_NAME);

                listAPI.add(new Repo(idrepo,namerepo,
                        new Owner(idowner,loginowner),
                        new License(key,namelicense)));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return listAPI;
    }

    @Override
    protected void onPostExecute(ArrayList<Repo> repos) {
        super.onPostExecute(repos);
        mListener.onLoadFinished(repos);
    }
    public interface OnLoadFinishedListener{
        void onLoadFinished(ArrayList<Repo> repo);
    }
}
