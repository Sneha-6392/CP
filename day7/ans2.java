package CP.day7;
public class ans2 {
    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        defaultCircle.display();
        Circle customCircle = new Circle(2);
        customCircle.display();
    }
}
class Circle {
    double radius;
    public Circle() {
        this(10); 
    }
    public Circle(int radius) {
        this.radius = radius;
    }
    public void display() {
        System.out.println("Radius: " + radius);
    }
}
