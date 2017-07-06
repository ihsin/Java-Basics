package com.example.mddanish.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by rahulranjansinha on 06-07-2017.
 */

public class LeapYear extends Activity{

    TextView tv;
    TextView tv2;

    public LeapYear()
    {
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.swapping_two_numbers);
        tv = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv.setText("public class DetermineLeapYearExample {\n" +
                " \n" +
                "        public static void main(String[] args) {\n" +
                "               \n" +
                "                //year we want to check\n" +
                "                int year = 2004;\n" +
                "               \n" +
                "                //if year is divisible by 4, it is a leap year\n" +
                "               \n" +
                "                if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))\n" +
                "                        System.out.println(\"Year \" + year + \" is a leap year\");\n" +
                "                else\n" +
                "                        System.out.println(\"Year \" + year + \" is not a leap year\");\n" +
                "        }\n" +
                "}");
        tv2.setText(Html.fromHtml((new StringBuilder("<b>Output:</b><br></br>")).append("<font color='#FFFFFF'>Year 2004 is a leap year<br></br></font>").append("<br></br><br></br><br></br><br></br><br></br>").toString()));
    }
}
