package com.example.it320labcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView recieverMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        recieverMsg = (TextView) findViewById(R.id.recievedValueID);

        Intent intent = getIntent();

        String str = intent.getStringExtra("message_key");
        recieverMsg.setText("Hello, " + str + "!");
    }
}