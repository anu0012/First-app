package com.example.hp.myapplication2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.view.View;

public class MainActivity28Activity extends Activity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity28);
        final Button button15 = (Button) findViewById(R.id.button15);
        button15.setOnClickListener(this);
        final Button button16 = (Button) findViewById(R.id.button16);
        button16.setOnClickListener(this);
        final Button button17 = (Button) findViewById(R.id.button17);
        button17.setOnClickListener(this);
        final Button button18 = (Button) findViewById(R.id.button18);
        button18.setOnClickListener(this);

    }

    public void onClick(View v){
        switch (v.getId())
        {
            case R.id.button15:
            {
                Intent intent = new Intent(MainActivity28Activity.this,MainActivity29Activity.class);
                startActivity(intent);
            }
            break;
            case R.id.button16:
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q="+"Sri+Sri+Radha+Rasabihari+Temple+Hare+Krishna+Land+Juhu+Mumbai+400049"));
                startActivity(intent);
            }
            break;
            case R.id.button17:
            {
                Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:02226206860"));
                startActivity(intent);
            }
            break;
            case R.id.button18:
            {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.iskconmumbai.com"));
                startActivity(intent);
            }
            break;
            default:
                break;
        }
    }


}
