package com.example.myapplication;

import android.widget.Button;

public class EditController {

    EditView view;
    public EditController( EditView view){
        this.view = view;
    }
    public void cargarDatos(){
        this.view.cargarModelo();
    }
    public void guardarDatos(){
        this.view.actualizarModelo();
    }
    public void setListener(EditActivity editActivity){
        OnClickListenerGeneric listener = new OnClickListenerGeneric(editActivity,this);
        Button btn_guardar = editActivity.findViewById(R.id.Guardar);
        btn_guardar.setOnClickListener(listener);
    }
}
