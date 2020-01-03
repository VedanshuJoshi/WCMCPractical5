package com.example.practical5;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count=3;
    TextView t1;
    EditText e1,e2;
    Button b1,b2;
    RelativeLayout l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        t1=(TextView)findViewById(R.id.textView3);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        l1=(RelativeLayout)findViewById(R.id.ll);
        t1.setText(Integer.toString(count));
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count!=0) {
                    if ((e1.getText().toString().equals("Admin")) && (e2.getText().toString().equals("pw"))) {
                        l1.setBackgroundColor(Color.GREEN);
                    } else {
                        l1.setBackgroundColor(Color.RED);
                        count--;
                        t1.setText(Integer.toString(count));
                    }
                }
                else{
                    b1.setEnabled(false);
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
