package com.example;

public class Dog {
    
    String nombre;
    String raza;
    boolean tienedueño;
    int edad;
    
    

    public Dog(String nombre, String raza, boolean tienedueño, int edad) {
        super();
        this.nombre = nombre;
        this.raza = raza;
        this.tienedueño = tienedueño;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public boolean getTienedueño() {
        return tienedueño;
    }
    public void setTienedueño(boolean tienedueño){
        this.tienedueño = tienedueño;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    

}