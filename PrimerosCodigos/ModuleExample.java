import java.util.Scanner;
public class ModuleExample {
	public static void main(String[] args){

	Scanner leer = new Scanner(System.in);
	System.out.println("Cuantos estudiantes deben estar?");
	int estudiantes = leer.nextInt();
	int faltan = estudiantes%3;
	System.out.println("Faltan " + faltan + " estudiantes");
	

	}
}