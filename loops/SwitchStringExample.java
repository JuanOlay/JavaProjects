public class SwitchStringExample {    
public static void main(String[] args) {    

    String nivelString="Experto";  
    int nivel=0;  
  
    switch(nivelString){    

    case "Principiante": nivel=1;  
    break;    
    case "Intermedio": nivel=2;  
    break;    
    case "Experto": nivel=3;  
    break;    
    default: nivel=0;  
    break;  
    }    
    System.out.println("Tu nivel es: "+ nivel);  
}    
}   