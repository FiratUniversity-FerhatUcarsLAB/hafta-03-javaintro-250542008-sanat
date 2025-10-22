public class ÇarpımTablosu {
    public static void main(String[] args) {
        int sayi = 2;

        System.out.println("=== " + sayi + " Sayısının 0'dan 10'a Kadar Çarpım Tablosu ===");
        System.out.println("---------------------------------------");
        System.out.printf("%-10s %-10s %-10s%n", "Sayı", "Çarpan", "Sonuç");
        System.out.println("---------------------------------------");

        for (int i = 0; i <= 10; i++) {
            int sonuc = sayi * i;
            System.out.printf("%-10d %-10d %-10d%n", sayi, i, sonuc);
        }

        System.out.println("--------------------------------------");
    }
