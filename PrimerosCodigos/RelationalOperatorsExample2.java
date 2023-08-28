import java.util.Scanner;
public class RelationOperatorsExample2 {
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de estudiantes de la clase A");
		int estudiantesclaseA = leer.nextInt();
		System.out.println("Ingrese la cantidad de estudiantes de la clase B");
		int estudiantesclaseB = leer.nextInt();
		System.out.println("Ingrese la cantidad de estudiantes de la clase C");
		int estudiantesclaseC= leer.nextInt();
		boolean mismacantidaddeestudiantesAB = estudiantesclaseA==estudiantesclaseB;
		boolean diferentecantidaddeestudiantesAC = estudiantesclaseA != estudiantesclaseC;
		System.out.println("La cantidad de estudiantes en la clase A y B es la misma? " + mismacantidaddeestudiantesAB);
		System.out.println("La cantidad de estudiantes en la clase A y C es la diferente? " + diferentecantidaddeestudiantesAC);
	}
}