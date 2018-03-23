package pl.sternik.mm.proc_obj.proceduralnie;

public class ProceduraPole {
    public static int countPole(Kwadrat k) {
        int wynik = 0;
        wynik = k.a * k.a;
        return wynik;
    }

    public static int countPole(Prostokat p) {
        int wynik = 0;
        wynik = p.a * p.b;
        return wynik;
    }

    public static double countPole(Kolo k) {
        double wynik = 0;
        wynik = k.r * k.r * Math.PI;
        return wynik;
    }
}
