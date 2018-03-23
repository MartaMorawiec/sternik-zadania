package pl.sternik.mm.proc_obj.obiektowo;

public class App 
{
    public static void main( String[] args )
    {
        Figura f = new Prostokat(2, 4);
        System.out.print("Prostokąt pole i obwód: ");
        System.out.print(f.countPole() + "  ");
        System.out.println(f.countObwod());

        f = new Kwadrat(2);
        System.out.print("Kwadrat pole i obwód: ");
        System.out.print(f.countPole() + "  ");
        System.out.println(f.countObwod());

        f = new Kolo(4);
        System.out.print("Koło pole i obwód: ");
        System.out.print(f.countPole() + "  ");
        System.out.println(f.countObwod());
    }
}
