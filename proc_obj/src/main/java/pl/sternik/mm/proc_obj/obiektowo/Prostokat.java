package pl.sternik.mm.proc_obj.obiektowo;

public class Prostokat extends Figura {
    public int a;
    public int b;

    public Prostokat(int a, int b) {
        super();
        this.a = a;
        this.b = b;
    }

    @Override
    public double countPole() {
        return a * b;
    }
    @Override
    public double countObwod() {
        return 2 * a + 2 * b;
    }
}