import java.util.Scanner;
public class RelationalOperatorExample1{
	String nombre;
	int creditos;

	public RelationalOperatorExample1 (String nombremateria,int creditosmateria){	
	nombre = nombremateria ;
	creditos = creditosmateria;
}
	public static void main(String[] args){	
	
	Scanner leer = new Scanner(System.in);
	
	int creditosgraduarse = 180;
	
	System.out.println("Escriba los creditos actuales");
	int creditosactuales = leer.nextInt();
	leer.nextLine();
	
	System.out.println("Escriba el nombre de la nueva materia");
	String nombremateria = leer.nextLine();
	
	System.out.println("Escriba los créditos de la nueva materia");
        int creditosmateria = leer.nextInt();
	
	RelationalOperatorExample1 nuevamateria = new RelationalOperatorExample1(nombremateria,creditosmateria);
	int creditostotales = creditosactuales + nuevamateria.creditos;

	System.out.println("El nombre de la materia es " + nuevamateria.nombre);
	System.out.println("Otorga " + nuevamateria.creditos);
	System.out.println(creditosactuales > creditosgraduarse);
        System.out.println(creditosgraduarse < creditostotales);
	}
}