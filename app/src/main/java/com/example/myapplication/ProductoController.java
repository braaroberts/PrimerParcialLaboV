package com.example.myapplication;

import android.util.Log;

import java.util.List;

public class ProductoController {

    static void modificarStock(List<ProductoModel> list,Integer indice, Integer valor){
        Log.d("Seguimiento","indice a modificar "+list.get(indice).getNombreProducto());
        list.get(indice).setCantidad(list.get(indice).getCantidad()+valor);

    }
}
