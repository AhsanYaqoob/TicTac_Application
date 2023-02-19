package com.tictac;


import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9,clr;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int flag=0;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();




    }

    private void init() {


        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);
        bt7 = findViewById(R.id.bt7);
        bt8 = findViewById(R.id.bt8);
        bt9 = findViewById(R.id.bt9);
        clr=findViewById(R.id.clr);
    }





    public  void check(View view){
        Animation pause1= AnimationUtils.loadAnimation(this,R.anim.pause);
        Button btc=(Button) view;
        if(btc.getText().toString().equals("")){
        count++;
        if (flag==0){
            btc.setText("X");
            flag=1;
        }
        else {
            btc.setText("O");
            flag=0;
        }
        if (count>4) {
            b1 = bt1.getText().toString();
            b2 = bt2.getText().toString();
            b3 = bt3.getText().toString();
            b4 = bt4.getText().toString();
            b5 = bt5.getText().toString();
            b6 = bt6.getText().toString();
            b7 = bt7.getText().toString();
            b8 = bt8.getText().toString();
            b9 = bt9.getText().toString();

            if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_LONG).show();
                bt1.startAnimation(pause1);
                bt2.startAnimation(pause1);
                bt3.startAnimation(pause1);
                blank();
            } else if (b4.equals(b5) && b5.equals(b6) && !b6.equals("")) {
                Toast.makeText(this, "Winner is " + b4, Toast.LENGTH_LONG).show();
                bt4.startAnimation(pause1);
                bt5.startAnimation(pause1);
                bt6.startAnimation(pause1);
                blank();
            } else if (b7.equals(b8) && b8.equals(b9) && !b8.equals("")) {
                Toast.makeText(this, "Winner is " + b7, Toast.LENGTH_LONG).show();
                bt7.startAnimation(pause1);
                bt8.startAnimation(pause1);
                bt9.startAnimation(pause1);
                blank();
            } else if (b1.equals(b4) && b4.equals(b7) && !b4.equals("")) {
                Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_LONG).show();
                bt1.startAnimation(pause1);
                bt4.startAnimation(pause1);
                bt7.startAnimation(pause1);
                blank();
            } else if (b2.equals(b5) && b5.equals(b8) && !b8.equals("")) {
                Toast.makeText(this, "Winner is " + b2, Toast.LENGTH_LONG).show();
                bt2.startAnimation(pause1);
                bt5.startAnimation(pause1);
                bt8.startAnimation(pause1);
                blank();
            } else if (b3.equals(b6) && b6.equals(b9) && !b9.equals("")) {
                Toast.makeText(this, "Winner is " + b3, Toast.LENGTH_LONG).show();
                bt3.startAnimation(pause1);
                bt6.startAnimation(pause1);
                bt9.startAnimation(pause1);
                blank();
            } else if (b1.equals(b5) && b5.equals(b9) && !b5.equals("")) {
                Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_LONG).show();
                bt1.startAnimation(pause1);
                bt5.startAnimation(pause1);
                bt9.startAnimation(pause1);
                blank();
            } else if (b3.equals(b5) && b5.equals(b7) && !b5.equals("")) {
                Toast.makeText(this, "Winner is " + b3, Toast.LENGTH_LONG).show();
                bt3.startAnimation(pause1);
                bt5.startAnimation(pause1);
                bt7.startAnimation(pause1);
                blank();
            }else if(count==9){
                Toast.makeText(this,"Draw",Toast.LENGTH_LONG).show();
                blank();
            }else {
                clr.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        blank();
                    }
                });
            }


        }
       if(count>=1) {
            clr.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    blank1();
                }
            });
        }
        }
    }

    public void blank(){
      bt1.setEnabled(false);
      bt2.setEnabled(false);
      bt3.setEnabled(false);
      bt4.setEnabled(false);
      bt5.setEnabled(false);
      bt6.setEnabled(false);
      bt7.setEnabled(false);
      bt8.setEnabled(false);
      bt9.setEnabled(false);
        count=0;
        flag=0;
    }
public void blank1(){

    bt1.setEnabled(true);
    bt2.setEnabled(true);
    bt3.setEnabled(true);
    bt4.setEnabled(true);
    bt5.setEnabled(true);
    bt6.setEnabled(true);
    bt7.setEnabled(true);
    bt8.setEnabled(true);
    bt9.setEnabled(true);
    bt1.setText("");
    bt2.setText("");
    bt3.setText("");
    bt4.setText("");
    bt5.setText("");
    bt6.setText("");
    bt7.setText("");
    bt8.setText("");
    bt9.setText("");
    count=0;
    flag=0;
}
    }
