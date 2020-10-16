package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Button;

public class EditActivity extends AppCompatActivity {
    EditView editView;
    ProductoModel editModel;
    EditController editController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        ActionBar ab  = super.getSupportActionBar();
        ab.setTitle(R.string.app_name2);
        ab.setDisplayHomeAsUpEnabled(true);

        Integer indice = Integer.parseInt(getIntent().getExtras().get("indice").toString());
        Log.d("Seguimiento","id:"+indice );

        editModel =  MainActivity.productos.get(indice);
        editView = new EditView(this,editModel);
        editController= new EditController(editView);

        editController.setListener(this);
        editController.cargarDatos();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()== android.R.id.home){
            super.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}