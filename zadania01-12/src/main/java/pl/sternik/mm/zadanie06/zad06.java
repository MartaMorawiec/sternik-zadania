package pl.sternik.mm.zadanie06;

public class zad06
{
    public static void main( String[] args )
    {
        int[][] values = {{3,8,16},
                          {1,22,28,24},
                          {3},
                          {41,42}};

        int min = values[0][0];
        int max = values[0][0];

        // wypisanie tablicy postrzępionej i szukanie min, max
        for(int wiersze = 0; wiersze < values.length; wiersze++)
        {
            for(int kolumny = 0; kolumny < values[wiersze].length; kolumny++)
            {
                if(min > values[wiersze][kolumny])
                {
                    min = values[wiersze][kolumny];
                }
                if(max < values[wiersze][kolumny])
                {
                    max = values[wiersze][kolumny];
                }
                //System.out.print(values[wiersze][kolumny] + " ");
            }
            //System.out.println();
        }

        System.out.println("Najmniejsza wartość w tablicy: " + min);
        System.out.println("Największa wartość w tablicy: " + max);
    }
}
