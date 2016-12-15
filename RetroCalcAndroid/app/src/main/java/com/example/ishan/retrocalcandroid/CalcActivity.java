package com.example.ishan.retrocalcandroid;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class CalcActivity extends Activity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        Button oneBtn = (Button) findViewById(R.id.num1);
        Button twoBtn = (Button) findViewById(R.id.num2);
        Button threeBtn = (Button) findViewById(R.id.num3);
        Button fourBtn = (Button) findViewById(R.id.num4);
        Button fiveBtn = (Button) findViewById(R.id.num5);
        Button sixBtn = (Button) findViewById(R.id.num6);
        Button sevenBtn = (Button) findViewById(R.id.num7);
        Button eightBtn = (Button) findViewById(R.id.num8);
        Button nineBtn = (Button) findViewById(R.id.num9);
        Button zeroBtn = (Button) findViewById(R.id.num0);

        Button clearButton = (Button) findViewById(R.id.clearBtn);
        TextView resultView = (TextView) findViewById(R.id.resultsText);

        ImageButton calcBtn = (ImageButton) findViewById(R.id.calcButton);
        ImageButton multiplyBtn = (ImageButton) findViewById(R.id.multiplyBtn);
        ImageButton divideBtn = (ImageButton) findViewById(R.id.divideBtn);
        ImageButton addBtn = (ImageButton) findViewById(R.id.addBtn);
        ImageButton subtractBtn = (ImageButton) findViewById(R.id.subtractBtn);

        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
    }
}
