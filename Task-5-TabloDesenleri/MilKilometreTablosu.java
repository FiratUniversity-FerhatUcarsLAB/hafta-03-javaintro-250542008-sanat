public class MilKilometreTablosu {
    public static void main(String[] args) {
        double[] milDegerleri = {1, 5, 10, 20, 50};
        double milToKm = 1.60934;

        System.out.println("------------------------------------------");
        System.out.printf("%-10s %-15s%n", "Mil", "Kilometre");
        System.out.println("------------------------------------------");

        for (double mil : milDegerleri) {
            double km = mil * milToKm;
            System.out.printf("%-10.2f %-15.2f%n", mil, km);
        }

        System.out.println("------------------------------------------");
    }
    }
