import java.util.Scanner;

public class Converter {
    int nilai;

    public Converter(int nilai) {
        this.nilai = nilai;
    }
        
    void converter() {
        if (nilai >= 85) {
            System.out.println("Grade Kamu : A");
            System.out.println("IP Kamu : 4.00");
        } else if (nilai >= 80) {
            System.out.println("Grade Kamu : A-");
            System.out.println("IP Kamu : 3.70");
        } else if (nilai >= 75) {
            System.out.println("Grade Kamu : B+");
            System.out.println("IP Kamu : 3.30");
        } else if (nilai >= 70) {
            System.out.println("Grade Kamu : B");
            System.out.println("IP Kamu : 3.00");
        } else if (nilai >= 65) {
            System.out.println("Grade Kamu : C+");
            System.out.println("IP Kamu : 2.70");
        } else if (nilai >= 60) {
            System.out.println("Grade Kamu  : C");
            System.out.println("IP Kamu : 2.00");
        } else if (nilai >= 55) {
            System.out.println("Grade Kamu : D");
            System.out.println("IP Kamu : 1.00");
        } else {
            System.out.println("Grade Kamu : E");
            System.out.println("IP Kamu : 0.00");
        }

    }
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int input = myScanner.nextInt();

        Converter convert = new Converter(input);

        convert.converter();

        myScanner.close();
    }
}
