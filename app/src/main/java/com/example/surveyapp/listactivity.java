package com.example.surveyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class listactivity extends AppCompatActivity {
    ListView listView;

    String abc;
    // list click
    TextView  textview2 ,textView3;
    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listactivity);
//listclick
        textview2=findViewById(R.id.txnn2);
        textView3=findViewById(R.id.textView33);
        //listclick
        String[] abc = {"Level 1","Level 2","Level 3","Level 4"};
        listView = findViewById(R.id.list1);
        ArrayAdapter arrayAdapter = new ArrayAdapter<>(listactivity.this, android.R.layout.simple_list_item_1, abc);
        listView.setAdapter(arrayAdapter);
        listView.deferNotifyDataSetChanged();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0)
                {
                 textview2.setText(abc[i]);
                 textView3.setText("instrction of level1");
                } else if (i==1) {
                    textview2.setText(abc[i]);
                    textView3.setText("instrction of level2");
                }else if (i==2){
                    textview2.setText(abc[i]);
                    textView3.setText("instrction of level3");
                } else if (i==3) {
                    textview2.setText(abc[i]);
                    textView3.setText("instrction of level4");
                }
            }
        });
          // printlist(abc);

    }



    //for list clicked
   /* void printlist(String[] abc){

        textview2.setText("selected item="+abc);

    }*/
}