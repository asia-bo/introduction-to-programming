package obliczanieObwodu;

public class Prostokat extends Figura{

    private double bok1;
    private double bok2;

    public Prostokat(double bok1, double bok2) {
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

    public double getBok1(){
        return bok1;
    }

    //implementacja metody z klasy abstrakcyjnej
    @Override
    public double obliczPole() {
        return bok1 * bok2;
    }

    //implementacja metody z klasy abstrakcyjnej
    @Override
    public double obliczObwod() {
        return (2 * bok1) + (2 * bok2) ;

    }

    // nadpisanie metody toString z klasy Object do zwrócenia tekstowej reprezentacji obiektu
    @Override
    public String toString() {
        return "Jestem prostokątem o bokach: " + bok1 + bok2;
    }
}

