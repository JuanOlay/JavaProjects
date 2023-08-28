import java.util.Scanner;
public class Calculadora{
	public Calculadora(){

	}

	public double suma(double a,double b){
	return a + b;

	}

	public double resta(double a,double b){
	return a - b;

	}

	public double multiplicar(double a,double b){
	return a * b;

	}

	public double dividir(double a,double b){
	return a / b;

	}


	public double modulo(double a,double b){
	return a % b;

	}

	public static void main(String[] args){

	Scanner leer = new Scanner(System.in);


	System.out.println("Desea hacer una operacion?y or n");
	String respuesta = leer.next();

		if (respuesta.equals("y")){

		while(respuesta.equals("y")){

		Calculadora micalculadora = new Calculadora();

		System.out.println("Que operacion desea hacer ? suma resta multiplicacion division o modulo" );
		String respuesta2 = leer.next();

			if(respuesta2.equals("suma")){

			System.out.println("Escriba el primer valor");
			double a = leer.nextDouble();

			System.out.println("Escriba el segundo valor");
			double b = leer.nextDouble();

			System.out.println("= " + micalculadora.suma(a,b));
			
			}


			else if(respuesta2.equals("resta")){

			System.out.println("Escriba el primer valor");
			double a = leer.nextDouble();

			System.out.println("Escriba el segundo valor");
			double b = leer.nextDouble();

			System.out.println("= " + micalculadora.resta(a,b));
			
			}


			else if(respuesta2.equals("multiplicacion")){

			System.out.println("Escriba el primer valor");
			double a = leer.nextDouble();

			System.out.println("Escriba el segundo valor");
			double b = leer.nextDouble();

			System.out.println("= " + micalculadora.multiplicar(a,b));
			
			}


			else if(respuesta2.equals("division")){

			System.out.println("Escriba el primer valor");
			double a = leer.nextDouble();

			System.out.println("Escriba el segundo valor");
			double b = leer.nextDouble();

			System.out.println("= " + micalculadora.dividir(a,b));
			
			}


			else if(respuesta2.equals("modulo")){

			System.out.println("Escriba el primer valor");
			double a = leer.nextDouble();

			System.out.println("Escriba el segundo valor");
			double b = leer.nextDouble();

			System.out.println("= " + micalculadora.modulo(a,b));
			
			}

			else{

			System.out.println("Escriba un valor valido");

			}

		System.out.println("Desea hacer mas operaciones ? y or n");
		respuesta = leer.next();		

		}
		
		}

		else if( respuesta.equals("n")){

		System.out.println("bueno");

		}

		else{

		System.out.println("Escriba un valor valido");

		}	


	leer.close();

	}
}