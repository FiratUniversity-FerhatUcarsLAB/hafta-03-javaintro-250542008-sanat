import java.util.Scanner;

public class SaatDönüştürme {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Saniyeyi giriniz:");
       int dakika = input.nextInt();

       int saat = dakika / 60;
       int kalan = dakika % 60;

       System.out.println(dakika + "Dakika" + saat + "Kalan" + kalan);

    }
}
