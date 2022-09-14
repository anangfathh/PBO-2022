import java.util.Scanner;

public class Conditional1 {
    int nilai;

    public Conditional1(int nilai) {
        this.nilai = nilai;
    }
        
    double converter() {
        if (nilai < 40) {
            return nilai + (8*nilai/10);
        } else if (nilai <= 59) {
            return (3*nilai/10) + 15 + nilai;
        } else if (nilai <= 69) {
            return (2*nilai/10) + 5 + nilai;
        } else if (nilai <= 84) {
            return nilai + (nilai/10);
        } else {
            return nilai;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int ulangan1 = scan.nextInt();
        int ulangan2 = scan.nextInt();
        int ulangan3 = scan.nextInt();

        int nilaiRata = (ulangan1+ulangan2+ulangan3)/3;

        Conditional1 convert = new Conditional1(nilaiRata);

        if (convert.converter() >= 85) {
            System.out.println("Selamat!");
            if (convert.converter() >= 95) {
                System.out.println("Kamu sangat hebat!");
            } else if (convert.converter() >= 90) {
                System.out.println("Jangan pernah menyerah!");
            } else {
                System.out.println("Tingkatkan terus!");
            }
        } 
        System.out.println("Nilai akhir: " + convert.converter());
        
        scan.close();
    }
}
