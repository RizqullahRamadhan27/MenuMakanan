package com.example.aplikasimenumakanan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    private final ArrayList<String> fotoMakanan = new ArrayList<>();
    private final ArrayList<String> namaMakanan = new ArrayList<>();
    private final ArrayList<String> infoMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan, namaMakanan, infoMakanan, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){
        namaMakanan.add("Mangut Kepala Manyung");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2017/06/Nasi-Ayam-Semarang-Khas-Semarang.jpg");
        infoMakanan.add("Makanan ini sendiri terdiri dari kepala ikan manyung, daging ikan manyung, santan, cabe dan juga tomat.                                  Harga : Rp.25.000");

        namaMakanan.add("Nasi Ayam Semarang");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/ayam-betutu-bali.jpg");
        infoMakanan.add("Nasi ayam khas Semarang adalah makanan dengan isi berupa nasi liwet, telur rebus, dan suwiran ayam yang diberi kuah opor serta tambahan sambal goreng jipan.             Harga : Rp.24.000");

        namaMakanan.add("Tahu Gimbal");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2017/06/Tahu-Gimbal-Khas-Semarang.jpg");
        infoMakanan.add("Makanan ini memang agak mirip dengan ketoprak khas Jakarta, namun bedanya adalah tahu gimbal menggunakan bumbu kacang yang disajikan dengan cara disiramkan ke makanan.                                                                                  Harga : Rp.23.000");

        namaMakanan.add("Soto Bangkong");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2017/06/Soto-Bangkong-Khas-Semarang.jpg");
        infoMakanan.add("Soto bangkong adalah olahan soto yang terdapat di Rumah makan Jalan Brigjen Katamso Semarang. Nama bangkong sendiri diambil dari tempat pendirian dari soto yang telah ada sejak 1950 ini, yakni Perempatan Bangkong.                                                                                  Harga : Rp.23.000");

        namaMakanan.add("Nasi Goreng Babat Gongso");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2017/06/Nasi-Goreng-Babat-Gongso-Khas-Semarang.jpg");
        infoMakanan.add("Nasi Goreng Babat Gongso merupakan nasi goreng yang disekitarnya ditambah dengan babat alias kulit sapi bagian lambung dan Babat dipotong 3×4 cm.                                   Harga : Rp.25.000");

        namaMakanan.add("Tahu Petis");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2017/06/Tahu-Petis-Khas-Semarang.jpg");
        infoMakanan.add("Petis itu dibuat dengan adonan kanji dengan tambahan gula yang diberi tinta cumi agar warnanya menghitam.                                                                                 Harga : Rp.20.000");

        namaMakanan.add("Lumpia Semarang");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2017/06/Lumpia-Semarang-Khas-Semarang.jpg");
        infoMakanan.add("Makanan dengan nama inggrisnya yaitu spring roll itu dibuat dengan adonan tepung yang dibuat bundar kemudian diberi isian lalu dilipat dan digulung, baru digoreng di minyak panas                                                                          Harga : Rp.23.000");

        prosesRecyclerViewAdapter();
    }

}