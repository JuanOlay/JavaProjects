class Car{
	private String nombre_compania;
	private String nombre_modelo;
	private int year;
	private double kilometraje;

	public String getNombre_compania(){
		return nombre_compania;

	}

  	public void setNombre_compania(String nombre_compania) {
    	this.nombre_compania = nombre_compania;

	}

  	public String getNombre_modelo() {
    	return nombre_modelo;
  
	}

  	public void setNombre_modelo(String nombre_modelo) {
    	this.nombre_modelo = nombre_modelo;
  
	}

  	public int getYear() {
    	return year;
  
	}

  	public void setYear(int year) {
    	this.year = year;
  
	}

  	public double getKilometraje() {
    	return kilometraje;
  
	}

	public void setKilometraje(int kilometraje){
	this.kilometraje = kilometraje;

	}
}