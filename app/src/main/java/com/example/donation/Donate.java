package com.example.donation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.NumberPicker;
import android.widget.ProgressBar;

public class Donate extends AppCompatActivity {

    private Button donateButton;
    private RadioGroup paymentMethod;
    private ProgressBar progressBar;
    private NumberPicker amountPicker;
    private int totalDonated = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);

        donateButton = (Button) findViewById(R.id.donateButton);
        paymentMethod = (RadioGroup) findViewById(R.id.paymentMethod);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        amountPicker = (NumberPicker) findViewById(R.id.amountPicker);

        amountPicker.setMinValue(0);
        amountPicker.setMaxValue(1000);

        progressBar.setMax(10000);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_donate,menu);
        return true;
    }

    public void donateButtonPressed(View view){

        int amount = amountPicker.getValue();
        int radioId = paymentMethod.getCheckedRadioButtonId();
        String method = radioId == R.id.payPal ? "payPal" : "Direct";

        totalDonated = totalDonated + amount;
        progressBar.setProgress(totalDonated);

        Log.v("Donate","Donate Pressed! with amount " + amount + ", method: " + method);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
