public class Kohvijoomine {
    public static void main(String[] args) {

        Kohv kohv1=new Kohv("Arabica", 2);
        Kohv kohv2=new Kohv("Robusta", 1.5);

        Programmeerija Teet = new Programmeerija("Teet", 1000, 5, kohv1);
        Programmeerija Tiit = new Programmeerija("Tiit", 500, 2, kohv2);
        Programmeerija Peep = new Programmeerija("Peep", 200);

        System.out.println(Teet);
        System.out.println(Tiit);
        System.out.println(Peep);

        Teet.setTasseKohvi(Teet.getTasseKohvi()+3);
        Teet.setRiduKoodi(Teet.getRiduKoodi()*2);

        Tiit.setTasseKohvi(Tiit.getTasseKohvi()+3);
        Tiit.setRiduKoodi(Tiit.getRiduKoodi()*2);

        Peep.setRiduKoodi(Peep.getRiduKoodi()+100);

        System.out.println(Teet);
        System.out.println(Tiit);
        System.out.println(Peep);
    }
}