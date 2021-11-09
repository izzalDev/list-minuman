package com.rizal.listminuman;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recMinuman;

    private ArrayList<Data> listMinuman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recMinuman = findViewById(R.id.rec_minuman);
        initData();
        recMinuman.setAdapter(new DataAdapter(listMinuman));
        recMinuman.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData(){
        this.listMinuman = new ArrayList<>();
        listMinuman.add(new Data(
                "nama",
                "rating",
                "deskripsi",
                R.drawable.i1));
        listMinuman.add(new Data(
                "nama",
                "rating",
                "deskripsi",
                R.drawable.i1));
        listMinuman.add(new Data(
                "nama",
                "rating",
                "deskripsi",
                R.drawable.i1));
        listMinuman.add(new Data(
                "nama",
                "rating",
                "deskripsi",
                R.drawable.i1));
        listMinuman.add(new Data(
                "nama",
                "rating",
                "deskripsi",
                R.drawable.i1));
        listMinuman.add(new Data(
                "nama",
                "rating",
                "deskripsi",
                R.drawable.i1));
        listMinuman.add(new Data(
                "nama",
                "rating",
                "deskripsi",
                R.drawable.i1));
        listMinuman.add(new Data(
                "nama",
                "rating",
                "deskripsi",
                R.drawable.i1));
        listMinuman.add(new Data(
                "nama",
                "rating",
                "deskripsi",
                R.drawable.i1));
        listMinuman.add(new Data(
                "nama",
                "rating",
                "deskripsi",
                R.drawable.i1));
    }
}