package com.example.liz.httpurlconnectionjsondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.liz.httpurlconnectionjsondemo.object.Repo;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements GetAPITask.OnLoadFinishedListener{

    private static final String URL_API = "https://api.github.com/users/google/repos";
    private RecyclerView mRecyclerView;
    private ObjectAdapter mObjectAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recycler_view);

        new GetAPITask(this).execute(URL_API);

    }


    @Override
    public void onLoadFinished(ArrayList<Repo> repo) {
        mObjectAdapter = new ObjectAdapter(repo);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mObjectAdapter);
    }
}
