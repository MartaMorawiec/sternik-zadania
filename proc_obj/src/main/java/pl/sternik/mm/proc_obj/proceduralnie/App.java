package pl.sternik.mm.proc_obj.proceduralnie;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Prostokat p = new Prostokat(2, 4);
        System.out.print("Prostokąt pole i obwód: ");
        System.out.print(ProceduraPole.countPole(p) + "  ");
        System.out.println(ProceduraObwod.countObwod(p));

        Kwadrat k = new Kwadrat(2);
        System.out.print("Kwadrat pole i obwód: ");
        System.out.print(ProceduraPole.countPole(k) + "  ");
        System.out.println(ProceduraObwod.countObwod(k));

        Kolo ko = new Kolo(4);
        System.out.print("Koło pole i obwód: ");
        System.out.print(ProceduraPole.countPole(ko)+ "  ");
        System.out.println(ProceduraObwod.countObwod(ko));
    }
}
