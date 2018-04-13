package br.com.fiap.trabalho.rm77786;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final Intent INTENT = new Intent(this, AcessoActivity.class);

        final SharedPreferences prefs = getSharedPreferences("userPrefs", MODE_PRIVATE);
        int st = prefs.getInt("splTime", 0);

        if (st == 0) { st = 10000;}

        Handler handle = new Handler();

        handle.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(INTENT);
            }
        }, st);
    }

    //Grava o log da Activity
    @Override
    protected void onStart() {
        super.onStart();
        GravaLog.gravaLog(this);
    }

}


