package com.example.mddanish.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by rahulranjansinha on 06-07-2017.
 */

public class CompareTwoNumbers extends Activity{
    TextView tv;
    TextView tv2;

    public CompareTwoNumbers()
    {
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.compare_two_numbers);
        tv = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv.setText(" \n" +
                "public class CompareTwoNumbers {\n" +
                " \n" +
                "        public static void main(String[] args) {\n" +
                "               \n" +
                "                //declare two numbers to compare\n" +
                "                int num1 = 324;\n" +
                "                int num2 = 234;\n" +
                "               \n" +
                "                if(num1 > num2){\n" +
                "                        System.out.println(num1 + \" is greater than \" + num2);\n" +
                "                }\n" +
                "                else if(num1 < num2){\n" +
                "                        System.out.println(num1 + \" is less than \" + num2);\n" +
                "                }\n" +
                "                else{\n" +
                "                        System.out.println(num1 + \" is equal to \" + num2);\n" +
                "                }\n" +
                "        }\n" +
                "}\n" +
                "");
        tv2.setText(Html.fromHtml((new StringBuilder("<b>Output:</b><br></br>")).append("<font color='#FFFFFF'>324 is greater than 234<br></br></font>").append("<br></br><br></br><br></br><br></br><br></br>").toString()));
    }
}
