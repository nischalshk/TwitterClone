package com.aboveall.twitterclone.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.aboveall.twitterclone.R;


public class PasswordActivity extends AppCompatActivity {

    private EditText edtPassword;
    private Button btnNextPA;
    private String name, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_pass);

        edtPassword = findViewById(R.id.etPassword);
        btnNextPA = findViewById(R.id.btnNextPA);

        if (edtPassword.getText().toString().equals("")) {
            btnNextPA.setClickable(false);
        }
        else {
            btnNextPA.setClickable(true);
        }
        btnNextPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = getIntent().getExtras();
                if(bundle != null){
                    name = bundle.getString("Name");
                    email = bundle.getString("Email");
                }
                Intent intent = new Intent(PasswordActivity.this, SelectPictureActivity.class);
                intent.putExtra("Name",name);
                intent.putExtra("Email",email);
                intent.putExtra("Password",edtPassword.getText().toString());
                startActivity(intent);
            }
        });
    }
}
