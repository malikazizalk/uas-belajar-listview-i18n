package com.uts.uts_aboutworld;

import android.content.Context;

import com.uts.uts_aboutworld.news.Energi;
import com.uts.uts_aboutworld.news.HotNew;
import com.uts.uts_aboutworld.news.Keajaiban;
import com.uts.uts_aboutworld.news.Pemimpin;
import com.uts.uts_aboutworld.news.Tokoh;

import java.util.ArrayList;
import java.util.List;

public class BeritaSaatIni {
    private static List<HotNew> hotNews = new ArrayList<>();

    private static List<Energi> initDataEnergi(Context ctx) {
        List<Energi> alternatif = new ArrayList<>();

        alternatif.add(new Energi(ctx.getString(R.string.biomassa_nama), ctx.getString(R.string.biomassa_asal),
                ctx.getString(R.string.biomassa_bio), R.drawable.eb_biomassa));
        alternatif.add(new Energi(ctx.getString(R.string.hidroelektrik_nama), ctx.getString( R.string.hidroelektrik_asal),
                ctx.getString(R.string.hidrogen_bio),R.drawable.eb_hidroelektrik));
        alternatif.add(new Energi(ctx.getString(R.string.hidrogen_nama), ctx.getString(R.string.hidrogen_asal),
                ctx.getString(R.string.hidrogen_bio), R.drawable.eb_hidrogen));
        alternatif.add(new Energi(ctx.getString(R.string.tenaga_surya_nama), ctx.getString(R.string.tenaga_surya_asal),
                ctx.getString(R.string.tenaga_surya_bio), R.drawable.eb_matahari));
        alternatif.add(new Energi(ctx.getString(R.string.panas_bumi_nama), ctx.getString(R.string.panas_bumi_asal),
                ctx.getString(R.string.panas_bumi_bio), R.drawable.eb_panasbumi));
        alternatif.add(new Energi(ctx.getString(R.string.turbin_nama), ctx.getString(R.string.turbin_asal),
                ctx.getString(R.string.turbin_bio), R.drawable.eb_wind));
        return alternatif;
    }

    private static List<Keajaiban> initDataKeajaiban(Context ctx) {
        List<Keajaiban> dunia = new ArrayList<>();

        dunia.add(new Keajaiban(ctx.getString(R.string.borobudur_nama), ctx.getString(R.string.borobudur_asal),
                ctx.getString(R.string.borobudur_bio), R.drawable.kd_candi));
        dunia.add(new Keajaiban(ctx.getString(R.string.colosseum_nama), ctx.getString( R.string.colosseum_asal),
                ctx.getString(R.string.colosseum_bio),R.drawable.kd_coloseum));
        dunia.add(new Keajaiban(ctx.getString(R.string.kabah_nama), ctx.getString(R.string.kabah_asal),
                ctx.getString(R.string.kabah_bio), R.drawable.kd_mekah));
        dunia.add(new Keajaiban(ctx.getString(R.string.menara_pisa_nama), ctx.getString(R.string.menara_pisa_asal),
                ctx.getString(R.string.menara_pisa_bio), R.drawable.kd_pissa));
        dunia.add(new Keajaiban(ctx.getString(R.string.tajmahal_nama), ctx.getString(R.string.tajmahal_asal),
                ctx.getString(R.string.tajmahal_bio), R.drawable.kd_tajmahal));
        dunia.add(new Keajaiban(ctx.getString(R.string.tembok_cina_nama), ctx.getString(R.string.tembok_cina_asal),
                ctx.getString(R.string.tembok_cina_bio), R.drawable.kd_tembokcina));
        return dunia;
    }

    private static List<Pemimpin> initDataPemimpin(Context ctx) {
        List<Pemimpin> negara = new ArrayList<>();

        negara.add(new Pemimpin(ctx.getString(R.string.jokowi_nama), ctx.getString(R.string.jokowi_asal),
                ctx.getString(R.string.jokowi_bio), R.drawable.ng_indonesia));
        negara.add(new Pemimpin(ctx.getString(R.string.kim_jong_nama), ctx.getString( R.string.kim_jong_asal),
                ctx.getString(R.string.kim_jong_bio),R.drawable.ng_korut));
        negara.add(new Pemimpin(ctx.getString(R.string.salman_nama), ctx.getString(R.string.salman_asal),
                ctx.getString(R.string.salman_bio), R.drawable.ng_saudi));
        negara.add(new Pemimpin(ctx.getString(R.string.vladimir_nama), ctx.getString(R.string.vladimir_asal),
                ctx.getString(R.string.vladimir_bio), R.drawable.ng_rusia));
        negara.add(new Pemimpin(ctx.getString(R.string.erdogan_nama), ctx.getString(R.string.erdogan_asal),
                ctx.getString(R.string.erdogan_bio), R.drawable.ng_turkey));
        negara.add(new Pemimpin(ctx.getString(R.string.biden_nama), ctx.getString(R.string.biden_asal),
                ctx.getString(R.string.biden_bio), R.drawable.ng_usa));
        return negara;
    }

    private static List<Tokoh> initDataTokoh(Context ctx) {
        List<Tokoh> teknologi = new ArrayList<>();

        teknologi.add(new Tokoh(ctx.getString(R.string.elon_musk_nama), ctx.getString(R.string.elon_musk_asal),
                ctx.getString(R.string.elon_musk_bio), R.drawable.tkh_elonmusk));
        teknologi.add(new Tokoh(ctx.getString(R.string.jackma_nama), ctx.getString( R.string.jackma_asal),
                ctx.getString(R.string.jackma_bio),R.drawable.tkh_jackma));
        teknologi.add(new Tokoh(ctx.getString(R.string.jef_bezos_nama), ctx.getString(R.string.jef_bezos_asal),
                ctx.getString(R.string.jef_bezos_bio), R.drawable.tkh_jeffbezos));
        teknologi.add(new Tokoh(ctx.getString(R.string.zuck_nama), ctx.getString(R.string.zuck_asal),
                ctx.getString(R.string.zuck_bio), R.drawable.tkh_markzuckerberg));
        teknologi.add(new Tokoh(ctx.getString(R.string.sundar_pichai_nama), ctx.getString(R.string.sundar_pichai_asal),
                ctx.getString(R.string.sundar_pichai_bio), R.drawable.tkh_sundarpichai));
        teknologi.add(new Tokoh(ctx.getString(R.string.tim_cook_nama), ctx.getString(R.string.tim_cook_asal),
                ctx.getString(R.string.tim_cook_bio), R.drawable.tkh_timcook));
        return teknologi;
    }

    private static void initAllHotNews(Context ctx) {
        hotNews.addAll(initDataEnergi(ctx));
        hotNews.addAll(initDataKeajaiban(ctx));
        hotNews.addAll(initDataPemimpin(ctx));
        hotNews.addAll(initDataTokoh(ctx));
    }

    public static List<HotNew> getAllHotNews(Context ctx) {
        if (hotNews.size() == 0) {
            initAllHotNews(ctx);
        }
        return  hotNews;
    }

    public static List<HotNew> getHotNewsByTipe(Context ctx, String berita) {
        List<HotNew> hotNewsByType = new ArrayList<>();
        if (hotNews.size() == 0) {
            initAllHotNews(ctx);
        }
        for (HotNew h : hotNews) {
            if (h.getBerita().equals(berita)) {
                hotNewsByType.add(h);
            }
        }
        return hotNewsByType;
    }
}
