package com.example.surveyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Singlechoice.SingleChoiceListener {
        TextView textView, textview2;
        Button btn, btnn2;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                textView = findViewById(R.id.texnn1);

                btn = findViewById(R.id.btnn1);
                btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                DialogFragment singlechoice = new Singlechoice();
                                singlechoice.setCancelable(false);
                                singlechoice.show(getSupportFragmentManager(), "singlechoice dalouge");
                        }
                });
                // for second button
                btnn2 = findViewById(R.id.btnn2);
                btnn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                Intent abc = new Intent(MainActivity.this, listactivity.class);
                                startActivity(abc);


                        }

                });
        }


        @Override
        public void onPositiveButtonClicked(String[] list, int position) {
                textView.setText("Survey Level=" + list[position]);
        }
        @Override
        public void onNegativeButtonClicked() {
                textView.setText("dialaouge canclled");
        }


}