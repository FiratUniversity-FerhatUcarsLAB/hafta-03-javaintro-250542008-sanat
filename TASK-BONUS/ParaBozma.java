public class ParaBozma {
    public static void main(String[] args) {
        int tutar = 278;
        int[] paralar = {100, 50, 20, 5, 2, 1};

        for (int p : paralar) {
            int adet = tutar / p;
            tutar %= p;
            System.out.println(p + " TL x " + adet);
        }
    }
}

