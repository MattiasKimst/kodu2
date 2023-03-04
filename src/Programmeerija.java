public class Programmeerija {
    private String programmeerijaNimi;
    private double riduKoodi;
    private int tasseKohvi;
    private Kohv lemmikkohv;

    public Programmeerija(String programmeerijaNimi, double riduKoodi, int tasseKohvi, Kohv lemmikkohv){
        this.programmeerijaNimi=programmeerijaNimi;
        this.riduKoodi=riduKoodi;
        this.tasseKohvi=tasseKohvi;
        this.lemmikkohv=lemmikkohv;
    }
    public Programmeerija(String programmeerijaNimi, double riduKoodi){
        this.programmeerijaNimi =programmeerijaNimi;
        this.riduKoodi=riduKoodi;
    }

    public int getTasseKohvi() {
        return tasseKohvi;
    }

    public void setTasseKohvi(int tasseKohvi) {
        this.tasseKohvi = tasseKohvi;
    }

    public double getRiduKoodi() {
        return riduKoodi;
    }

    public void setRiduKoodi(double riduKoodi) {
        this.riduKoodi = riduKoodi;
    }

    public boolean kasJoobKohvi(){
        boolean tõeväärtus;
        if (lemmikkohv!= null){
            tõeväärtus=true;
        }
        else {
            tõeväärtus=false;
        }
        return tõeväärtus;
    }

    public double koodiTassiKohta(){
        double ridu=0;
        if (kasJoobKohvi()==false){
            ridu=-1;
            System.out.println(programmeerijaNimi+" ei joo kohvi.");
        }
        else{
            ridu=riduKoodi/tasseKohvi;
        }
        return ridu;
    }


    public String toString() {
        if (kasJoobKohvi()==true){
            return programmeerijaNimi+ " " +lemmikkohv.getKohvisort()+" "+lemmikkohv.getHind()+" "+lemmikkohv.tassideMaksumus(tasseKohvi)+" "+koodiTassiKohta();
        }
        else{
            return programmeerijaNimi+" ei joo kohvi";
        }
    }


}