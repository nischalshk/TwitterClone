package com.aboveall.twitterclone.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.aboveall.twitterclone.R;


public class CreateAccountActivity extends AppCompatActivity {

    private EditText edtName, edtEmailorPhone;
    private TextView txtEmailorPhone;
    private Button btnNextCAA;
    private ImageButton btnImageBackCCA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_create1);

        edtName = findViewById(R.id.Cusername);
        edtEmailorPhone = findViewById(R.id.Cemail);
        txtEmailorPhone = findViewById(R.id.btnPhoneOrEmail);
        btnNextCAA = findViewById(R.id.Csignup);
        btnImageBackCCA = findViewById(R.id.imagebtnbackCAA);

        edtEmailorPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtEmailorPhone.setText("Use phone instead");
                txtEmailorPhone.setVisibility(View.VISIBLE);
            }
        });
        btnNextCAA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                String email = edtEmailorPhone.getText().toString();

                if (!name.equals("")&&!email.equals("")){
                    btnNextCAA.setClickable(false);
                }
                else{
                    btnNextCAA.setClickable(true);
                    Intent intent = new Intent(CreateAccountActivity.this, PasswordActivity.class);
                    intent.putExtra("Name", name);
                    intent.putExtra("Email",email);
                    startActivity(intent);
                }
            }
        });
        btnImageBackCCA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateAccountActivity.this, LoginOrSignUpActivity.class);
                startActivity(intent);
            }
        });
    }
}
