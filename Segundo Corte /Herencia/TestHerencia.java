package test;

import inhiretance.*;

import java.util.Date;
public class TestHerencia {
    public static void main(String[] args) {
        
        Person persona = new Person("Alex", 'M', 25, "Cusco");

        imprimir(persona);

        Employee empleado1 = new Employee(3000,"Gutierrez");

        imprimir(empleado1);
        
        var fecha = new Date();
        Client cliente = new Client(fecha,true,"Juan",'M',25,"Santo Tomás");
             
        imprimir(cliente);
        determinarTipo(persona);
        determinarTipo(empleado1);
        determinarTipo(cliente);
        
        String miNombre = "Henry";
        determinarTipo(miNombre);
        

    Person p1 = new Person("Henry", 'M', 45, "Bogotá");
    Person p2 = new Person("Henry", 'M', 45, "Bogotá");
    
    System.out.println(p1 == p2);
    System.out.println("Hola" == "Hola");
    System.out.println(p1.equals(p2));
    
    
    }        
    
    public static void imprimir(Person personaje) {
        System.out.println(personaje.obtenerDetalle());
    }
    
    
           
    public static void determinarTipo(Object objeto){
        if(objeto instanceof Employee){
            System.out.println("Es de Tipo Empleado");
        }else if (objeto instanceof Client){
            System.out.println("Es de tipo Cliente");
        }else if (objeto instanceof Person){
            System.out.println("Es de Tipo Persona");
        }else if (objeto instanceof Object){
            System.out.println("Es de tipo Object");
        }
    }

}
