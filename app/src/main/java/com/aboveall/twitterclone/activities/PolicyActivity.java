package com.aboveall.twitterclone.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.aboveall.twitterclone.R;


public class PolicyActivity extends AppCompatActivity {

    private TextView txtPolicy;
    private EditText edtConfirmName, edtConfirmEmail;
    private Button btnConfirmSignUp;
    private ImageButton btnImageBackPA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_createfin);

        txtPolicy = findViewById(R.id.txtPolicy);
        edtConfirmName = findViewById(R.id.edtconfirmName);
        edtConfirmEmail = findViewById(R.id.edtconfirmEmail);
        btnConfirmSignUp = findViewById(R.id.btnConfirmSignUp);
        btnImageBackPA = findViewById(R.id.imagebtnbackPA);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            edtConfirmName.setText(bundle.getString("Name"));
            edtConfirmEmail.setText(bundle.getString("Email"));
        }

        txtPolicy.setText(Html.fromHtml(" By signing up, you agree to the <font color=\"#38A1F3\">Terms of Service</font> and <font color=\"#38A1F3\">Privacy Policy</font>, including <font color=\"#38A1F3\">Cookie Use</font>. Others will be able to find you by email or phone number when provided . <font color=\"#38A1F3\">Privacy Options</font>\n"));

        btnConfirmSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PolicyActivity.this, VerifyCodeActivity.class);
                intent.putExtra("Name", edtConfirmName.getText().toString());
                intent.putExtra("Email", edtConfirmEmail.getText().toString());
                startActivity(intent);
            }
        });
        btnImageBackPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PolicyActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
