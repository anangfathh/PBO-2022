import java.util.Scanner;

public class LuasVolumeKubus {
    int sisiKubus;

    // Dokumentasi constructor Java w3schools.com/java/java_constructors.asp
    public LuasVolumeKubus(int sisiKubus) {
        this.sisiKubus = sisiKubus;
    }

    public int hitungVolume() {
        // Silakan lengkapi method ini untuk menghitung volume
        System.out.println("Volume " + (sisiKubus * sisiKubus * sisiKubus));
        return 0;
    }

    public int hitungLuasPermukaan() {
        // Silakan lengkapi method ini untuk menghitung luas permukaan
        System.out.println("Luas Permukaan " + (6 * sisiKubus * sisiKubus));
        return 0;
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int input = myScanner.nextInt();
        /* Silakan lengkapi potongan ini */
        /* Silakan lengkapi potongan ini */ 
        LuasVolumeKubus lvkubus = new LuasVolumeKubus(input);

        if (input <= 0) {
            System.out.println("INVALID");
        }
        else {
            lvkubus.hitungVolume();
            lvkubus.hitungLuasPermukaan();
        }

        // Silakan lengkapi bagian ini untuk mencetak hasil

        myScanner.close();
    }
}