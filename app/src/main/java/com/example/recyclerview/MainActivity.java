package com.example.recyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    String[] myDataset = {
            "Apple", "Banana", "Orange", "Grape", "Strawberry",
            "Mango", "Pineapple", "Kiwi", "Blueberry", "Raspberry",
            "Lemon", "Lime", "Cherry", "Peach", "Plum"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.myRecyclerView);
        MyAdapter adapter = new MyAdapter(myDataset);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
