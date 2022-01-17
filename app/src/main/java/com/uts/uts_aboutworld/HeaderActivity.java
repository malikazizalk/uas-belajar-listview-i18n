package com.uts.uts_aboutworld;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.uts.uts_aboutworld.news.HotNew;

public class HeaderActivity extends AppCompatActivity {

    HotNew hotnew;
    TextView txtJudul,txtBerita,txtAsal,txtDeskripsi;
    ImageView ivFotoBerita;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_header);
        Intent intent = getIntent();
        hotnew = (HotNew) intent.getSerializableExtra(TopikBeritaActivity.BERITA_HANGAT);
        inisialisasiView();
        tampilkanHeader(hotnew);
    }

    private void inisialisasiView() {
        txtJudul = findViewById(R.id.txtberitatentang);
        txtBerita = findViewById(R.id.txtjudulberita);
        txtAsal = findViewById(R.id.txtasal);
        txtDeskripsi = findViewById(R.id.txtdeskripsibiodata);
        ivFotoBerita = findViewById(R.id.gambarBerita);
        btnBack = findViewById(R.id.btn_back_to_list);
        btnBack.setOnClickListener(view -> {
            onBackPressed();
        });
    }


    private void tampilkanHeader(HotNew hotnew) {
        Log.d("Berita","Menampilkan "+hotnew.getBerita());
        txtJudul.setText(hotnew.getBerita());
        txtBerita.setText(hotnew.getTopic());
        txtAsal.setText(hotnew.getAsal());
        txtDeskripsi.setText(hotnew.getDeskripsi());
        ivFotoBerita.setImageDrawable(this.getDrawable(hotnew.getDrawableRes()));
    }

}