public class Main {
  	public static void main(String[] args) {
    	Car car = new Car();


    	car.setNombre_compania("Chevrolet");
    	car.setNombre_modelo("Cruze");
    	car.setYear(2009);
	car.setKilometraje(0);


    	String nombre_compania = car.getNombre_compania();
    	String nombre_modelo = car.getNombre_modelo();
    	int year = car.getYear();
    	double kilometraje = car.getKilometraje();



    	System.out.println("Nombre de la compa\u00f1ia " + nombre_compania);
    	System.out.println("Nombre del modelo: " + nombre_modelo);
    	System.out.println("A\u00f1o: " + year);
    	System.out.println("Kilometraje: " + kilometraje);
  }
}