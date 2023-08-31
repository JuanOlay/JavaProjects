public class SwitchMonthExample {    
public static void main(String[] args) {    
 
    int mes=7;    
    String mesnombre="";  
  
    switch(mes){    
 
    case 1: mesnombre="1 - Enero";  
    break;    
    case 2: mesnombre="2 - Febrero";  
    break;    
    case 3: mesnombre="3 - Marzo";  
    break;    
    case 4: mesnombre="4 - Abril";  
    break;    
    case 5: mesnombre="5 - Mayo";  
    break;    
    case 6: mesnombre="6 - Junio";  
    break;    
    case 7: mesnombre="7 - Julio";  
    break;    
    case 8: mesnombre="8 - Agosto";  
    break;    
    case 9: mesnombre="9 - Septiembre";  
    break;    
    case 10: mesnombre="10 - Octubre";  
    break;    
    case 11: mesnombre="11 - Noviembre";  
    break;    
    case 12: mesnombre="12 - Diciembre";  
    break;    
    default:System.out.println("Mes invalido");    
    }     
    System.out.println(mesnombre);  
}    
}   