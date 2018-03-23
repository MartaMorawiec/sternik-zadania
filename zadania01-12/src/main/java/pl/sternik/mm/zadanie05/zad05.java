package pl.sternik.mm.zadanie05;

public class zad05 {

    public static void main(String[] args )
    {
        String[] DowolnaTabela = {"Wiosna", "Lato", "Jesień", "Zima"};

        System.out.print("FOR: ");
        // FOR(wyrażenie początkowe; warunek; modyfikator licznika) { instrukcje }
        for(int licznik = 0; licznik < DowolnaTabela.length; licznik++){
            System.out.print(DowolnaTabela[licznik] + " ");
        }

        System.out.println();
        System.out.print("FOR-EACH: ");
        // FOR(Typ_Obiektu nazwa_obiektu : nazwa_tablicy) { instrukcje }
        for(String wypisz : DowolnaTabela){
            System.out.print(wypisz + " ");
        }

        System.out.println();
        System.out.print("WHILE: ");
        // WHILE(warunek) { instrukcje }
        int licznik = 0;
        while(licznik < DowolnaTabela.length){
            System.out.print(DowolnaTabela[licznik] + " ");
            licznik++;
        }


    }
}
