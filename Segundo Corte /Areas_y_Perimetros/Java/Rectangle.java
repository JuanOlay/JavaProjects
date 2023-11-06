public class Rectangle {
  
    public double ancho;
    public double largo;
    public Rectangle(double ancho, double largo){
        System.out.println("Creating rectangle with widht "+ ancho + " and length "+ largo);
        this.ancho= ancho;
        this.largo = largo;
    }
    public double Perimetro(){
    return 2*this.largo + 2*this.ancho;
}
    public double Area(){
        return this.largo*this.ancho;
    }
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(10,13);
        Rectangle box2 = new Rectangle(12,46);
        Rectangle box3 = new Rectangle(14,28);
        
        System.out.println(box1.Perimetro());
        System.out.println(box2.Perimetro());
        System.out.println(box3.Perimetro());
        
        System.out.println(box1.Area());
        System.out.println(box2.Area());
        System.out.println(box3.Area());
    }
        
  }
