package com.example.secure360;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    private String sequrity_codes[]={"RVVT6HQCXE6J","IOLSQ3FROOE0","27WP7EBYP54V","XIDL5Z4TN53J","JCJQC02PESOH","5FTS03SFCAUE","68B973M5R63F","4AUQWNJYYWYG","7HT6FLSZMSCA","WLG0HHPRG5BI"};
    TextView txt,txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_3);

        txt=(TextView) findViewById(R.id.textView14);
        txt2=(TextView) findViewById(R.id.textView3);


    }
}