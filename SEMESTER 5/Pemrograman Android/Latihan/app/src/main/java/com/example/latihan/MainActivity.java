package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText input1 = findViewById(R.id.input1);
        Button button1 = findViewById(R.id.button1);
        TextView output1 = findViewById(R.id.textView1);
        Button button2 = findViewById(R.id.button2);
        EditText input2 = findViewById(R.id.inputEmail);
        EditText input3 = findViewById(R.id.inputPassword);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String x = input1.getText().toString();

                input1.setText(null);

                output1.setText(x);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String x = input2.getText().toString();
//                String y = input3.getText().toString();
//
//            Intent z =  new Intent(MainActivity.this, MainActivity2.class);
//            z.putExtra("f1", x);
//            z.putExtra("f2", y);
//            startActivity(z);
//            }


                Bundle B = new Bundle();
                B.putString("f1", input2.getText().toString());
                B.putString("f2", input3.getText().toString());
                Intent I = new Intent(MainActivity.this, MainActivity2.class);
                I.putExtras(B);
                startActivity(I);
            }
        });
    }
}