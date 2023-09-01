import java.util.Scanner;
public class ConditionalExample2 {
    
    public static void main(String[] args) {
    
	Scanner leer = new Scanner(System.in);	

	System.out.println("Escriba el primer valor entero");
        int x = leer.nextInt();  

	System.out.println("Escriba el segundo valor entero");
        int y = leer.nextInt();  
    
        if(x+y < 10) {  
            System.out.println(x + " + " + y + " es menor a 10");  
        }   
    else {  
        System.out.println(x + " + " + y + " es mayor o igual a 10");  
        }  

	leer.close();

    }
}    