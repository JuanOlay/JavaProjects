public class Circle {
    public double pi = 3.14;
    public double radius;
    public Circle(double diameter){
        System.out.println("Creating circle with diameter "+ diameter);
       radius = diameter/2;
    }
    public double Circumference(){
    return 2*this.pi*this.radius;
}
    public double Area(){
        return this.pi*this.radius*this.radius;
    }
    public static void main(String[] args) {
        Circle medium_pizza = new Circle(12);
        Circle teaching_table = new Circle(36);
        Circle round_room = new Circle(11460);
        
        System.out.println(medium_pizza.Circumference());
        System.out.println(teaching_table.Circumference());
        System.out.println(round_room.Circumference());
        
        System.out.println(medium_pizza.Area());
        System.out.println(teaching_table.Area());
        System.out.println(round_room.Area());
    }
        
  }
