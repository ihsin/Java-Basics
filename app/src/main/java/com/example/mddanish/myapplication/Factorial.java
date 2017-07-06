package com.example.mddanish.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by rahulranjansinha on 06-07-2017.
 */

public class Factorial extends Activity{
    TextView tv;
    TextView tv2;

    public Factorial()
    {
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.factorial);
        tv = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv.setText("class FactorialExample{  \n" +
                " public static void main(String args[]){  \n" +
                "  int i,fact=1;  \n" +
                "  int number=5;//It is the number to calculate factorial    \n" +
                "  for(i=1;i<=number;i++){    \n" +
                "      fact=fact*i;    \n" +
                "  }    \n" +
                "  System.out.println(\"Factorial of \"+number+\" is: \"+fact);    \n" +
                " }  \n" +
                "}  ");
        tv2.setText(Html.fromHtml((new StringBuilder("<b>Output:</b><br></br>")).append("<font color='#FFFFFF'>Factorial of 5 is: 120<br></br></font>").append("<br></br><br></br><br></br><br></br><br></br>").toString()));
    }
}
