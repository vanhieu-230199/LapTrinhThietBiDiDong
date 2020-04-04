package com.example.lab3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText(MainActivity.this, "Bài tập lab3", Toast.LENGTH_SHORT);
        toast.show();

        Button button = (Button)this.findViewById(R.id.btn);
        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog.Builder b =new AlertDialog.Builder(MainActivity.this);
                b.setTitle("Question");
                b.setMessage("Are you sure want to exit?");
                b.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                b.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                b.create().show();

            }

        });
    }
}
