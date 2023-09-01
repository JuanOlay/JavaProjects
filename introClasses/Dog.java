import java.util.ArrayList;
import java.util.Scanner;

public class Dog {
    String nombre;
    String raza;
    boolean tienedueno;
    byte edad;

    public Dog(String nombre, String raza, boolean tienedueno, byte edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.tienedueno = tienedueno;
        this.edad = edad;
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Dog> Perrocreados = new ArrayList<Dog>();

        byte respuesta ;
        
        do {
            System.out.println("Quieres ingresar un perrito?\n0. No\n1. Si");
            respuesta = leer.nextByte();

            if (respuesta == 0) {
                System.out.println("Programa finalizado");
                break;
            } else if (respuesta == 1) {
                System.out.println("Nombre");
                String nombre = leer.next();

                System.out.println("Raza");
                String raza = leer.next();

                boolean tienedueno = false;
                String tieneduenorespuesta = "sabee";

                do {
                    System.out.println("Tiene dueño? y or n ");
                    tieneduenorespuesta = leer.next();

                    if (tieneduenorespuesta.equals("y")) {
                        tienedueno = true;
                        tieneduenorespuesta="y";
                    } else if (tieneduenorespuesta.equals("n")) {
                        tienedueno = false;
                        tieneduenorespuesta="n";
                    } else {
                        System.out.println("Escriba un valor valido");
                    }
                } while (tieneduenorespuesta != "y" && tieneduenorespuesta != "n");

                System.out.println("Edad");
                byte edad = leer.nextByte();

                Dog perro = new Dog(nombre, raza, tienedueno, edad);
                Perrocreados.add(perro);

                System.out.println("Perro en lista:");
                for (Dog Perro : Perrocreados) {
                    System.out.println("Nombre: " + Perro.nombre
                            + "\nRaza : " + Perro.raza
                            + "\nTiene dueño : " + (Perro.tienedueno ? "Si" : "No")
                            + "\nEdad : " + Perro.edad);
                    System.out.println("------------------------");
                }
            }
        } while (respuesta == 1);
        leer.close();
    }
}
