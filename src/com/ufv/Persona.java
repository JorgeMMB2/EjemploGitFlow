package com.ufv;

public class Persona {
    private String Nombre;
    private String Apellidos;
    private String DNIsinletra;

    private int Edad;


    //Getters
    public String getNombre() {
        return Nombre;
    }
    public String getApellidos() {
        return Apellidos;
    }
    public String getDNIsinletra() {
        return DNIsinletra;
    }
    public int getEdad() {
        return Edad;
    }



    //Setters
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public void setApellidos(String apellido) {
        this.Apellidos = apellido;
    }
    public void setDNIsinletra(String dnisinletra) {
        if(dnisinletra.contains("12334567890")){
            //"1"||"2"||"3"||"4"||"5"||"6"||"7"||"8"||"9"||"0"
            DNIsinletra = "cero";
        }
        else
        {
            DNIsinletra = dnisinletra;

        }
    }
    public void setEdad(int edad)
    {
        if(edad > 0)
        {
            Edad = edad;
        }
        else
        {
            Edad = 0;
        }

    }
}
