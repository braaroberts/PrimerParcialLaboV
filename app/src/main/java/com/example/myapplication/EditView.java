package com.example.myapplication;

import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class EditView {
    EditActivity activity;
    ProductoModel modelo;

    EditText nombre;
    EditText cantidad;
    EditText precio;

    public EditView(EditActivity activity, ProductoModel modelo, Integer indice){
        this.activity = activity;
        this.modelo = modelo;
    }

    public  void cargarModelo(){

       nombre  = this.activity.findViewById(R.id.nombreProductoEdit);
        cantidad = this.activity.findViewById(R.id.cantidadEdit);
         precio = this.activity.findViewById(R.id.precioEdit);
        nombre.setText( modelo.getNombreProducto());

        cantidad.setText(modelo.getCantidad().toString());
        precio.setText(modelo.getPrecio().toString());

    }

    public void actualizarModelo(){
        modelo.setNombreProducto(nombre.getText().toString());
        modelo.setPrecio(Double.parseDouble(precio.getText().toString()));
        modelo.setCantidad(Integer.parseInt(cantidad.getText().toString()));
    }
}
