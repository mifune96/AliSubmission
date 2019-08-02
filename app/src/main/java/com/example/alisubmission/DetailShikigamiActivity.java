package com.example.alisubmission;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailShikigamiActivity extends AppCompatActivity {

    private String mgambar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_shikigami);
        getSupportActionBar().setTitle("Detail Shikigami");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Shikigami shikigami = getIntent().getParcelableExtra("key");
//        Intent intent = getIntent();

        ImageView gambar = (ImageView)findViewById(R.id.ing_item_photo);
        TextView tvnama = (TextView) findViewById(R.id.tv_item_name);
        TextView tvremaks = (TextView) findViewById(R.id.tv_item_remarks);
        TextView tvbio = (TextView) findViewById(R.id.tv_bio);
        TextView tvatck = (TextView) findViewById(R.id.tv_attack);
        TextView tvhp = (TextView) findViewById(R.id.tv_hp);
        TextView tvdef = (TextView) findViewById(R.id.tv_defense);

//        mgambar = intent.getStringExtra("photo");


        Glide.with(this).load(shikigami.getPhoto())
                .apply(new RequestOptions().
                override(350,550))
                .into(gambar);

        tvnama.setText(shikigami.getNama());
        tvremaks.setText(shikigami.getRemarks());
        tvbio.setText(shikigami.getBio());
        tvatck.setText(shikigami.getAttack());
        tvhp.setText(shikigami.getHp());
        tvdef.setText(shikigami.getDef());

    }
}
