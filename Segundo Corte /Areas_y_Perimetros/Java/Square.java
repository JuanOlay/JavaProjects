package Square;

public class Square {
  
    public double lado;
    public Square(double lado){
        System.out.println("Creating Square with side " + lado);
        this.lado= lado;
    }
    public double Perimetro(){
    return 4*this.lado;
}
    public double Area(){
        return this.lado*this.lado;
    }
    public static void main(String[] args) {
        Square Square1 = new Square(12);
        Square Square2 = new Square(3);
        Square Square3 = new Square(24);
        
        System.out.println(Square1.Perimetro());
        System.out.println(Square2.Perimetro());
        System.out.println(Square3.Perimetro());
        
        System.out.println(Square1.Area());
        System.out.println(Square2.Area());
        System.out.println(Square3.Area());
    }
        
  }
