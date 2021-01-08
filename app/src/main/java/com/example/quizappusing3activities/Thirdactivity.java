package com.example.quizappusing3activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Thirdactivity extends AppCompatActivity {
    public TextView textview;
    public Button button;
    public static final String extra2=" Final answer";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdactivity);
        textview = (TextView) findViewById(R.id.resulttextid);
        button = (Button) findViewById(R.id.trybuttonid);
        Intent resultintent = getIntent();
        int result = resultintent.getIntExtra(Secondactivity.NewExtra, 0);
        textview.setText("you get " + result + " out of 10");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1;
                Intent intant=new Intent(Thirdactivity.this,MainActivity.class);
                startActivity(intant);
            }
        });


    }


}