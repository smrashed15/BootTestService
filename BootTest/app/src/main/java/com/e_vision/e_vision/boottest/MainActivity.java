package com.e_vision.e_vision.boottest;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        Intent iin= getIntent();
        Bundle b = iin.getExtras();

        if(b!=null)
        {
            Log.e("adsasd","Yes");
        }
        else {

            Log.e("adsasd","No");
        }


        /*if(extras.getString("as",null).equalsIgnoreCase("as")) {

        } else {

            Intent i=new Intent(getBaseContext(), MsgPushService.class);
            startService(i);

        }*/

    }


}