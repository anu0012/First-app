package com.example.hp.myapplication2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.view.View;

public class MainActivity2Activity extends Activity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);
        final Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        final Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        final Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
        final Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);
        final Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);
    }

    public void onClick(View v){
        switch (v.getId())
        {
            case R.id.button2:
            {
                Intent intent = new Intent(MainActivity2Activity.this,MainActivity24Activity.class);
                startActivity(intent);
            }
            break;
            case R.id.button3:
            {
                Intent intent = new Intent(MainActivity2Activity.this,MainActivity26Activity.class);
                startActivity(intent);
            }
            break;
            case R.id.button4:
            {
                Intent intent = new Intent(MainActivity2Activity.this,MainActivity28Activity.class);
                startActivity(intent);
            }
            break;
            case R.id.button5:
            {
                Intent intent = new Intent(MainActivity2Activity.this,MainActivity22Activity.class);
                startActivity(intent);
            }
            break;
            case R.id.button6:
            {
                Intent intent = new Intent(MainActivity2Activity.this,MainActivity23Activity.class);
                startActivity(intent);
            }
            break;
            default:
                break;
        }
    }


}
