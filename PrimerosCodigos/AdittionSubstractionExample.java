import java.util.Scanner;
public class AdittionSubstractionExample{
	public static void main(String[] args){
	
    Scanner leer = new Scanner(System.in);
    boolean uno = false;
    	while(uno != true){

            int jirafas = -1;

                while(jirafas<0){
                System.out.println("Escriba la cantidad de girafas");
			    jirafas =  leer.nextInt();
		if(jirafas<0){
                System.out.println("Ingresaste un valor negativo :/");
		}
            }
	    
	    int cebras = 1;
		
		while(cebras<2){
		System.out.println("Escriba la cantidad de cebras");
		cebras = leer.nextInt();
		if(cebras<2){
                System.out.println("Ingresa un valor mayor o igual a 2");
		}
            }
			
			int animales = cebras + jirafas ;


     		boolean acerto = false;

				while(acerto != true){
                    			
                    System.out.println("cuantos son en total");
			        int respuesta = leer.nextInt(); 

					if(respuesta == animales){
		
						System.out.println("Correcto");
						acerto = true ;
					}
		
					else{
	 
						System.out.println("Incorrecto vuelve a intentar");
						acerto = false;
					}
		    	}

			boolean acerto2 = false;

      			while(acerto2 != true){
		
					animales = jirafas + cebras;

					System.out.println("Si se murieron dos cebras cuantos animales habria en total?");
					int respuesta2 = leer.nextInt(); 
	
					animales -= 2 ;
	
	
					acerto2 = respuesta2 == animales;
		
					if(respuesta2 == animales){
		
						System.out.println("Correcto");
                        acerto2 = true;

					}

					else{
						
						System.out.println("Incorrecto vuelve a intentar");
                        acerto2 = false;
					}
     }
uno = true ;
    }
}
}
