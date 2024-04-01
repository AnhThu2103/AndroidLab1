package com.example.lab1_nguyendoananhthu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Bai4 extends AppCompatActivity {

    EditText edSoA, edSoB;
    Button btn;
    TextView kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);
        addControls();
        addEvents();
    }

    void addControls()
    {
        edSoA = (EditText) findViewById(R.id.edSoA);
        edSoB = (EditText) findViewById(R.id.edSoB);
        btn = (Button) findViewById(R.id.btn);
        kq = (TextView) findViewById(R.id.kq);
    }

    void addEvents()
    {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(edSoA.getText().toString());
                int b = Integer.parseInt(edSoB.getText().toString());

                ArrayList<Integer> daya = new ArrayList<Integer>();
                ArrayList<Integer> dayb = new ArrayList<Integer>();

                for(int i = 1; i <= a; i++)
                {
                    if(a%i == 0) {
                        daya.add(i);
                    }
                }
                String chuoi1 ="";
                for (Integer item1:daya)
                    chuoi1 += String.valueOf(item1)+" ";
                for(int i = 1; i <=b; i++)
                {
                    if(b%i==0)
                    {
                        dayb.add(i);
                    }
                }
                String chuoi2="";
                for(Integer item2:dayb)
                    chuoi2 += String.valueOf(item2)+" ";

                String CacUSC=" ";
                if(daya.size()>= dayb.size())
                {
                    for(int i = 0; i <dayb.size();i++)
                    {
                        if(daya.contains(dayb.get(i))== true)
                        {
                            CacUSC += String.valueOf(dayb.get(i))+"";
                        }
                    }
                }
                else if(daya.size() <= dayb.size())
                {
                    for(int i = 0; i<daya.size();i++)
                    {
                        if(dayb.contains(daya.size())== true)
                        {
                            CacUSC += String.valueOf(daya.get(i))+"";
                        }
                    }
                }
                kq.setText("Các ước số chung của 2 số là : "+CacUSC);
            }

        });
    }

}