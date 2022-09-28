package com.bayzidhimel.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.Scriptable;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    ImageView zero,one,two,three,four,five,six,seven,eight,nine;
    ImageView plus,minus,div,mul,equal,dot,rest;
    TextView input1,output1;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1=findViewById(R.id.inputtext);
        output1=findViewById(R.id.output);

        zero=findViewById(R.id.zero);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six= findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight= findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        plus=findViewById(R.id.bplus);
        minus=findViewById(R.id.bminus);
        div=findViewById(R.id.devision);
        mul = findViewById(R.id.multi);
        dot =findViewById(R.id.dot);
        equal = findViewById(R.id.equaltwo);
        rest = findViewById(R.id.ac);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input1.getText().toString();
                input1.setText(data+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input1.getText().toString();
                input1.setText(data+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input1.getText().toString();
                input1.setText(data+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input1.getText().toString();
                input1.setText(data+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input1.getText().toString();
                input1.setText(data+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input1.getText().toString();
                input1.setText(data+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input1.getText().toString();
                input1.setText(data+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input1.getText().toString();
                input1.setText(data+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input1.getText().toString();
                input1.setText(data+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input1.getText().toString();
                input1.setText(data+"9");
            }
        });
        rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1.setText("");
                output1.setText("");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input1.getText().toString();
                input1.setText(data+".");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input1.getText().toString();
                input1.setText(data+"+");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input1.getText().toString();
                input1.setText(data+"-");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input1.getText().toString();
                input1.setText(data+"X");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input1.getText().toString();
                input1.setText(data+"%");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input1.getText().toString();
                data=data.replaceAll("X","*");
                Context rhino=Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalresult="";

                Scriptable scriptable=rhino.initStandardObjects();
                finalresult=rhino.evaluateString(scriptable,data,"Javsscript",1,null).toString();
                output1.setText(finalresult);



            }
        });



    }

}