package com.example.quizappusing3activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Secondactivity extends AppCompatActivity {
   public int num=0;
   public RadioGroup radioGroup;
   public RadioButton radioButton;
   public static final String NewExtra="From Question 2";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
         Intent getintent=getIntent();
         num = getintent.getIntExtra(MainActivity.extra,0);
        radioGroup=(RadioGroup)findViewById(R.id.radiogroup2Id);
    }

    public void submitbuttonfuntion(View view) {
        int num2 = 0;
        int radioid = radioGroup.getCheckedRadioButtonId();
        radioButton = (RadioButton) findViewById(radioid);
        String text = radioButton.getText().toString();
        if (text.equals("C- A and B")) {
            num2 = 5;
        }
        num=num+num2;
        Toast.makeText(this, " Your marks is "+num2, Toast.LENGTH_SHORT).show();
        Intent intant=new Intent(this,Thirdactivity.class);
        intant.putExtra(NewExtra,num);
        startActivity(intant);

        }
    }