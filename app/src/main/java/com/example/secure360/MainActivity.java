package com.example.secure360;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txt;
    private Button Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=(TextView) findViewById(R.id.textView2);
        Btn=(Button)findViewById(R.id.button2);

        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                take_to_signin();
            }
        });
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                take_to_signin();
            }
        });
    }
    public void ShowToast(View V)
    {
        Toast.makeText(MainActivity.this, "Sucesfully Registered", Toast.LENGTH_SHORT).show();
    }

    public void take_to_signin()
    {

        Intent intent=new Intent(MainActivity.this,MainActivity3.class);
        startActivity(intent);

    }
}