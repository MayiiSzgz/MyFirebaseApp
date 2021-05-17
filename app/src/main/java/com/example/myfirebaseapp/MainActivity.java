package com.example.myfirebaseapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
{
    private EditText nombrePersona, apellidoPersona, correoPersona, contraseñaPersona;
    private ListView listVPersonas;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombrePersona = (EditText) findViewById(R.id.NombrePersona);
        apellidoPersona = (EditText) findViewById(R.id.ApellidosPersona);
        correoPersona = (EditText) findViewById(R.id.CorreoPersona);
        contraseñaPersona = (EditText) findViewById(R.id.ContraseñaPersona);

        listVPersonas = (ListView) findViewById(R.id.lv_ListaPersonas);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        return true;
    }
}