package program_rata_rata_nilai_oop;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class PBO10K10119909Latihan37 {

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        double nilaiMahasiswa, ratarata;
        double totalNilai = 0;
        double jumlahMahasiswa = mhs.getBanyak_mahasiswa();

        for (int i =1; i <= jumlahMahasiswa; i++) {
            nilaiMahasiswa = mhs.getNilai(i);
            totalNilai += nilaiMahasiswa;
        }
        ratarata = totalNilai / jumlahMahasiswa;
        System.out.printf("%nMaka, rata-rata nilainya adalah : %1$.1f%n",ratarata);
        System.out.println("Developed by : Anggawan Ridho");
    }
}
