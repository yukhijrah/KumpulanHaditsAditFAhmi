package wahab.app.kumpulanhadits;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import wahab.app.kumpulanhadits.adapter.DoaAdapter;
import wahab.app.kumpulanhadits.model.Doa;

/**
 * Created by wahab on 13/10/18.
 */

public class MainActivity extends AppCompatActivity {

    RecyclerView lstDoa;
    LinearLayoutManager linear;

    List<Doa> doas;
    DoaAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstDoa = (RecyclerView) findViewById(R.id.lst_doa);

        linear = new LinearLayoutManager(this);
        lstDoa.setLayoutManager(linear);

        doas = new ArrayList<>();
        doas.add(new Doa(0, "Doa Belajar", "طَلَبُ الْعِلْمِ فَرِيْضَةٌ عَلَى كُلِّ مُسْلِمٍ وَمُسْلِمَةٍ", "Mencari ilmu itu wajib bagi setiap muslim laki-laki maupun perempuan."));
        doas.add(new Doa(0, "Doa Makan", "الَّلهُمَّ بَارِكْ لَنَا فِيمَا رَزَقْتَنَا، وَقِنَا عَذَابَ النَّارِ", "Segala puji bagi Allah yang memberi kami makan dan minum serta menjadikan kami memeluk agama islam"));
        doas.add(new Doa(0, "Doa Tidur", "بِسْمِكَ اللّهُمَّ اَحْيَا وَ بِسْمِكَ اَمُوْتُ", "Dengan menyebut Nama-Mu Ya Allah Aku Hidup dan dengan menyebut Nama-Mu Aku Mati"));
        doas.add(new Doa(0, "Doa Ketika Makan Lupa Membaca Doa", "بِسْمِ اللهِ فِىِ أَوَّلِهِ وَآخِرِهِ", "Dengan menyebut nama Allah pada awal dan akhirnya"));
        doas.add(new Doa(0, "Doa Ketika Mimpi Buruk", "اَللّٰهُمَّ إِنّىِ أَعُوْذُ بِكَ مِنْ عَمَلِ الشَّيْطَانِ وَسَيِّئاَتِ اْلأَحْلاَمِ", "Ya Allah, sesungguhnya aku mohon perlindungan kepada Engkau dari perbuatan setan dan dari mimpi-mimpi yang buruk"));
        doas.add(new Doa(0, "Doa Ketika Mendapat Mimpi Baik", "بِسْمِكَ اللّهُمَّ اَحْيَا وَ بِسْمِكَ اَمُوْتُ", "Segala puji bagi Allah yang telah memberi hajatku"));
        doas.add(new Doa(0, "Doa Masuk Kamar Mandi", "باَللّٰهُمَّ اِنّىْ اَعُوْذُبِكَ مِنَ الْخُبُثِ وَالْخَبَآئِثِ", "Ya Allah, aku berlindung pada-Mu dari godaan syetan  laki-laki dan syetan perempuan"));
        doas.add(new Doa(0, "Doa Istinja", "اَللّٰهُمَّ طَهِّرُ قَلْبِىْ مِنَ النِّفَاقِ وَحَصِّنْ فَرْخِىْ مِنَ الْفَوَاحِشِ", "Wahai Tuhanku, sucikanlah hatiku dari sifat kepura-puraan (munafiq) serta peliharalah kemaluanku dari perbuatan keji"));
        doas.add(new Doa(0, "Doa Menjelang Sholat Shubuh", "بِسْمِكَ اللّهُمَّ اَحْيَا وَ بِسْمِكَ اَمُوْتُ", "Ya Allah! Sesungguhnya aku berlindung kepada-Mu dari kesempitan dunia dan kesempitan hari kiamat"));
        doas.add(new Doa(0, "Doa Menyambut Pagi hari", "اَللّٰهُمَّ بِكَ اَصْبَحْنَا وَبِكَ اَمْسَيْنَا وَبِكَ نَحْيَا وَبِكَ نَمُوْتُ وَاِلَيْكَ النُّشُوْرُ", "Ya Allah, karena Engkau kami mengalami waktu pagi dan waktu petang, dan karena Engkau kami hidup dan mati dan kepada-Mu juga kami akan kembali."));
        doas.add(new Doa(0, "Doa Ketika Bercermin", "اَلْحَمْدُ ِللهِ كَمَا حَسَّنْتَ خَلْقِىْ  فَحَسِّـنْ خُلُقِىْ", "Segala puji bagi Allah, baguskanlah budi pekertiku sebagaimana Engkau telah membaguskan rupa wajahku"));

        adapter = new DoaAdapter(this, doas);

        lstDoa.setAdapter(adapter);
    }

}
