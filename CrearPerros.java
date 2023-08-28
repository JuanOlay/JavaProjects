package com.example;
import java.util.ArrayList;
import java.util.Scanner;

public class CrearPerros {

    public static void main(String[] args) {

        
        Scanner leer = new Scanner(System.in);
            System.out.println("Quieres ingresar un perrito " + "\n" + "0. No" + "\n" + "1. Si");
            
            int respuesta = leer.nextInt();
            
            if(respuesta == 0) {
                
                System.out.println("Programa finalizado");
            }
            
            else if(respuesta == 1) {
                
                System.out.println("Nombre");
                String nombre = leer.next();
                
                
                System.out.println("Raza");
                String raza = leer.next();
                
                boolean tienedueño = false;

                String tienedueñorespuesta = "sabeee";

            while (tienedueñorespuesta != "y" && tienedueñorespuesta != "n"){

                System.out.println("Tiene dueño? y or n ");
                tienedueñorespuesta = leer.next();
            
                if(tienedueñorespuesta.equals("y")){
                    tienedueño = true;
                    tienedueñorespuesta = "y";
                }
                else if(tienedueñorespuesta.equals("n")){
                    tienedueño = false;
                    tienedueñorespuesta = "n";
                } else {
                    System.out.println("Escriba un valor valido");
                }
            }

                System.out.println("Edad");
                int edad = leer.nextInt();
                leer.nextLine();
                
                Dog perro = new Dog(nombre, raza, tienedueño , edad );
                
                ArrayList<Dog> Perrocreados = new ArrayList<Dog>();

                Perrocreados.add(perro);
                
                for (Dog Perro : Perrocreados) {
                    
                    System.out.println("Perro en lista: " + "\n" + "Nombre: " + Perro.getNombre() 
                    + "\n" + "Raza : " + Perro.getRaza() 
                    + "\n" + "Tiene dueño : " + Perro.getTienedueño()
                    + "\n" + "Edad : " + Perro.getEdad());
                    System.out.println("------------------------");
                }

            }
            
            else {
                System.out.println("Introduce un numero valido");
            }
        leer.close ();
    }

}