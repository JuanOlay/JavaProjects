import java.util.Scanner;
public class ConditionalExample {

    public static void main(String[] args) {

	Scanner leer = new Scanner(System.in);
	
	System.out.println("Escribe el primer valor entero");
	int x = leer.nextInt();

	System.out.println("Escriba el segundo valor entero");
	int y = leer.nextInt();
    
        if(x+y > 20) {    

            System.out.println(x + " +  " + y + " es mayor que 20");    
        }    
    
	leer.close();

	}      

}