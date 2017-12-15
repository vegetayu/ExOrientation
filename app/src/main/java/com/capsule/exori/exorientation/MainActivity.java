package com.capsule.exori.exorientation;

import android.content.res.Configuration;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.w("vegeta","onCreate");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.i("vegeta","onCreate with bundle");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("vegeta","onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("vegeta","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("vegeta","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("vegeta","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("vegeta","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("vegeta","onDestroy");
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("vegeta","onSaveInstanceState");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.i("vegeta","onSaveInstanceState with bundle");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i("vegeta","onRestoreInstanceState");
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
        Log.i("vegeta","onRestoreInstanceState with bundle");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.getLayoutDirection() == Configuration.ORIENTATION_PORTRAIT) {
            Log.v("vegeta", "现在变成了竖屏");
        }else{
            Log.v("vegeta", "现在变成了横屏");
        }
    }
}
