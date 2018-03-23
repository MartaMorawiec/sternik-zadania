package pl.sternik.mm.zadanie11;

public class zad11
{
    public enum StanyZamowienia { NOWE, OCZEKUJACE, REALIZOWANE, WYSLANE, ZWROT }

    public static void Stan(StanyZamowienia stan)
    {
        switch(stan)
        {
            case REALIZOWANE:
                System.out.println("REALIZOWANE - Pilne!"); break;
            case ZWROT:
                System.out.println("ZWROT - Kontakt!"); break;
            default:
                System.out.println(stan.toString()); break;
        }
    }

    public static void main( String[] args )
    {
        for(StanyZamowienia stan : StanyZamowienia.values())
        {
            Stan(stan);
        }
    }
}
