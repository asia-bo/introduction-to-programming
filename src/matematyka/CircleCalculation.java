package matematyka;

import java.util.Scanner;

public class CircleCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promien: ");
        double r = scanner.nextDouble();
        Circle c = new Circle(r);

        System.out.println("Pole koła o promieniu " + c.radius + " to: " + c.calculateArea());


    }
}
