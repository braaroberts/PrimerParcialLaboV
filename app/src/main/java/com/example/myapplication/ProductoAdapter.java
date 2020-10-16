package com.example.myapplication;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductoAdapter extends RecyclerView.Adapter<ProductoViewHolder> {
    private List<ProductoModel> productos;
    private MainActivity main;

    public ProductoAdapter( MainActivity main){
    Log.d("Seguimiento","ProductoAdapter");
        this.main = main;
    }

    public void setProductos(List<ProductoModel> productos) {
        this.productos = productos;
    }

    @NonNull
    @Override
    public ProductoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d("Seguimiento","ProductoAdapter.onCreateViewHolder");
        View view =  LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler,parent,false);
        ProductoViewHolder pvh = new ProductoViewHolder(view,main);
        view.setOnClickListener(pvh);
        return pvh;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductoViewHolder holder, int position) {
        Log.d("Seguimiento","ProductoAdapter.onBindViewHolder ");
        holder.id = position;
        holder.tvNombreProducto.setText(productos.get(position).getNombreProducto());
        holder.etCantidad.setText(productos.get(position).getCantidad().toString());
        holder.etPrecio.setText(productos.get(position).getPrecio().toString());
    }

    @Override
    public int getItemCount() {
        Log.d("Seguimiento","ProductoAdapter.getItemCount");
        return this.productos.size();
    }
}
