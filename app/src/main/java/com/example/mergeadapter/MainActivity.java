package com.example.mergeadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.MergeAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.mergeadapter.adpter.FirstAdapter;
import com.example.mergeadapter.adpter.SecondAdapter;
import com.example.mergeadapter.adpter.ThirdAdapter;
import com.example.mergeadapter.moder.First;
import com.example.mergeadapter.moder.Second;
import com.example.mergeadapter.moder.Third;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvData;
    FirstAdapter firstAdapter;
    SecondAdapter secondAdapter;
    ThirdAdapter thirdAdapter;

    List<First> firstList;
    List<Second> secondList;
    List<Third> thirdList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcvData = findViewById(R.id.rcvData);

        firstList = new ArrayList<>(); First first = new First();firstList.add(first);
        secondList = new ArrayList<>(); Second second = new Second();

        for (int i = 0; i <10 ; i++) {
            second.setBody("Tuấn Anh");
            secondList.add(second);
        }


        thirdList = new ArrayList<>();  Third third = new Third();  thirdList.add(third);

        firstAdapter = new FirstAdapter(firstList,this);
        secondAdapter = new SecondAdapter(secondList,this);
        thirdAdapter = new ThirdAdapter(thirdList,this);

        MergeAdapter mergeAdapter = new MergeAdapter(firstAdapter,secondAdapter,thirdAdapter);
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvData.setLayoutManager(layoutManager1);
        rcvData.setAdapter(mergeAdapter);


    }
}