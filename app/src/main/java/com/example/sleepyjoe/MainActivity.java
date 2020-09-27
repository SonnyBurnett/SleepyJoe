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
        mJoeObjects.add(new JoeObject(R.drawable.joe2,R.raw.joe2, "The thing", "Joe Biden"));
        mJoeObjects.add(new JoeObject(R.drawable.joe3,R.raw.joe3, "Senate", "Joe Biden"));
        mJoeObjects.add(new JoeObject(R.drawable.joe4,R.raw.joe4, "Poor kids", "Joe Biden"));
        mJoeObjects.add(new JoeObject(R.drawable.joe5,R.raw.joe5, "Liar", "Joe Biden"));
        mJoeObjects.add(new JoeObject(R.drawable.joe2,R.raw.joe2, "The thing2", "Joe Biden"));
        mJoeObjects.add(new JoeObject(R.drawable.joe3,R.raw.joe3, "Senate2", "Joe Biden"));
        mJoeObjects.add(new JoeObject(R.drawable.joe4,R.raw.joe4, "Poor kids2", "Joe Biden"));
        mJoeObjects.add(new JoeObject(R.drawable.joe5,R.raw.joe5, "Liar2", "Joe Biden"));
        mJoeObjects.add(new JoeObject(R.drawable.joe2,R.raw.joe2, "The thing", "Joe Biden"));
        mJoeObjects.add(new JoeObject(R.drawable.joe3,R.raw.joe3, "Senate", "Joe Biden"));
        mJoeObjects.add(new JoeObject(R.drawable.joe4,R.raw.joe4, "Poor kids", "Joe Biden"));
        mJoeObjects.add(new JoeObject(R.drawable.joe5,R.raw.joe5, "Liar", "Joe Biden"));
        mJoeObjects.add(new JoeObject(R.drawable.joe2,R.raw.joe2, "The thing2", "Joe Biden"));
        mJoeObjects.add(new JoeObject(R.drawable.joe3,R.raw.joe3, "Senate2", "Joe Biden"));
        mJoeObjects.add(new JoeObject(R.drawable.joe4,R.raw.joe4, "Poor kids2", "Joe Biden"));
        mJoeObjects.add(new JoeObject(R.drawable.joe5,R.raw.joe5, "Liar2", "Joe Biden"));
    }
}