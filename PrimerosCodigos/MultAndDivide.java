import java.util.Scanner;
public class MultAndDivide {
	public static void main(String[] args){
		
		Scanner leer = new Scanner(System.in);
		
		double iva = 0.0875;
		System.out.println("Escriba el subtotal");
		double subtotal = leer.nextDouble();
		double total = subtotal + (subtotal*iva);
		double porpersona = total/4;

		System.out.println("El total es " + total);
		System.out.println("El valor por persona es " + porpersona);
	}
}