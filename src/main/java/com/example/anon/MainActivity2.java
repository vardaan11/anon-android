package com.example.anon;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView mtext= (TextView) findViewById(R.id.text);
        String text= "This app enables you to send WhatsApp messages directly to an unknown contact without facing the hassle of saving their contact info. Just select the country code and type the contact number of the person you want to contact, then press on chat.";

    }
}