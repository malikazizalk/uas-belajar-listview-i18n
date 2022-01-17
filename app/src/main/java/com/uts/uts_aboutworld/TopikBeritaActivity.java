package com.uts.uts_aboutworld;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import com.uts.uts_aboutworld.news.HotNew;
import com.uts.uts_aboutworld.news.Energi;
import com.uts.uts_aboutworld.news.Keajaiban;
import com.uts.uts_aboutworld.news.Pemimpin;
import com.uts.uts_aboutworld.news.Tokoh;

public class TopikBeritaActivity extends AppCompatActivity {

    public final static String BERITA_HANGAT ="berita_topic_key";
    List<HotNew> hotnews;
    ListView listView;
    String topicBerita;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topik_berita);
        Intent intent = getIntent();
        topicBerita = intent.getStringExtra(MainActivity.DAFTAR_BERITA_KEY);
        hotnews = BeritaSaatIni.getHotNewsByTipe(this,topicBerita);


        TextView txJudul = findViewById(R.id.text_title_berita);
        String judul = "";
        if (hotnews.get(0) instanceof Energi) {
            judul = getString(R.string.energi_list_title);
        } else if (hotnews.get(0) instanceof Keajaiban) {
            judul = getString(R.string.keajaiban_list_title);
        }else if(hotnews.get(0) instanceof Pemimpin){
            judul = getString(R.string.pemimpin_list_title);
        }else if(hotnews.get(0) instanceof Tokoh){
            judul = getString(R.string.tokoh_list_title);
        }

        txJudul.setText(judul);
        setupListView();
    }

    private void setupListView() {
        listView = findViewById(R.id.listview_daftar_topic);
        TopikBeritaAdapter adapter = new TopikBeritaAdapter(this,hotnews);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(onListClik);
    }

    private AdapterView.OnItemClickListener onListClik = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            HotNew terpilih = hotnews.get(position);
            bukaBeritaSaatIni(terpilih);
        }
    };

    private void bukaBeritaSaatIni(HotNew topicHangat) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, HeaderActivity.class);
        intent.putExtra(BERITA_HANGAT, topicHangat);
        startActivity(intent);
    }
}