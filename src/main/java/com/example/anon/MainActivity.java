package com.example.anon;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.hbb20.CountryCodePicker;


public class MainActivity extends AppCompatActivity {
    String y;
    String Number;
    EditText NumberInput;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        CountryCodePicker ccp;

        ccp = (CountryCodePicker) findViewById(R.id.ccp);
        NumberInput = (EditText) findViewById(R.id.NumberInput);

        y = ccp.getFullNumber();

    }

    public void sendMessage(View view)
    {
        Number = NumberInput.getText().toString();
        Uri webpage = Uri.parse("https://wa.me/"+ y + Number);
        Intent myWebLink = new Intent(Intent.ACTION_VIEW, webpage);
        //myWebLink.setData(Uri.parse("https://wa.me/"+ y + Number ));
        myWebLink.setPackage("com.whatsapp");
        startActivity(myWebLink);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.example_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.item1)
        {
            Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
            myWebLink.setData(Uri.parse("https://darthvardaan.github.io/anon.io/" ));
            startActivity(myWebLink);
            return true;
        }

        else
        if (id == R.id.item2)
        {
            Toast.makeText(this, "Feature will be added soon!", Toast.LENGTH_SHORT).show();
            return true;
        }

        else
        if (id == R.id.item3)
        {
            Intent intent= new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
            return true;
        }

        else
        if (id == R.id.item4)
        {
            Toast.makeText(this, "Feature will be added soon!", Toast.LENGTH_SHORT).show();
            return false;
        }
        return super.onOptionsItemSelected(item);

    }
}

