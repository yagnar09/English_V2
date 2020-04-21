package com.example.english;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button=(Button) findViewById(R.id.Quiz01);
        button1=(Button) findViewById(R.id.Quiz02);
        View.OnClickListener check=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId()==button.getId()){
                    gotoAc01();
                }if (view.getId()==button1.getId()){
                    gotoAc02();
                }
            }
        };
        button.setOnClickListener(check);
        button1.setOnClickListener(check);
    }
    public void gotoAc01(){
        Intent intent =new Intent(this,Main3Activity.class);
        startActivity(intent);
    }public void gotoAc02(){
        Intent intent =new Intent(this,Main4Activity.class);
        startActivity(intent);
    }
}
