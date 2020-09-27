package com.example.sleepyjoe;
//
// Name:    MainActivity
// Purpose: Handle the MainActivity
// Author:  Taco Bakker
// Date:    12-09-2020
//
//
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public RecyclerView mRecyclerView;
    public JoeObjectAdapter mAdapter;
    final List<JoeObject> mJoeObjects = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initJoe();

        mRecyclerView = findViewById(R.id.joe_recyclerview);
        mRecyclerView.setHasFixedSize(true);
        mAdapter = new JoeObjectAdapter(this, mJoeObjects);
        mRecyclerView.setAdapter(mAdapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(layoutManager);

        mAdapter.setOnItemClickListener(new JoeObjectAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                final MediaPlayer joePlayer = MediaPlayer.create(getApplicationContext(), mJoeObjects.get(position).getmJoeSound());
                joePlayer.start();
            }
        });
    }

    private void initJoe() {
        mJoeObjects.add(new JoeObject(R.drawable.joe15,R.raw.joe1, "Why Why Why", "0:05"));
        mJoeObjects.add(new JoeObject(R.drawable.joe2,R.raw.joe2, "The thing", "0:02"));
        mJoeObjects.add(new JoeObject(R.drawable.joe3,R.raw.joe3, "Poor kids", "0:03"));
        mJoeObjects.add(new JoeObject(R.drawable.joe4,R.raw.joe4, "Senate", "0:04"));
        mJoeObjects.add(new JoeObject(R.drawable.joe5,R.raw.joe5, "Liar", "0:03"));
        mJoeObjects.add(new JoeObject(R.drawable.joe6,R.raw.joe6, "World War II", "0:21"));
        mJoeObjects.add(new JoeObject(R.drawable.joe7,R.raw.joe7, "Get it to people", "0:06"));
        mJoeObjects.add(new JoeObject(R.drawable.joe8,R.raw.joe8, "Telephone or camera", "0:08"));
        mJoeObjects.add(new JoeObject(R.drawable.joe9,R.raw.joe9, "Covid19 the whole thing", "0:13"));
        mJoeObjects.add(new JoeObject(R.drawable.joe10,R.raw.joe10, "Take a test", "0:05"));
        mJoeObjects.add(new JoeObject(R.drawable.joe11,R.raw.joe11, "Never ever", "0:22"));
        mJoeObjects.add(new JoeObject(R.drawable.joe12,R.raw.joe14, "No intercourse", "0:23"));

    }
}