package com.example.quizappusing3activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radiogroup;
    private RadioButton radioButton;
    public static final String extra="1st question marks";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radiogroup=(RadioGroup)findViewById(R.id.radiogroupId);

    }

    public void nextbuttonfuntion(View view) {
        int num=0;
        int radioid= radiogroup.getCheckedRadioButtonId();
        radioButton=(RadioButton)findViewById(radioid);
        String text=radioButton.getText().toString();
        if(text.equals("many")){
            num=5;
        }
        Toast.makeText(this, " Your marks is "+num, Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,Secondactivity.class);
        intent.putExtra(extra,num);
        startActivity(intent);
    }
}