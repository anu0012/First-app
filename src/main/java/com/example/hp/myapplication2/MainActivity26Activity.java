package com.example.hp.myapplication2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.view.View;

public class MainActivity26Activity extends Activity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity26);
        final Button button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(this);
        final Button button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(this);
        final Button button13 = (Button) findViewById(R.id.button13);
        button13.setOnClickListener(this);
        final Button button14 = (Button) findViewById(R.id.button14);
        button14.setOnClickListener(this);

    }

    public void onClick(View v){
        switch (v.getId())
        {
            case R.id.button11:
            {
                Intent intent = new Intent(MainActivity26Activity.this,MainActivity27Activity.class);
                startActivity(intent);
            }
            break;
            case R.id.button12:
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q="+"Sri+Mayapur+Dhama+District+Nadia+Mayapur+West+Bengal+741313"));
                startActivity(intent);
            }
            break;
            case R.id.button13:
            {
                Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+919733578071"));
                startActivity(intent);
            }
            break;
            case R.id.button14:
            {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.mayapur.com"));
                startActivity(intent);
            }
            break;
            default:
                break;
        }
    }


}
