package com.nasirbashak007gmail.colorchange;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import e.nasirbashak.backgroungcolorchange.ChangeColor;

public class MainActivity extends AppCompatActivity {

    TextView myTextView1, myTextView2, myTextView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextView1 = (TextView) findViewById(R.id.textView1);
        myTextView2 = (TextView) findViewById(R.id.textView2);
        myTextView3 = (TextView) findViewById(R.id.textView3);

        test();
    }


    public void test() {

        ChangeColor changeColor = new ChangeColor(this);

        //preferably use ananymous objects , if not because of infinite loops the variable values gets overrided by next method arguments
        new ChangeColor(this).changeTextColor(myTextView1, "03FBFF", "FF7803");//without delay default is 225ms
        new ChangeColor(this).changeTextColor(myTextView2, "000000", "FFFFFF", 500);//with delay
        new ChangeColor(this).changeTextColor(myTextView3, "03FBFF", "FF7803", "FFEA", 500);//with step value

        new ChangeColor(this).changeBackgroundColor(myTextView1, "03ABFA", "FF7803");//without delay default is 225ms
        new ChangeColor(this).changeBackgroundColor(myTextView2, "03FBAA", "FF0003", 500);//with delay
        new ChangeColor(this).changeBackgroundColor(myTextView3, "03ABFA", "FF7803", "FFEA", 225);// with step value


        String s = changeColor.generateTheColorCode();
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();
    }
}
