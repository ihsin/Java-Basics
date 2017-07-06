package com.example.mddanish.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by rahulranjansinha on 06-07-2017.
 */

public class SwappingTwoNumbers extends Activity {
    TextView tv;
    TextView tv2;

    public SwappingTwoNumbers()
    {
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.swapping_two_numbers);
        tv = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv.setText(" import java.util.Scanner;\n" +
                " \n" +
                "class SwapNumbers\n" +
                "{\n" +
                "   public static void main(String args[])\n" +
                "   {\n" +
                "      int x, y, temp;\n" +
                "      System.out.println(\"Enter x and y\");\n" +
                "      Scanner in = new Scanner(System.in);\n" +
                " \n" +
                "      x = in.nextInt();\n" +
                "      y = in.nextInt();\n" +
                " \n" +
                "      System.out.println(\"Before Swapping\\nx = \"+x+\"\\ny = \"+y);\n" +
                " \n" +
                "      temp = x;\n" +
                "      x = y;\n" +
                "      y = temp;\n" +
                " \n" +
                "      System.out.println(\"After Swapping\\nx = \"+x+\"\\ny = \"+y);\n" +
                "   }\n" +
                "}");
        tv2.setText(Html.fromHtml((new StringBuilder("<b>Output:</b><br></br>")).append("<font color='#FFFFFF'>Before swap: x value: 10 y value: 20 After swap: x value: 20 y value: 10<br></br></font>").append("<br></br><br></br><br></br><br></br><br></br>").toString()));
    }
}
