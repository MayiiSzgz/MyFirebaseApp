package com.example.myfirebaseapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity
{
    private EditText nombrePersona, apellidoPersona, correoPersona, contraseniaPersona;
    private ListView listVPersonas;

    FirebaseDatabase firebaseDatabase; //Agregamos firedatabase
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombrePersona = (EditText) findViewById(R.id.NombrePersona);
        apellidoPersona = (EditText) findViewById(R.id.ApellidosPersona);
        correoPersona = (EditText) findViewById(R.id.CorreoPersona);
        contraseniaPersona = (EditText) findViewById(R.id.ContraseñaPersona);

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
        String nombre = nombrePersona.getText().toString();
        String apellidos = apellidoPersona.getText().toString();
        String correo = correoPersona.getText().toString();
        String contrasenia = contraseniaPersona.getText().toString();
        switch(item.getItemId())
        {
            case (R.id.icon_add):
                if(nombre.equals("") ||apellidos.equals("") || correo.equals("") || contrasenia.equals(""))  //Agreagamos metodo de validaciones
                {
                    validacion();
                    break;
                }
                else
                {
                    Toast.makeText(this, "Agregado", Toast.LENGTH_SHORT).show();
                    limpiarCajas();   //Agregamos metodo para limpiar cajas, una vez agregado los datos se limpian para volver agregar mas datos
                    break;
                }
        }

        return true;
    }

    private void limpiarCajas() //cambia el texto por texto en blanco
    {
        nombrePersona.setText("");
        apellidoPersona.setText("");
        correoPersona.setText("");
        contraseniaPersona.setText("");
    }

    private void validacion()
    {
        String nombre = nombrePersona.getText().toString();
        String apellidos = apellidoPersona.getText().toString();
        String correo = correoPersona.getText().toString();
        String contrasenia = contraseniaPersona.getText().toString();
        if (nombre.equals(""))
        {
            nombrePersona.setError("Requerido");
        }
        else
        {
            if(apellidos.equals(""))
            {
                apellidoPersona.setError("Requerido");
            }
            else
            {
                if(correo.equals(""))
                {
                    correoPersona.setError("Requerido");
                }
                else
                {
                    if (contrasenia.equals(""))
                    {
                        contraseniaPersona.setError("Requerido");
                    }
                }
            }
        }
    }
}