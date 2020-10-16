package com.example.myapplication;

import android.util.Log;

import androidx.annotation.NonNull;

public class ProductoModel {

    private String nombreProducto;
    private Integer cantidad;
    private Double precio;

    public ProductoModel(String nombre, Integer cantidad, Double precio) {
        Log.d("Seguimiento","ProductoModel");
        this.precio = precio;
        this.cantidad  =cantidad;
        this.nombreProducto = nombre;

    }
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    @NonNull
    @Override
    public String toString() {
        return getNombreProducto()+" - " +getCantidad()+" - "+getPrecio();
    }
}
