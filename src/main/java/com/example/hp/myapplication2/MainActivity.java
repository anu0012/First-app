package com.example.hp.myapplication2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,MainActivity2Activity.class);
                startActivity(intent);
            }
        });

    }
}