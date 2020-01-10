package com.aboveall.twitterclone.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.aboveall.twitterclone.R;


public class LoginOrSignUpActivity extends AppCompatActivity {
    private Button btnCreateAcc;
    private TextView txtLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_create0);

        btnCreateAcc = findViewById(R.id.btnCreateAcc);
        txtLogin = findViewById(R.id.edtBtnLogin);

        btnCreateAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginOrSignUpActivity.this, CreateAccountActivity.class);
                startActivity(intent);
            }
        });

        txtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginOrSignUpActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
