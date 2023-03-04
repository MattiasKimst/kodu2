public class Raamat {

    private Isik autor;
    private String pealkiri;

    public Raamat(Isik autor, String pealkiri) {
        this.autor = autor;
        this.pealkiri = pealkiri;
    }
    public String toString() {
        return autor + ", "+ pealkiri  ;
    }
}
class TestRaamat{
    public static void main (String[] argv){
        Isik a = new Isik("Eduard Vilde", 1.80, "2980900909", 80);
        Raamat[] riiul = new Raamat[100];
        System.out.println(riiul[8]);
        for (int i = 0; i < riiul.length; i++) {
            riiul[i] = new Raamat(a, "Kogutud teosed " + String.valueOf(i + 1));
        }

        System.out.println("10. raamat riiulil on " + riiul[10] + ".");


    }
}