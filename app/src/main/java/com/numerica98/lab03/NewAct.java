package com.numerica98.lab03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class NewAct extends AppCompatActivity {

    private TextView tv1, tv2, tv3, tv4;

    private Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        tv4=findViewById(R.id.tv4);

        Intent m_intent = this.getIntent();
        if(m_intent !=  null){
            tv1.setText(m_intent.getStringExtra("1"));
            tv2.setText(m_intent.getStringExtra("2"));
            tv3.setText(m_intent.getStringExtra("3"));
            tv4.setText(m_intent.getStringExtra("4"));

        }

    }
    }

