package com.buzz_ht.basiccalci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.awt.font.TextAttribute;

public class ResultActivity extends AppCompatActivity {

    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        text1 = findViewById(R.id.text1);
        Intent i = getIntent();
        String a = i.getStringExtra("first");
        String b= i.getStringExtra("second");
        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);

        int add = a1+b1;
        int sub=  a1-b1;
        int mul= a1* b1;
        int div = a1/b1;
        text1.setText("For " + a1 + " & " +b1 + "\nAddition = " + add + "\nSubtraction = " + sub + "\nMultiplication = " + mul + "\nDivision = " + div );

    }
}