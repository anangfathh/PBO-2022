import java.util.Scanner;

public class LuasKelilingSegitiga {
    int a, b, c;

    // Dokumentasi constructor Java w3schools.com/java/java_constructors.asp
    public LuasKelilingSegitiga(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double hitungLuas() {
        // Silakan lengkapi method ini untuk menghitung luas
        System.out.println("Luas " + (double)(a*b/2));
        return 0;
    }

    public double hitungKeliling() {
        // Silakan lengkapi method ini untuk menghitung keliling
        System.out.println("Keliling " + (double)(a + 2*c));
        return 0;
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Silakan lengkapi 3 potongan dibawah untuk menangkap input user
        int a = myScanner.nextInt();
        int b = myScanner.nextInt();
        int c = myScanner.nextInt();
        LuasKelilingSegitiga lksegitiga = new LuasKelilingSegitiga(a, b, c);

        // Silakan lengkapi bagian ini untuk mencetak hasil
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("INVALID");
        }
        else {
        lksegitiga.hitungLuas();
        lksegitiga.hitungKeliling();
        }
        myScanner.close();
    }
}
