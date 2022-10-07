package com.example.madlibskn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE1 = "com.example.myfirstapp.MESSAGEs";
    public static final String EXTRA_MESSAGE2 = "com.example.myfirstapp.MESSAGEss";
    public static final String EXTRA_MESSAGE3 = "com.example.myfirstapp.MESSAGEsss";
    public static final String EXTRA_MESSAGE4 = "com.example.myfirstapp.MESSAGEssss";
    public static final String EXTRA_MESSAGE5 = "com.example.myfirstapp.MESSAGEssssss";
    public static final String EXTRA_MESSAGE6 = "com.example.myfirstapp.MESSAGEsssssss";
    public static final String EXTRA_MESSAGE7 = "com.example.myfirstapp.MESSAGEssssssss";
    public static final String EXTRA_MESSAGE8 = "com.example.myfirstapp.MESSAGEsssssssss";
    public static final String EXTRA_MESSAGE9 = "com.example.myfirstapp.MESSAGEd";
    public static final String EXTRA_MESSAGE10 = "com.example.myfirstapp.MESSAGEdd";
    public static final String EXTRA_MESSAGE11 = "com.example.myfirstapp.MESSAGEddd";
    public static final String EXTRA_MESSAGE12 = "com.example.myfirstapp.MESSAGEdddd";
    public static final String EXTRA_MESSAGE13 = "com.example.myfirstapp.MESSAGEdddddd";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, MadLibsOut.class);

        EditText editText1 = (EditText) findViewById(R.id.eT1);
        EditText editText2 = (EditText) findViewById(R.id.eT2);
        EditText editText3 = (EditText) findViewById(R.id.eT3);
        EditText editText4 = (EditText) findViewById(R.id.eT4);
        EditText editText5 = (EditText) findViewById(R.id.eT5);
        EditText editText6 = (EditText) findViewById(R.id.eT6);
        EditText editText7 = (EditText) findViewById(R.id.eT7);
        EditText editText8 = (EditText) findViewById(R.id.eT8);
        EditText editText9 = (EditText) findViewById(R.id.eT9);
        EditText editText10 = (EditText) findViewById(R.id.eT10);
        EditText editText11 = (EditText) findViewById(R.id.eT11);
        EditText editText12 = (EditText) findViewById(R.id.eT12);
        EditText editText13 = (EditText) findViewById(R.id.eT13);


        String message1 = editText1.getText().toString();
        String message2 = editText2.getText().toString();
        String message3 = editText3.getText().toString();
        String message4 = editText4.getText().toString();
        String message5 = editText5.getText().toString();
        String message6 = editText6.getText().toString();
        String message7 = editText7.getText().toString();
        String message8 = editText8.getText().toString();
        String message9 = editText9.getText().toString();
        String message10 = editText10.getText().toString();
        String message11 = editText11.getText().toString();
        String message12 = editText12.getText().toString();
        String message13 = editText13.getText().toString();

        intent.putExtra(EXTRA_MESSAGE1, message1);
        intent.putExtra(EXTRA_MESSAGE2, message2);
        intent.putExtra(EXTRA_MESSAGE3, message3);
        intent.putExtra(EXTRA_MESSAGE4, message4);
        intent.putExtra(EXTRA_MESSAGE5, message5);
        intent.putExtra(EXTRA_MESSAGE6, message6);
        intent.putExtra(EXTRA_MESSAGE7, message7);
        intent.putExtra(EXTRA_MESSAGE8, message8);
        intent.putExtra(EXTRA_MESSAGE9, message9);
        intent.putExtra(EXTRA_MESSAGE10, message10);
        intent.putExtra(EXTRA_MESSAGE11, message11);
        intent.putExtra(EXTRA_MESSAGE12, message12);
        intent.putExtra(EXTRA_MESSAGE13, message13);

        startActivity(intent);
    }
}