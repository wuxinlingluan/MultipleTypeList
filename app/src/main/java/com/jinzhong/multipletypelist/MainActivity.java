package com.jinzhong.multipletypelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRl;
    private List<String> datas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    private void initView() {
        mRl = (RecyclerView)findViewById(R.id.rl);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRl.setLayoutManager(layoutManager);
        MyAdapter adapter = new MyAdapter(datas);
        mRl.setAdapter(adapter);
    }

    private void initData() {
        datas = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            datas.add("hunao " + i);
        }
    }

}
