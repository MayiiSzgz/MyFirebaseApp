package com.example.myfirebaseapp.modelo;

public class Persona
{
    private String id;
    private String nombre;
    private String apellidos;
    private String correo_electronico;
    private String contrasenia;

    public Persona()
    {
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
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


}
