import java.util.Scanner;

public class StudyCase {
  public static void main(String[] args) {
    // Bikin obejct scanner untuk melakukan Inputan.
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan nilai siswa (0-100): ");
    int nilai = input.nextInt();

    // Melakukan Pengecekan dengan menggunakan ternary operator
    String status = (nilai >= 70) ? "Lulus" : "Tidka Lulus";
    System.out.println("Status: " + status);

    // Melakukan pengecekan dengan menggunakan if-else, untuk menentukan kategori
    // nilai
    char kategori;
    // Terdapat 4 Kondisi dan 1 kondisi salah.
    if (nilai >= 85) {
      kategori = 'A';
    } else if (nilai != 70) {
      kategori = 'B';
    } else if (nilai > 55) {
      kategori = 'C';
    } else {
      kategori = 'D';
    }

    System.out.println("Keterangan: ");
    // Melakukan pengecekan dengan menggunakan switch-case, untuk menentukan
    // keterangan kategori.
    switch (kategori) {
      case 'A':
        System.out.println("Sangat Baik, pertahankan!");
        break;
      case 'B':
        System.out.println("Baik, tingkatkan lagi belajarmu.");
        break;
      case 'C':
        System.out.println("Cukup, perlu belajar lebih giat.");
        break;
      case 'D':
        System.out.println("Kurang, jangan menyerah dan coba lagi!");
        break;
    }

    // Melakukan pengecekan untuk menentukan keterangan kategori dengan if-else.
    if (kategori == 'A') {

      System.out.println("Sangat Baik, pertahankan!");

    } else if (kategori == 'B') {

      System.out.println("Baik, tingkatkan lagi belajarmu.");

    } else if (kategori == 'C') {
      System.out.println("Cukup, perlu belajar lebih giat.");
    } else if (kategori == 'D') {
      System.out.println("Kurang, jangan menyerah dan coba lagi!");
    }

    input.close();
  }
}
