import java.util.Scanner;
public class ConditionalEample3 {

    public static void main(String[] args) {  

	Scanner leer = new Scanner(System.in);
	
	System.out.println("Escriba una nota");
        int nota= leer.nextInt();  

        if(nota<50 && nota>=0){  
            System.out.println("reprobo");  
        }  
        else if(nota>=50 && nota<60){  
            System.out.println("D");  
        }  
        else if(nota>=60 && nota<70){  
            System.out.println("C");  
        }  
        else if(nota>=70 && nota<80){  
            System.out.println("B");  
        }  
        else if(nota>=80 && nota<90){  
            System.out.println("A");  
        }else if(nota>=90 && nota<=100){  
            System.out.println("A+");  
        }else{  
            System.out.println("Invalido");  
    }  
 }     
}