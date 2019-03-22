package com.numerica98.lab03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button mButton;

    private EditText ed1, ed2, ed3, ed4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=findViewById(R.id.usn);
        ed2=findViewById(R.id.pss);
        ed3=findViewById(R.id.em);
        ed4=findViewById(R.id.gnd);


        mButton = findViewById(R.id.btn_snd);
        mButton.setOnClickListener(v -> {
            Intent mIntent = new Intent(MainActivity.this, NewAct.class);

            mIntent.putExtra("1", ed1.getText().toString());
            mIntent.putExtra("2", ed2.getText().toString());
            mIntent.putExtra("3", ed3.getText().toString());
            mIntent.putExtra("4", ed4.getText().toString());
            startActivity(mIntent);

        });
    }
}
