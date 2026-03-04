package polymorphisme;

public class Calcul {
    public double calculerFormule(int x) { return (double)x + 273.15; }
    public int calculerFormule(double x) { return (int)(x - 273.15); }
}
