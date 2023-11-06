public class RightTriangle {
  
    public double base;
    public double altura;
    public double hipotenusa;
    public RightTriangle(double base, double altura, double hipotenusa){
        System.out.println("Creating Right Triangle with base " + base +" height " + altura + " and hypotenuse " + hipotenusa);
        this.altura = altura;
        this.base = base;
        this.hipotenusa = hipotenusa;
    }
    public double Perimetro(){
    return this.base + this.altura + this.hipotenusa;
}
    public double Area(){
        return (this.base*this.altura)/2;
    }
    public static void main(String[] args) {
    Right_Triangle Triangle1 = new RightTriangle(1,3,7);
    Right_Triangle Triangle2 = new RightTriangle(3,4,9);
    Right_Triangle Triangle3 = new RightTriangle(1,4,8);
        
        System.out.println(Triangle1.Perimetro());
        System.out.println(Triangle2.Perimetro());
        System.out.println(Triangle3.Perimetro());
        
        System.out.println(Triangle1.Area());
        System.out.println(Triangle2.Area());
        System.out.println(Triangle3.Area());
    }
        
  }
