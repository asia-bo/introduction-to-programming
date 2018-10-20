package matematyka;

public class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius,2);
    }
}
