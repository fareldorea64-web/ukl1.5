1.	import java.util.Scanner;
→ Mengimpor kelas Scanner agar program bisa membaca input dari keyboard.
	2.	Scanner input = new Scanner(System.in);
→ Membuat objek input untuk menerima data dari pengguna.
	3.	System.out.print("Masukkan jumlah siswa: ");
→ Meminta guru mengetik berapa banyak siswa yang nilainya akan dimasukkan.
	4.	int jumlahSiswa = input.nextInt();
→ Menyimpan jumlah siswa ke variabel jumlahSiswa.
	5.	double totalNilai = 0;
→ Menyimpan total semua nilai siswa (mulai dari 0).
	6.	for (int i = 1; i <= jumlahSiswa; i++) { ... }
→ Melakukan pengulangan sebanyak jumlah siswa yang dimasukkan.
	•	Setiap putaran, guru memasukkan nilai siswa ke-i.
	•	Nilai tersebut ditambahkan ke totalNilai.
	7.	double rataRata = totalNilai / jumlahSiswa;
→ Setelah semua nilai dimasukkan, program menghitung rata-rata dengan membagi total nilai dengan jumlah siswa.
	8.	System.out.println(...)
→ Menampilkan hasil rata-rata ke layar.
	9.	input.close();
→ Menutup scanner agar tidak ada peringatan (warning).
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/8db0d0f7-da53-489b-9d3f-fa7ae27bea5b" />
