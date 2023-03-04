class Isik {
    private String nimi; // isendiväli isiku nime jaoks
    private double pikkus; // isendiväli isiku pikkuse jaoks
    private String kood; // isendiväli isikukoodi jaoks
    private double mass; // isendiväli kehakaalu jaoks

    // konstruktor
    Isik(String isikuNimi, double isikuPikkus, String isikukood, double isikumass) {
        nimi = isikuNimi;
        pikkus = isikuPikkus;
        kood = isikukood;
        mass = isikumass;
    }
    public String toString() {
        return nimi+" "+ pikkus+" "+ kood+" " +mass; // tagastab ainult nime, sest hiljem klassis Raamat on vaja ainult nime ilma teiste andmeteta
    }

    public String getNimi() {
        return nimi;
    }

    public double getPikkus() {
        return pikkus;
    }

    public String getKood() {
        return kood;
    }

    public double getMass() {
        return mass;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setPikkus(double pikkus) {
        if (0.5 < pikkus && pikkus < 2.2) {
            this.pikkus = pikkus;
        }
    }
    public void setMass(double mass) {
        if (20 < mass && mass < 200) {
            this.mass = mass;
        }
    }
    public double kehamassiindeks() {
        return this.mass/(this.pikkus*this.pikkus); //kehamassiindeksi arvutamise valem
    }
    public double suusapikkus(String stiil){ // täiendav argument meetodile "stiil"
        double suusap = 0;
        if (stiil=="uisu"){ // uisustiili puhul soovituslik kehapikkus +10cm
            suusap= this.pikkus+0.1;
        }
        else if (stiil == "klassika") {
            suusap= this.pikkus + 0.2; // klassikalis stiili puhul soovituslik kehapikkus + 20cm
        }
        return suusap;
    }

}

class TestIsik {
    public static void main (String[] argv) {
        Isik a = new Isik("Juhan Juurikas", 1.99, "51234545", 90);
        Isik b = new Isik ("Heli Kopter", 1.75, "497798087", 60);
        System.out.println("Isik a on " + a);
        System.out.println(b.toString());
        System.out.println(a.getNimi());
        System.out.println(a.getKood());
        System.out.println(a.getPikkus());
        a.setMass(10);
        System.out.println("Uus mass peale set 10 rakendamist: "+a.getMass());
        a.setMass(100);
        System.out.println("Uus mass peale set 100 rakendamist: "+a.getMass());
        System.out.println("Soovituslik suusapikkus: "+a.suusapikkus("uisu"));
        System.out.println("Kehamassiindeks: "+ a.kehamassiindeks());
    }
}