package com.nasirbashak007gmail.colorchange;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


import e.nasirbashak.backgroungcolorchange.ChangeColor;

public class MainActivity extends AppCompatActivity {

    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextView = (TextView) findViewById(R.id.textView);

        test();
    }


    public void test() {

        ChangeColor changeColor = new ChangeColor();


        changeColor.changeBackgroundColor(myTextView, "03FBFF", "FF7803");//without delay default is 225ms
        changeColor.changeBackgroundColor(myTextView, "03FBFF", "FF7803", 500);// with delay


        String s = changeColor.generateTheColorCode();
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();
    }
}
