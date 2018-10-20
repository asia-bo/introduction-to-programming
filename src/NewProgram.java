import matematyka.Prostokat;

import java.util.Scanner;

class NewProgram {
    public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj pierwszy bok");
        double a = odczyt.nextDouble();
        System.out.println("Podaj drugi bok");
        double b = odczyt.nextDouble();

        Prostokat pr = new Prostokat(a, b);
        System.out.println("Obwod prostokata to: " + pr.obliczObwod());
        System.out.println("Pole prostokata to: " + pr.obliczPole());
    }
}
