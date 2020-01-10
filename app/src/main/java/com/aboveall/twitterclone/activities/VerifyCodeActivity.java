package com.aboveall.twitterclone.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.aboveall.twitterclone.R;

public class VerifyCodeActivity extends AppCompatActivity {

    private Button btnNextVCA;
    private EditText edtCode;
    private String name, email;
    private ImageButton btnImageBackVCA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_code);

        edtCode = findViewById(R.id.edtCode);
        btnNextVCA = findViewById(R.id.btnNextVCA);
        btnImageBackVCA = findViewById(R.id.imagebtnbackVCA);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            name = bundle.getString("Name");
            email = bundle.getString("Email");
        }

        edtCode.setText("Nischal");

        btnNextVCA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtCode.getText().toString().equals("Nischal")) {
                    Intent intent = new Intent(VerifyCodeActivity.this, PasswordActivity.class);
                    intent.putExtra("Name", name);
                    intent.putExtra("Email", email);
                    startActivity(intent);
                }
            }
        });
        btnImageBackVCA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VerifyCodeActivity.this, PolicyActivity.class);
                startActivity(intent);
            }
        });
    }
}
