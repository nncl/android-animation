package com.example.rm30917.animation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Animation shakeAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.edtUsername);
        password = (EditText) findViewById(R.id.edtPassword);
        shakeAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate);
    }

    public void signIn(View v){
        if (username.getText().toString().equals("admin") && password.getText().toString().equals("123")) {
            Intent intent = new Intent(this, ContentActivity.class);
            startActivity(intent);
        } else {
            username.startAnimation(shakeAnimation);
            password.startAnimation(shakeAnimation);
        }
    }
}
