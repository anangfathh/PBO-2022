//package java.com.mahasiswa;
//author Anangfath_;

import java.util.Scanner;

public class mahasiswa {
    String name, NIM, jenisKelamin, alamat;

    Scanner input = new Scanner(System.in);

    public void isiData() {
        
        System.out.println("Masukkan Nama Anda : ");
        name = input.nextLine();
        System.out.println("Masukkan NIM Anda : ");
        NIM = input.nextLine();
        System.out.println("Masukkan Jenis Kelamin Anda : ");
        jenisKelamin = input.nextLine();
        System.out.println("Masukkan Alamat Anda : ");
        alamat = input.nextLine();
    
    }
    
    public void printData(){
        System.out.println("Nama : " + name);
        System.out.println("NIM : " + NIM);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Alamat : " + alamat);

    }
  
    public static void main(String[] args) {
        mahasiswa Mahasiswa = new mahasiswa();
        Mahasiswa.isiData();
        Mahasiswa.printData();
    }
} 
