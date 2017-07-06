package com.example.mddanish.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by rahulranjansinha on 06-07-2017.
 */

public class SwapWithoutThirdVariable extends Activity {
    TextView tv;
    TextView tv2;

    public SwapWithoutThirdVariable()
    {
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.swapping_two_numbers);
        tv = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv.setText("public class SwapElementsWithoutThirdVariableExample {\n" +
                " \n" +
                "        public static void main(String[] args) {\n" +
                "               \n" +
                "                int num1 = 10;\n" +
                "                int num2 = 20;\n" +
                "               \n" +
                "                System.out.println(\"Before Swapping\");\n" +
                "                System.out.println(\"Value of num1 is :\" + num1);\n" +
                "                System.out.println(\"Value of num2 is :\" +num2);\n" +
                "               \n" +
                "                //add both the numbers and assign it to first\n" +
                "                num1 = num1 + num2;\n" +
                "                num2 = num1 - num2;\n" +
                "                num1 = num1 - num2;\n" +
                "               \n" +
                "                System.out.println(\"Before Swapping\");\n" +
                "                System.out.println(\"Value of num1 is :\" + num1);\n" +
                "                System.out.println(\"Value of num2 is :\" +num2);\n" +
                "        }\n" +
                " \n" +
                " \n" +
                "}");
        tv2.setText(Html.fromHtml((new StringBuilder("<b>Output:</b><br></br>")).append("<font color='#FFFFFF'>Before Swapping\n" +
                "Value of num1 is :10\n" +
                "Value of num2 is :20\n" +
                "Before Swapping\n" +
                "Value of num1 is :20\n" +
                "Value of num2 is :10<br></br></font>").append("<br></br><br></br><br></br><br></br><br></br>").toString()));
    }
}
