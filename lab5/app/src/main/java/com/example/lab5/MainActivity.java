package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btncong, btntru, btnnhan, btnchia;
    EditText editsoa, editsob;
    TextView txtkq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btncong = (Button) findViewById(R.id.btncong);
        btntru = (Button) findViewById(R.id.btntru);
        btnnhan = (Button) findViewById(R.id.btnnhan);
        btnchia = (Button) findViewById(R.id.btnchia);
        editsoa = (EditText) findViewById(R.id.editsoa);
        editsob = (EditText) findViewById(R.id.editsob);
        txtkq = (TextView) findViewById(R.id.txtketqua);
        btncong.setOnClickListener(myclick);
        btntru.setOnClickListener(myclick);
        btnnhan.setOnClickListener(myclick);
        btnchia.setOnClickListener(myclick);
    }
    View.OnClickListener myclick = new View.OnClickListener(){
        @Override
        public void onClick(View arg0){
            switch (arg0.getId())
            {
                case R.id.btncong:
                    String sa = editsoa.getText()+"";
                    String sb = editsob.getText().toString();
                    int a = Integer.parseInt(sa);
                    int b = Integer.parseInt(sb);
                    txtkq.setText(a+"+"+b+"="+(a+b));
                    break;
                case R.id.btntru:
                    String soa = editsoa.getText()+"";
                    String sob = editsob.getText().toString();
                    int aa = Integer.parseInt(soa);
                    int bb = Integer.parseInt(sob);
                    txtkq.setText(aa+"+"+bb+"="+(aa-bb));
                    break;
                case R.id.btnnhan:
                    String soA = editsoa.getText()+"";
                    String soB = editsob.getText().toString();
                    int aA = Integer.parseInt(soA);
                    int bB = Integer.parseInt(soB);
                    txtkq.setText(aA+"+"+bB+"="+(aA-bB));
                    break;
                case R.id.btnchia:
                    String sA = editsoa.getText()+"";
                    String sB = editsob.getText().toString();
                    int AA = Integer.parseInt(sA);
                    int BB = Integer.parseInt(sB);
                    txtkq.setText(AA+"+"+BB+"="+(AA/BB));
                    break;
            }
        }
    };
}
