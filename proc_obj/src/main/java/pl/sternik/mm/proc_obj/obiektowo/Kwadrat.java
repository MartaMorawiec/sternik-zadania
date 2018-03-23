package pl.sternik.mm.proc_obj.obiektowo;

public class Kwadrat extends Figura{
    public int a;

    public Kwadrat(int a) {
        super();
        this.a = a;
    }
    @Override
    double countPole() {
        return a * a;
    }
    @Override
    double countObwod() {
        return 4 * a;
    }
}