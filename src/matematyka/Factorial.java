package matematyka;

public class Factorial {
    // Napisz program obliczający n! (silnia)
    public static void main(String[] args) {
        System.out.println("Podaj n");
        int n = 5;
        int result = MathHelper.factorialRecursive(n);

        System.out.println(n + "! wynosi: " + result);


    }
}