/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day1.tipedata;

/**
 *
 * @author ghoziwaridi
 */
public class Day1TipeData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        /** 
         * Tipe Data
         * - String => "Hello World" || menggunakan tanda petik 2. 
         * - char => 'g' || menggunakan tanda petik 1 dan hanya 1 huruf.
         * - int => 10 || tipe data berupa angka atau number.
         * - double => || tipe data berupa angka yang memiliki koma. 
         * - boolean => tipe data dengan 2 nilai true atau false.
         */

        
        
        
        
         // Tipe Data String
        String bahasa = "java";
        // Tipe Data char
        char huruf = 'j';
        
        
        // Tipe data untuk Number (angka tanpa koma)
        byte umur = 100;
        int uang = 1_000_000_000;
        long angka3 = 1_000_000_000_000_000_000L;
        
        
        // Tipe data number (angka dengan koma)
        double angka2 = 3.14;
        float angka4 = 3.14f;
        
        System.out.println("Bahasa Pemograman : " + bahasa);
        
        // Tipe data Array
        byte[] umurBanyak = {12, 13, 12, 13};
        
        
        // Tipe data Boolean (Benar atau salah)
        boolean benar = true; // true (benar) atau false (salah)
        
        /** INDEX dimulai dari angka 0
         *  
         * namaBanyak[0] = "java"
         * namaBanyak[1] = "python"
         * namaBanyak[2] = "nim"
         * 
         * 
         */
        String[] namaBanyak = {"java", "python", "nim"};     
        
         /**
          * untuk mengambil jumlah dari array kita bisa menggunakan .length
          * EXP : namaBanyak.length
         */
        
        String namaLagi = namaBanyak[0];
        System.out.println("Nama Lagi: " + namaLagi);
        
        System.out.println("Bahasa Pemograman : " + namaBanyak[0]);
        System.out.println("Bahasa Pemograman : " + namaBanyak[1]);
        System.out.println("Bahasa Pemograman : " + namaBanyak[2]);
        
        System.out.println("====================================");
        
        
        for (int i = 0; i < namaBanyak.length; i ++) {
            System.out.println("Bahasa Pemograman : " + namaBanyak[i]);
        }
        // Array dengan inisialisasi data di akhir
        char[] hurufBanyak = new char[2]; 
        // array sebelum di tambahkan data
        System.out.println("Huruf Banyak : " + hurufBanyak[0]);
        System.out.println("Huruf Banyak : " + hurufBanyak[1]);
        
        // Mengganti atau menambahkan nilai di dalam array
        hurufBanyak[0] = 'j';
        hurufBanyak[1] = 'g';
        
        // array sesudah di tambahkan data
        System.out.println("Huruf Banyak : " + hurufBanyak[0]);
        System.out.println("Huruf Banyak : " + hurufBanyak[1]);
        
        System.out.println("====================================");
        /** Operasi Matematika
         *  + => penjumlahan
         *  - => pengurangan
         *  * => perkalian
         *  / => pembagian
         *  % => modulus (Sisa Bagi) 
         */
        
        double angkaLagi = 10; // 10.0
        double angkaLagi2 = 12;
        
        // angakaLagi + angkaLagi2 = hasil
        
        // masukan ke variabel 
        double penjumlahan = angkaLagi + angkaLagi2;
        double pengurangan = angkaLagi - angkaLagi2;
        double perkalian = angkaLagi * angkaLagi2;
        double pembagian = angkaLagi / angkaLagi2;
        double modulus = angkaLagi % angkaLagi2;
        
        System.out.println("Penjumlahan : " + penjumlahan);
        System.out.println("Pengurangan : " + pengurangan);
        System.out.println("perkalian : " + perkalian);
        System.out.println("pembagian : " + pembagian);
        System.out.println("Sisa Bagi : " + modulus);
            
        
        /**
         * 
         */
        
        System.out.println("====================================");
        int banding1 = 2;
        int banding2 = 3;
        
        System.out.println(banding1 > banding2);
        System.out.println(banding1 < banding2);
        System.out.println(banding1 == banding2);
        System.out.println(banding1 != banding2);
        
        /** Operasi Boolean
         *  true = 1
         *  false = 0
         */
        boolean nilai1 = true; // benar = 1
        boolean nilai2 = false; // salah = 0
        System.out.println("====================================");
        System.out.println(nilai1 && nilai2);
        System.out.println(nilai1 || nilai2);
        System.out.println(!nilai1);
        
        
        
        
    }
    
}
