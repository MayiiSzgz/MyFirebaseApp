package com.example.myfirebaseapp.modelo;

public class Persona
{
    public String id;
    public String nombre;
    public String apellidos;
    public String correo_electronico;

    public Persona(String id, String nombre, String apellidos, String correo_electronico)
    {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo_electronico = correo_electronico;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellidos()
    {
        return apellidos;
    }

    public void setApellidos(String apellidos)
    {
        this.apellidos = apellidos;
    }

    public String getCorreo_electronico()
    {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico)
    {
        this.correo_electronico = correo_electronico;
    }

    @Override
    public String toString()
    {
        return nombre;
    }
}
