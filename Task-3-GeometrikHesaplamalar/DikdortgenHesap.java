public class DikdortgenHesap {
    public static void main(String[] args) {
        double kısakenar = 12.15;
        double uzunkenar = 17.61;

        //Alan hesapla
        double alan = kısakenar*uzunkenar;

        //Cevre hesapla
        double cevre = (2*kısakenar) + (2*uzunkenar);

        //Sonucları yazdır
        System.out.println("Alan: " + alan);
        System.out.println("Cevre: " + cevre);
    }
}
