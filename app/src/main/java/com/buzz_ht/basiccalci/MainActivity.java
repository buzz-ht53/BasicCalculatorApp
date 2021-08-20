package com.buzz_ht.basiccalci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edit1,edit2;
    private Button buttonadd,buttonsub,buttonmul,buttondiv,buttonact;
    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1=findViewById(R.id.edit1);
        edit2=findViewById(R.id.edit2);
        buttonact=findViewById(R.id.buttonact);
        buttonadd=findViewById(R.id.buttonadd);
        buttonsub=findViewById(R.id.buttonsub);
        buttonmul=findViewById(R.id.buttonmul);
        buttondiv=findViewById(R.id.buttondiv);
        text1=findViewById(R.id.text1);

        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a= edit1.getText().toString();
                int a1 = Integer.parseInt(a);
                String b= edit2.getText().toString();
                int b1= Integer.parseInt(b);

               int c= a1+b1;
               String d = Integer.toString(c);
               text1.setText(d);
                Toast t= Toast.makeText(MainActivity.this,"Addition is =" + d,Toast.LENGTH_SHORT );
                t.show();

            }
        });


        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a= edit1.getText().toString();
                int a1 = Integer.parseInt(a);
                String b= edit2.getText().toString();
                int b1= Integer.parseInt(b);

                int c= a1-b1;
                String d = Integer.toString(c);
                text1.setText(d);
                Toast t= Toast.makeText(MainActivity.this,"Subtraction result is " + d,Toast.LENGTH_LONG );
                t.show();
            }
        });


        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a= edit1.getText().toString();
                int a1 = Integer.parseInt(a);
                String b= edit2.getText().toString();
                int b1= Integer.parseInt(b);

                int c= a1*b1;
                String d = Integer.toString(c);
                Toast t =Toast.makeText(MainActivity.this,"Answer is " +d,Toast.LENGTH_LONG );
                text1.setText(d);
                t.show();
            }
        });


        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //add try catch
                String a = edit1.getText().toString();
                int a1 = Integer.parseInt(a);
                String b = edit2.getText().toString();
                int b1 = Integer.parseInt(b);
                if(b1==0){
                    text1.setText("Second number cannot be zero");
                }else {
                    int c = a1 / b1;
                    String d = Integer.toString(c);
                    text1.setText(d);
                    Toast t = Toast.makeText(MainActivity.this, "Answer is = " + d, Toast.LENGTH_LONG);
                    t.show();
                }

            }
        });

        buttonact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = edit1.getText().toString();
                String b = edit2.getText().toString();



                Intent i = new Intent(MainActivity.this,ResultActivity.class);
                i.putExtra(Key.KEY1,a);
                i.putExtra("second",b);
                startActivity(i);


            }
        });


    }

}