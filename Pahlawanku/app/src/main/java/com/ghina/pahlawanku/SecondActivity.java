package com.ghina.pahlawanku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_PAHLAWAN = "extra_pahlawan";
    TextView tvNameSec, tvDescriptionSec;
    ImageView imgPhotoSec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvNameSec = findViewById(R.id.tv_name_sec);
        tvDescriptionSec = findViewById(R.id.tv_description_sec);
        imgPhotoSec = findViewById(R.id.img_photo_sec);

        Pahlawan pahlawan = getIntent().getParcelableExtra(EXTRA_PAHLAWAN);

        imgPhotoSec.setImageResource(pahlawan.getPhoto());
        tvNameSec.setText(pahlawan.getName());
        tvDescriptionSec.setText(pahlawan.getDescription());
    }
}
