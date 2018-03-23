package pl.sternik.mm.zadanie07;

import java.util.Scanner;

public class zad07
{
    public static void main( String[] args )
    {
        int[] Tablica = {10, 25, 35, 42, 18, 11, 52, 144, 19, 125};

        //wypisanie tablicy
        //for(int wypisz : Tablica) { System.out.print(wypisz + " "); }
        //System.out.println();

        System.out.print("Podaj podzielnik: ");

        Scanner scanner = new Scanner(System.in);
        int podzielnik = Integer.parseInt(scanner.nextLine());

        System.out.println("FOR");
        for(int licznik = 0; licznik < Tablica.length; licznik++)
        {
            if(Tablica[licznik] % podzielnik == 0)
            {
                System.out.println(Tablica[licznik] + " jest podzielna przez " + podzielnik + " znajduje się na pozycji " + licznik);
            }
        }

        System.out.println();
        System.out.println("WHILE");
        int licznik = 0;
        while(licznik < Tablica.length)
        {
            if(Tablica[licznik] % podzielnik == 0)
            {
                System.out.print(Tablica[licznik] + " jest podzielna przez " + podzielnik + " znajduje się na pozycji " + licznik);
                break;
            }
            licznik++;
        }
    }
}
