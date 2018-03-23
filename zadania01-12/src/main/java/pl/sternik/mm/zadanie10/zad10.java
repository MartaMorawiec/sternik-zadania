package pl.sternik.mm.zadanie10;

import java.util.Scanner;

public class zad10
{
    public static void main( String[] args )
    {
        int[][] TablicaLiczb = {{1, 1, 1, 2}, {2, 1, 2, 2}};
        char[] TablicaZnakow = {'+', '/', '-', '*'};

        int[] TablicaWynikow = new int[TablicaLiczb[0].length];

        TablicaZnakow[1] = 'x';

        for(int licznik = 0; licznik < TablicaZnakow.length; licznik++)
        {
            switch(TablicaZnakow[licznik])
            {
                case '+': TablicaWynikow[licznik] = TablicaLiczb[0][licznik] + TablicaLiczb[1][licznik]; break;
                case '/': TablicaWynikow[licznik] = TablicaLiczb[0][licznik] / TablicaLiczb[1][licznik]; break;
                case '-': TablicaWynikow[licznik] = TablicaLiczb[0][licznik] - TablicaLiczb[1][licznik]; break;
                case '*': TablicaWynikow[licznik] = TablicaLiczb[0][licznik] * TablicaLiczb[1][licznik]; break;
                default: TablicaWynikow[licznik] = TablicaLiczb[0][licznik] + TablicaLiczb[1][licznik]; break;
            }
        }

        for (int wypisz : TablicaWynikow)
        {
            System.out.println(wypisz);
        }
    }
}
