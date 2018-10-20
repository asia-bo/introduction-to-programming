package matematyka;

public class Prostokat {
    public double bokA;
    public double bokB;

    public Prostokat(double a, double b){
        this.bokA = a;
        this.bokB = b;
    }
    public double obliczPole() {
        return bokA * bokB;
    }

    public double obliczObwod() {
        return 2 * bokA + 2 * bokB;
    }
}