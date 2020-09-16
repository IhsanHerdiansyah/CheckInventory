package com.example.checkinventory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    Button btnbuah;
    Button btnmakanan;
    Button btnbarang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnbuah = (Button)findViewById(R.id.btnbuah);
        btnbuah.setOnClickListener(this);
        btnmakanan = (Button)findViewById(R.id.btnmakanan);
        btnmakanan.setOnClickListener(this);
        btnbarang = (Button)findViewById(R.id.btnbarang);
        btnbarang.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnbuah:
                Intent buah = new Intent(MainActivity.this, BuahActivity.class);
                startActivity(buah);
                break;
            case R.id.btnmakanan:
                Intent makanan = new Intent(MainActivity.this, MakananActivity.class);
                startActivity(makanan);
                break;
            case R.id.btnbarang:
                Intent barang = new Intent(MainActivity.this, BarangActivity.class);
                startActivity(barang);
                break;
        }
    }
}
