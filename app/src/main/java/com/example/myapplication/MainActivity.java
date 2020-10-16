package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    static List<ProductoModel> productos = null;
    ProductoAdapter productosAdapter = new ProductoAdapter(this);
    Integer auxIndex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        auxIndex = -1;
        productos = new ArrayList<>();
        productos.add(new ProductoModel("Producto1", 5,5.6));
        productos.add(new ProductoModel("Producto2", 5,5.6));
        productos.add(new ProductoModel("Producto3", 5,5.6));
        productos.add(new ProductoModel("Producto4", 5,5.6));
        productos.add(new ProductoModel("Producto5", 5,5.6));
        productos.add(new ProductoModel("Producto6", 5,5.6));
        productos.add(new ProductoModel("Producto7", 5,5.6));
        productos.add(new ProductoModel("Producto8", 5,5.6));
        productos.add(new ProductoModel("Producto9", 5,5.6));
        productos.add(new ProductoModel("Producto10", 5,5.6));
        productos.add(new ProductoModel("Producto11", 5,5.6));
        productos.add(new ProductoModel("Producto12", 5,5.6));

        RecyclerView rc = super.findViewById(R.id.recicler);
        productosAdapter.setProductos(productos);
        rc.setAdapter(productosAdapter);

        LinearLayoutManager linearlayaoutManager =  new LinearLayoutManager(this);
        linearlayaoutManager.setOrientation(RecyclerView.VERTICAL);
        rc.setLayoutManager(linearlayaoutManager);
        ActionBar ab  = super.getSupportActionBar();
        ab.setTitle(R.string.app_name);
        ab.setDisplayHomeAsUpEnabled(true);

    }

    @Override
    protected void onResume() {
        this.notificarCambios(this.auxIndex);
        super.onResume();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()== android.R.id.home){
            super.finish();
        }
        return super.onOptionsItemSelected(item);
    }
    public void modalEdit(Integer indice){
        Intent intent = new Intent(this,EditActivity.class);
        auxIndex = indice;
        intent.putExtra("indice",indice);
        startActivity(intent);
    }
    public void notificarCambios(Integer indice){
        this.productosAdapter.notifyItemChanged(indice);
    }

}