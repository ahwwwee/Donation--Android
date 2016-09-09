package com.example.donation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.util.Log;

public class Donate extends AppCompatActivity {

    private Button donateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        donateButton = (Button)findViewById(R.id.donateButton);
        setContentView(R.layout.activity_donate);
        if(donateButton != null){
            Log.v("Donate", "Really got the donate button");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_donate,menu);
    }

}
