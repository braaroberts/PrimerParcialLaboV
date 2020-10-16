package com.example.myapplication;

import android.app.Activity;
import android.util.Log;
import android.view.View;

public class OnClickListenerGeneric implements View.OnClickListener {

    EditActivity activity;
    EditController editController;
    public OnClickListenerGeneric(EditActivity activity, EditController editController){
        this.editController = editController;
        this.activity = activity;
    }
    @Override
    public void onClick(View v) {
        this.editController.guardarDatos();
        activity.finish();
    }
}
