package pl.sternik.mm.zadanie09;

public class zad09
{
    public static void ZamienWiersze(int[][] Tablica, int wiersz_1, int wiersz_2)
    {
        int[] TablicaTymczasowa = Tablica[wiersz_1];
        Tablica[wiersz_1] = Tablica[wiersz_2];
        Tablica[wiersz_2] = TablicaTymczasowa;
    }

    public static void WyswietlTablice(int[][] Tablica)
    {
        for(int wiersze = 0; wiersze < Tablica.length; wiersze++)
        {
            for(int kolumny = 0; kolumny < Tablica[wiersze].length; kolumny++)
            {
                System.out.print(Tablica[wiersze][kolumny] + " ");
            }
            System.out.println();
        }
    }

    public static void main( String[] args )
    {
        int Tablica[][] = {{1, 4, 3, 2, 5},
                           {2, 4, 8},
                           {13, 1, 15, 4, 7, 9},
                           {12, 19, 23, 42},
                           {7, 5}};

        System.out.println("Tablica przed zmianami:");
        WyswietlTablice(Tablica);

        ZamienWiersze(Tablica, 0, 4);

        System.out.println();
        System.out.println("Tablica po zmianach:");
        WyswietlTablice(Tablica);

        System.out.println();
        System.out.println("RAPORT: zamieniono wiersze 0 i 4");
    }
}
