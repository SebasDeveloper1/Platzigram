package com.canibal.platzigram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.canibal.platzigram.view.ContainerActivity;
import com.canibal.platzigram.view.CreateAccountActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  goCreatecAccount(View view){
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }

    public void  goContainer(View view){
        Intent intent = new Intent(this, ContainerActivity.class);
        startActivity(intent);
    }
}
