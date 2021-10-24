package com.example.mc_t2_skygrassrootletters;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView letterStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        letterStatus = (TextView) findViewById(R.id.textView);
    }

    public void updateStatus(View view) {
        Button btn = (Button)view;
        char ch = btn.getText().toString().charAt(0);
        if(isRootLetter(ch)){
            letterStatus.setText("Root Letter");
            letterStatus.setTextColor(Color.BLACK);
        }else if(isSkyLetter(ch)){
            letterStatus.setText("Sky Letter");
            letterStatus.setTextColor(Color.BLUE);
        }else{
            letterStatus.setText("Grass Letter");
            letterStatus.setTextColor(Color.GREEN);
        }
    }
    public boolean isRootLetter(char ch)
    {
        if(ch=='g' || ch=='j'||ch=='p'||ch=='q'||ch=='y')
            return true;
        return false;
    }
    public boolean isSkyLetter(char ch)
    {
        if(ch=='b' || ch=='d'||ch=='f'||ch=='h'||ch=='l'||ch=='k'||ch=='t')
            return true;
        return false;
    }
}