import java.util.Scanner;

public class pengkondisian {
  public static void main(String[] args) {

    // int angka = 10;
    // angka++;
    // System.out.println(angka);

    /**
     * Pengkondisian If-Else
     * Terdapat beberaoa struktur yaitu kondisi untuk mentukan nilai benar atau
     * salah
     * nilai benar dan salah itu akan menentukan aksi mana yang akan di jalankan /
     * di eksekusi.
     */
    int time = 20;

    if (time < 18) {
      System.out.println("Good Day");
      System.out.println("Kondisi Benar");
    } else {
      System.out.println("Good Evening");
      System.out.println("Kondisi salah");
    }
    System.out.println("Selesai..");

    System.out.println("=======================");
    /**
     * Siwtch Case
     * Pengkondisin ini sama halnya dengan kondisi yang lain namun kondisi ini lebih
     * simpel,
     * atau bisa di bilang versi LITE daru if-else, dalam switch case ini kita tidak
     * bisa melakukan
     * kondisi lain, kita hanya bisa mengecek nilai yang sama saja.
     */
    int nilai = 80;
    switch (nilai) {
      case 80:
        System.out.println("B");
        int angka_2 = 1 + 2;
        nilai++;
        System.out.println("Case 80");
        break;
      case 70:
        System.out.println("C");
        break;
      default:
        System.out.println("Angka tidak sesuai");
    }
    System.out.println("Switch Case Selesai");

    System.out.println("=======================");

    /**
     * Ternary Operator
     * Ternary Operator adalah pengkondisian yang lebih simple dari pada if-else
     */
    int umur = 100;
    String orang = (umur == 100) ? "tua" : "dewasa";

    // if (umur == 100) {
    // orang = "tua";
    // } else {
    // orang = "dewasa";
    // }

    System.out.println(orang);

    /**
     * Input Keyboard
     * Scanner => Salah satu tipe data non primitif yaitu
     * Tipe data Object (tipe data buatan)
     * 
     */

    System.out.println("=======================");

    // Membuat sebuah variabel dengan tipe dara Scanner (non primitif)
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Username : ");

    // Membuat Sebuah Inputan.
    String userName = input.nextLine();
    System.out.println("Selamat Datang " + userName + " Di Teknik Informatika UIN Malang ");

  }
}
