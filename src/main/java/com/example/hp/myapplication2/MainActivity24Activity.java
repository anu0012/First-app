package com.example.hp.myapplication2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.view.View;

public class MainActivity24Activity extends Activity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity24);
        final Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(this);
        final Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(this);
        final Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(this);
        final Button button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(this);

    }

    public void onClick(View v){
        switch (v.getId())
        {
            case R.id.button7:
            {
                Intent intent = new Intent(MainActivity24Activity.this,MainActivity25Activity.class);
                startActivity(intent);
            }
            break;
            case R.id.button8:
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q="+"Bhaktivedanta+Swami+Marg+Raman Reti+Vrindavan+Mathura+Uttar+Pradesh+281121"));
                startActivity(intent);
            }
            break;
            case R.id.button9:
            {
                Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+919634073197"));
                startActivity(intent);
            }
            break;
            case R.id.button10:
            {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.iskconvrindavan.com"));
                startActivity(intent);
            }
            break;
            default:
                break;
        }
    }


}
