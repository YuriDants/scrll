package br.edu.ifpb.programa1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;

public class SplashActivity extends ActionBarActivity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Handler handler = new Handler();
        handler.postDelayed(this, 2000);
    }

    @Override
    public void run() {
        startActivity(new Intent(this, TelaPrincipal.class));
        finish();
    }
}
