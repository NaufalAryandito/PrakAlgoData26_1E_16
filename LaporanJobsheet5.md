# Laporan Praktikum Jobsheet 5 ASD
<h4> Nama: M. Naufal Aryandito A. </h4>
<h4> Kelas: TI 1E </h4>
<h4> Absen: 16 </h4>

## Praktikum 1
<h4> Screenshoot <h4>
<img width="774" height="405" alt="image" src="https://github.com/user-attachments/assets/102d40ba-7522-4179-8b6b-17e4cc594f55" />
<img width="870" height="377" alt="image" src="https://github.com/user-attachments/assets/247a001d-7c7a-4f61-a95a-6a09e6cbdea2" />
<img width="318" height="53" alt="image" src="https://github.com/user-attachments/assets/f8567fd8-ad56-43b1-aab5-85ab300a4e90" />

### Pertanyaan
1. Pada method faktorialDC(), penggunaan if berfungsi sebagai base case atau kondisi dasar dalam rekursi. Jika nilai n == 1, maka fungsi langsung mengembalikan nilai 1 karena faktorial dari 1 adalah 1. Sedangkan bagian else digunakan ketika nilai n lebih dari 1. Pada bagian ini program akan memanggil kembali method faktorialDC(n-1) dan mengalikannya dengan n. Proses ini akan terus berlangsung sampai kondisi n == 1 terpenuhi.
2. Perulangan tetap berjalan dari angka 1 sampai n, tetapi menggunakan struktur while. Hasil yang diperoleh tetap sama dengan perulangan for.
   <h4> Screenshoot </h4>
   <img width="514" height="424" alt="image" src="https://github.com/user-attachments/assets/22a84266-5618-4edb-8daa-be6c6c93d604" />
3. Perbedaannya terletak pada cara perhitungannya.
   1. fakto *= i digunakan pada algoritma Brute Force yang menggunakan perulangan untuk mengalikan nilai secara bertahap dari 1 sampai n.
   2. fakto = n * faktorialDC(n-1) digunakan pada algoritma Divide and Conquer yang menggunakan rekursi, yaitu fungsi memanggil dirinya sendiri sampai mencapai kondisi dasar.
   <h4>Jadi, Brute Force bekerja secara iteratif, sedangkan Divide and Conquer bekerja secara rekursif.<h4>
4. Method faktorialBF() menghitung nilai faktorial dengan cara perulangan dari 1 sampai n menggunakan loop sehingga prosesnya dilakukan secara berurutan. Sedangkan method faktorialDC() menggunakan konsep rekursi, dimana masalah dipecah menjadi masalah yang lebih kecil sampai mencapai kondisi dasar (n == 1). Setelah itu hasilnya dikombinasikan kembali untuk mendapatkan hasil faktorial akhir.

## Praktikum 2
<h4> Screenshoot </h4>
<img width="572" height="523" alt="image" src="https://github.com/user-attachments/assets/27f006b3-dbbc-4290-ab93-63fb35d2ecb1" />
<img width="833" height="550" alt="image" src="https://github.com/user-attachments/assets/7cccb35f-075e-4625-9675-0eaf5b4c00b8" />
<img width="326" height="371" alt="image" src="https://github.com/user-attachments/assets/8828b6b2-1b30-4aad-ac50-8364e86052d5" />

### Pertanyaan
1. Perbedaan kedua method tersebut adalah pada cara menghitung pangkatnya.
   1. pangkatBF() menggunakan perulangan (loop) untuk mengalikan angka dasar sebanyak nilai pangkatnya.
   2. pangkatDC() menggunakan Divide and Conquer (rekursi) dengan membagi pangkat menjadi dua bagian lalu mengalikan hasilnya kembali.
<h4>Metode Divide and Conquer biasanya lebih efisien untuk nilai pangkat yang besar karena jumlah operasi bisa lebih sedikit.<h4>
2. Ya, tahap combine terdapat pada bagian berikut:
   <img width="423" height="95" alt="image" src="https://github.com/user-attachments/assets/942b8682-c696-4846-a0fd-c6c359103f57" />
3. Sebenarnya method tersebut tidak wajib memiliki parameter, karena di dalam class sudah terdapat atribut nilai dan pangkat.
<h4> Screenshoot </h4>
<img width="358" height="138" alt="image" src="https://github.com/user-attachments/assets/45e61170-ce0e-4245-afd2-0339a9cd146f" />
4.<h4>Method pangkatBF() menghitung pangkat dengan cara perkalian berulang menggunakan perulangan sampai jumlah pangkat terpenuhi. Sedangkan method pangkatDC() menggunakan pendekatan Divide and Conquer dengan membagi pangkat menjadi dua bagian lebih kecil, kemudian hasilnya digabungkan kembali melalui perkalian. Pendekatan Divide and Conquer dapat membuat proses lebih efisien terutama untuk pangkat yang besar.</h4> 

## Praktikum 3
<h4> Screenshoot </h4>
<img width="589" height="510" alt="image" src="https://github.com/user-attachments/assets/5e2f6fd7-26a0-4802-9819-e2605aec20c7" />
<img width="832" height="316" alt="image" src="https://github.com/user-attachments/assets/69a0bb2c-df59-4344-aecd-01051644e5da" />
<img width="394" height="137" alt="image" src="https://github.com/user-attachments/assets/26002f4e-d348-4a47-bbdf-460d4daf4c02" />

### Pertanyaan
1. Variabel mid digunakan untuk membagi array menjadi dua bagian. Dengan adanya mid, array dapat diproses secara terpisah menjadi bagian kiri dan bagian kanan dalam algoritma Divide and Conquer.
2. Kode tersebut digunakan untuk menghitung jumlah pada dua bagian array yang sudah dibagi, yaitu bagian kiri (lsum) dan bagian kanan (rsum). Kedua bagian ini dihitung secara rekursif.
3. <h4>Penjumlahan tersebut dilakukan untuk menggabungkan hasil perhitungan dari dua bagian array yang sudah diproses sebelumnya. Dengan cara ini total nilai seluruh array dapat diperoleh.<h4>
4.<img width="176" height="59" alt="image" src="https://github.com/user-attachments/assets/6747aef7-2c51-4ab6-a0e1-6d8c9fa90281" />
<h4> Artinya ketika bagian array yang diproses hanya terdiri dari satu elemen, maka nilai elemen tersebut langsung dikembalikan tanpa perlu dibagi lagi.</h4>
5. Method totalDC() bekerja dengan menggunakan konsep Divide and Conquer, yaitu dengan membagi array menjadi dua bagian menggunakan variabel mid. Setiap bagian kemudian dihitung secara rekursif sampai mencapai kondisi dasar yaitu satu elemen. Setelah itu hasil dari masing-masing bagian dijumlahkan kembali sehingga diperoleh total seluruh nilai dalam array.

## Tugas
<img width="471" height="219" alt="image" src="https://github.com/user-attachments/assets/eebf6afb-a422-4230-aa9d-e42efce7cc72" />
<img width="502" height="572" alt="image" src="https://github.com/user-attachments/assets/8f1e26db-8b5b-49a0-aedb-e6a4c632ff1a" />
<img width="736" height="467" alt="image" src="https://github.com/user-attachments/assets/6453ecd2-b95b-4d9f-b4d2-1e5abb092c9a" />
<img width="196" height="53" alt="image" src="https://github.com/user-attachments/assets/69dfc1cb-5eb4-4925-b3f8-147470efaf3f" />
