package com.uts.uts_aboutworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import com.uts.uts_aboutworld.news.Energi;
import com.uts.uts_aboutworld.news.Keajaiban;
import com.uts.uts_aboutworld.news.Pemimpin;
import com.uts.uts_aboutworld.news.Tokoh;

public class MainActivity extends AppCompatActivity {

    ImageButton btnEnergi,btnKeajaiban, btnPemimpin, btnTokoh;
    Button btnBiodata;
    public static final String DAFTAR_BERITA_KEY = "DAFTAR_BERITA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnEnergi = findViewById(R.id.btn_buka_energi_baru);
        btnKeajaiban = findViewById(R.id.btn_buka_keajaiban_dunia);
        btnPemimpin = findViewById(R.id.btn_buka_pemimpin_negara);
        btnTokoh = findViewById(R.id.btn_buka_tokoh_teknologi);
        btnBiodata = findViewById(R.id.profile);
        btnEnergi.setOnClickListener(view -> bukaGaleri("Energi"));
        btnKeajaiban.setOnClickListener(view -> bukaGaleri("Keajaiban"));
        btnPemimpin.setOnClickListener(view -> bukaGaleri("Pemimpin"));
        btnTokoh.setOnClickListener(view -> bukaGaleri("Tokoh"));
        btnBiodata.setOnClickListener(view -> bukaProfileActivity());
    }


    private void bukaGaleri(String topicBerita) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, TopikBeritaActivity.class);
        intent.putExtra(DAFTAR_BERITA_KEY, topicBerita);
        startActivity(intent);
    }

    private void bukaProfileActivity() {
        Log.d("MAIN","Buka profile");
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
}