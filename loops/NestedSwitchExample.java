public class NestedSwitchExample {    
    public static void main(String args[])  
      {  
 
        char rama = 'C';                 
        int añoEscolar = 4;  
        switch( añoEscolar )  
        {  
            case 1:  
                System.out.println("English, Maths, Science");  
                break;  
            case 2:  
                switch( rama )   
                {  
                    case 'C':  
                        System.out.println("Operacion de sistemas, Java, Estructura de datos");  
                        break;  
                    case 'E':  
                        System.out.println("Micro procesadores, Logic switching theory");  
                        break;  
                    case 'M':  
                        System.out.println("Dibujo, Manufacturacion de maquinas");  
                        break; 


		    default: 
			System.out.println("Rama invalida");
			break;  
                }  
                break;  
            case 3:  
                switch( rama )   
                {  
                    case 'C':  
                        System.out.println("Organizacion de computadoras, MultiMedia");  
                        break;  
                    case 'E':  
                        System.out.println("Fundamentación el la logica del diseño, Microelectronicos");  
                        break;  
                    case 'M':  
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");  
                        break; 


		    default: 
			System.out.println("Rama invalida");
			break; 
                }  
                break;  
            case 4:  
                switch( rama )   
                {  
                    case 'C':  
                        System.out.println("Data Communication and Networks, MultiMedia");  
                        break;  
                    case 'E':  
                        System.out.println("Embedded System, Image Processing");  
                        break;  
                    case 'M':  
                        System.out.println("Production Technology, Thermal Engineering");  
                        break; 

		    default: 
			System.out.println("Rama invalida");
			break; 
                }  
                break;  


	      default: 
		System.out.println("Año escolar invalida");
		break; 
        }  
    }  
}  