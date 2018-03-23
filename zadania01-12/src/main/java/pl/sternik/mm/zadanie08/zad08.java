package pl.sternik.mm.zadanie08;

import java.util.Scanner;

public class zad08
{
    public static void WyswietlTablice(int[][] Tablica)
    {
        for(int wiersze = 0; wiersze < Tablica.length; wiersze++)
        {
            for(int kolumny = 0; kolumny < Tablica[wiersze].length; kolumny++)
            {
                System.out.print(wiersze + "-" + kolumny + " ");
            }
            System.out.println();
        }
    }

    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę kolumn. Kolejne liczby oddzielaj spacją: ");
        String kolumny = scanner.nextLine();

        String[] TablicaLiczbKolumn = kolumny.split(" ");

        int[][] TablicaLiczb = new int[TablicaLiczbKolumn.length][];
        for(int licznik = 0; licznik < TablicaLiczb.length; licznik++)
        {
            TablicaLiczb[licznik] = new int[Integer.parseInt(TablicaLiczbKolumn[licznik])];
        }

        WyswietlTablice(TablicaLiczb);
    }
}
