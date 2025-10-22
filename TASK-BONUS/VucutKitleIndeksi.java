public class VücutKitleEndeksi {
    public static void main(String[] args) {
        double kilo = 68.0;
        double boy = 1.76;

        //Endeksi hesapla

        double endeks = kilo / (boy * boy);

        //Sonuçları yazdır

        System.out.println("Kilo: " + kilo);
        System.out.println("Boy: " + boy);
        System.out.println("Endeks: " + endeks);
    }
}
