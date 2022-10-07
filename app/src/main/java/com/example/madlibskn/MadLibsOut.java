package com.example.madlibskn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MadLibsOut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_libs_out);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message1 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE1);
        String message2 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE2);
        String message3 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE3);
        String message4 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE4);
        String message5 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE5);
        String message6 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE6);
        String message7 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE7);
        String message8 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE8);
        String message9 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE9);
        String message10 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE10);
        String message11 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE11);
        String message12 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE12);
        String message13 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE13);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView2);
        textView.setText(message1);
        TextView textView2 = findViewById(R.id.textView3);
        textView.setText(message2);
        TextView textView3 = findViewById(R.id.textView4);
        textView.setText(message3);
        TextView textView4 = findViewById(R.id.textView6);
        textView.setText(message4);
        TextView textView5 = findViewById(R.id.textView22);
        textView.setText(message5);
        TextView textView6 = findViewById(R.id.textView23);
        textView.setText(message5);
        TextView textView7 = findViewById(R.id.textView25);
        textView.setText(message6);
        TextView textView8 = findViewById(R.id.textView27);
        textView.setText(message5);
        TextView textView9 = findViewById(R.id.textView29);
        textView.setText(message6);
        TextView textView10 = findViewById(R.id.textView31);
        textView.setText(message7);
        TextView textView11 = findViewById(R.id.textView33);
        textView.setText(message8);
        TextView textView12 = findViewById(R.id.textView35);
        textView.setText(message9);
        TextView textView13 = findViewById(R.id.textView36);
        textView.setText(message8);
        TextView textView14 = findViewById(R.id.textView56);
        textView.setText(message10);
        TextView textView15 = findViewById(R.id.textView40);
        textView.setText(message5);
        TextView textView16 = findViewById(R.id.textView41);
        textView.setText(message11);
        TextView textView17 = findViewById(R.id.textView42);
        textView.setText(message12);
        TextView textView18 = findViewById(R.id.textView44);
        textView.setText(message5);
        TextView textView19 = findViewById(R.id.textView46);
        textView.setText(message5);
        TextView textView20 = findViewById(R.id.textView48);
        textView.setText(message13);
        TextView textView21 = findViewById(R.id.textView50);
        textView.setText(message5);
        TextView textView22 = findViewById(R.id.textView52);
        textView.setText(message8);
        TextView textView23 = findViewById(R.id.textView54);
        textView.setText(message8);
        TextView textView24 = findViewById(R.id.textView38);
        textView.setText(message10);

        //24
    }
}