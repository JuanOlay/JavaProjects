
package inhiretance;

public class Person {
    protected String nombre;
    protected char genero;
    protected  int edad;
    protected String direccion;

    public Person() {
    }

    public Person(String nombre) {
        this.nombre = nombre;
    }

    public Person(char genero) {
        this.genero = genero;
    }
 
    public Person(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public char getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person{");
        sb.append("nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
