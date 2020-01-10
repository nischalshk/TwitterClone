package com.aboveall.twitterclone.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.aboveall.twitterclone.R;


public class SelectPictureActivity extends AppCompatActivity {

    private String name, email, imageName, password;
    private Button btnNextSPA;
    private LinearLayout imgImageSlect;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_pic);

        btnNextSPA = findViewById(R.id.btnNextSPA);
        imgImageSlect = findViewById(R.id.btnSelectImage);
        imageView = findViewById(R.id.imgSelectImage);
        if (imageView.getDrawable().equals(R.drawable.ic_arrow_back_black_24dp)) {
            btnNextSPA.setClickable(false);
        }
        else {
            btnNextSPA.setClickable(true);
        }
        imgImageSlect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnNextSPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SelectPictureActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
