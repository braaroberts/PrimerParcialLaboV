package com.example.myapplication;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView tvNombreProducto;
    public TextView etCantidad;
    public TextView etPrecio;
    public Integer id;
    public MainActivity main;


    public ProductoViewHolder(@NonNull View itemView, MainActivity main) {
        super(itemView);
        Log.d("Seguimiento","ProductoViewHolder");
        tvNombreProducto= this.itemView.findViewById(R.id.nombreProducto);
        etCantidad= this.itemView.findViewById(R.id.cantidad);
        etPrecio= this.itemView.findViewById(R.id.precio);
        this.main=main;

    }

    @Override
    public void onClick(View v) {
        Log.d("Editar = ", this.id + " - Nombre: " +this.tvNombreProducto.getText().toString());
        this.main.modalEdit(this.id);
    }

}
