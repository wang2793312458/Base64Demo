package com.example.base64demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
/*
*
* base64加密
*
* */
public class MainActivity extends AppCompatActivity {


    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.text);

        String string = "http://zntx.cc";
        String base64String = Base64.encode(string.getBytes());
        mTextView.setText(base64String);
    }
}
