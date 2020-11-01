package program_rata_rata_nilai_oop;

import java.util.Scanner;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

class Mahasiswa {
    Scanner scanner = new Scanner(System.in);
    private int nilai, banyak_mahasiswa, ratarata, totalnilai;

    public double getBanyak_mahasiswa() {
        System.out.print("Masukkan Banyaknya Mahasiswa\t: ");
        return banyak_mahasiswa = scanner.nextInt();
    }

    public double getNilai(int jumlah) {
        System.out.printf("Nilai Mahasiswa ke-%d\t\t: ",jumlah);
        return nilai = scanner.nextInt();
    }
}
