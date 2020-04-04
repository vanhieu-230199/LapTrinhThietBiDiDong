package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    public static final  String TAG = "MyMessage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout layout = new RelativeLayout(this);
        layout.setBackgroundColor(Color.GREEN);
        //Tạo button
        Button button = new Button(this);
        button.setText("My Button");
        //Thêm button vào layout
        layout.addView(button);
        //Nội dung giao diện
        setContentView(layout);
    }
}
