import java.util.Scanner;

public class tugasuklsulit1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        double totalNilai = 0;

        // Perulangan untuk memasukkan nilai setiap siswa
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalNilai += nilai;
        }

        // Hitung rata-rata
        double ratarata = totalNilai / jumlahSiswa;

        System.out.println("Rata-rata nilai seluruh siswa adalah: " + ratarata);

        input.close();
    }
}
