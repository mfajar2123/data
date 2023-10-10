package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button1 = findViewById(R.id.button);
        TextView output1 = findViewById(R.id.textView1);
        TextView output2 = findViewById(R.id.textView2);

//        String x = getIntent().getStringExtra("f1");
//        String y = getIntent().getStringExtra("f2");
//
//        output1.setText(x);
//        output2.setText(y);



        Bundle B = getIntent().getExtras();
        output1.setText(B.getString("f1"));
        output2.setText(B.getString("f2"));

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(back);
            }
        });



    }
}