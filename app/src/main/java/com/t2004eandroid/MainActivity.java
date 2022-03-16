package com.t2004eandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView khong, mot, hai, ba, bon, nam,sau, bay, tam, chin, cham, c, cong, tru, nhan, chia, bang;
    private EditText editText;

    private float mValueOne, mValueTwo;
    private boolean phepCong, phepTru,phepNhan, phepChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        khong = (TextView) findViewById(R.id.khong);
        mot = (TextView) findViewById(R.id.mot);
        hai = (TextView) findViewById(R.id.hai);
        ba = (TextView) findViewById(R.id.ba);
        bon = (TextView) findViewById(R.id.bon);
        nam = (TextView) findViewById(R.id.nam);
        sau = (TextView) findViewById(R.id.sau);
        bay = (TextView) findViewById(R.id.bay);
        tam = (TextView) findViewById(R.id.tam);
        chin = (TextView) findViewById(R.id.chin);
        cham = (TextView) findViewById(R.id.cham);
        cong = (TextView) findViewById(R.id.cong);
        tru = (TextView) findViewById(R.id.tru);
        nhan = (TextView) findViewById(R.id.nhan);
        chia = (TextView) findViewById(R.id.chia);
        c = (TextView) findViewById(R.id.c);
        bang = (TextView) findViewById(R.id.bang);
        editText = (EditText) findViewById(R.id.edit);

        khong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "0");
            }
        });
        mot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "1");
            }
        });
        hai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "2");
            }
        });
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "3");
            }
        });
        bon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "4");
            }
        });
        nam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "5");
            }
        });
        sau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "6");
            }
        });
        bay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "bay");
            }
        });
        tam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "8");
            }
        });
        chin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "9");
            }
        });

        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null){
                    editText.setText("");
                }else {
                    mValueOne = Float.parseFloat(editText.getText() + "");
                    phepCong = true;
                    editText.setText(null);
                }
            }
        });

        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne = Float.parseFloat(editText.getText() + "");
                phepTru = true;
                editText.setText(null);
            }
        });

        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne = Float.parseFloat(editText.getText() + "");
                phepNhan = true;
                editText.setText(null);
            }
        });

        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne = Float.parseFloat(editText.getText() + "");
                phepChia = true;
                editText.setText(null);
            }
        });

        bang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueTwo = Float.parseFloat(editText.getText()+ "");

                if(phepCong == true) {
                    editText.setText(mValueOne + mValueTwo + "");
                    phepCong = false;
                }

                if (phepTru == true) {
                    editText.setText(mValueOne - mValueTwo + "");
                    phepTru = false;
                }

                if(phepNhan == true) {
                    editText.setText(mValueOne * mValueTwo + "");
                    phepNhan = false;
                }

                if(phepChia == true) {
                    editText.setText(mValueOne / mValueTwo + "");
                    phepChia = false;
                }
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
            }
        });

        cham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + ".");
            }
        });
    }
}