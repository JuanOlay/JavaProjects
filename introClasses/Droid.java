public class Droid {
	int nivelbateria;
	String nombre;

	public Droid(String nombre){
	
	nivelbateria=100;
	this.nombre = nombre;
	
	}

public String toString(){
	
	return "hola, yo soy el droid de " + nombre ;

	}

public void tareaproceso(String tarea) {

	System.out.println(nombre + " esta ejecutando " + tarea);

	}

public void PerdidaDeBateria() {

	nivelbateria -=10;

	}

public void Carga(){

	System.out.println(nivelbateria);

	}

public static void main (String[] args){

	Droid Codey = new Droid("Codey");
	System.out.println(Codey.nombre);       
        System.out.println(Codey.toString());
        Codey.tareaproceso("bailando");
        Codey.PerdidaDeBateria();
        Codey.Carga();

	}
}