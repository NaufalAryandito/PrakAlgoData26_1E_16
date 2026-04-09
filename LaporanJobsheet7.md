# Laporan Jobsheet 6 
### Nama: M. Naufal Aryandito A.
### Kelas: TI 1E
### Absen: 16

## Praktikum 1
<h4>Screenshot</h4>

<img width="759" height="528" alt="image" src="https://github.com/user-attachments/assets/34927eac-9f28-46cd-b52d-00cfcf7ac0ec" />
<img width="810" height="321" alt="image" src="https://github.com/user-attachments/assets/1b1291af-ccfd-4ca1-8205-39b9ea7f921d" />
<img width="235" height="447" alt="image" src="https://github.com/user-attachments/assets/a4fc63c2-d4c4-4802-8e37-8a5b0c116a3a" />
<img width="512" height="209" alt="image" src="https://github.com/user-attachments/assets/e0513709-fd0b-4f71-a595-1a8492469815" />

### Pertanyaan
1. tampilPosisi: Berfungsi untuk menampilkan indeks atau lokasi (posisi) di mana data ditemukan dalam array. Jika data tidak ditemukan, biasanya akan menampilkan pesan bahwa data tidak ada.

tampilDataSearch: Berfungsi untuk menampilkan detail isi data (seperti nama, NIM, IPK) dari objek yang ditemukan pada indeks tertentu hasil pencarian.

2.Fungsi break digunakan untuk menghentikan paksa perulangan (looping) segera setelah data yang dicari ditemukan (listMhs[j].ipk == cari). Hal ini dilakukan agar program tidak perlu memeriksa sisa elemen array lainnya, sehingga proses eksekusi menjadi lebih efisien.

3. Variabel pos berfungsi sebagai penanda (flag) sekaligus penyimpan lokasi.

Menyimpan nomor indeks tempat data ditemukan.

Sebagai acuan validasi: jika nilai pos tetap pada nilai inisial (misal -1), berarti data tidak ditemukan.

4. Pada kode tersebut, jika terdapat lebih dari satu data dengan nilai yang sama, maka data yang akan ditampilkan adalah data yang pertama kali ditemukan (data dengan indeks terkecil). Ini terjadi karena perintah break langsung menghentikan pencarian begitu kecocokan pertama ditemukan.

5. Jika break dihapus, program akan terus melakukan pencarian hingga akhir array meskipun data sudah ditemukan. Akibatnya:

Efisiensi menurun: Program membuang waktu memeriksa data yang sudah tidak relevan.

Perubahan hasil: Jika ada data ganda, variabel posisi akan terus diperbarui, sehingga yang tersimpan adalah indeks dari data terakhir yang ditemukan, bukan yang pertama.

## Praktikum 2
<h4>Screenshot</h4>

<img width="807" height="215" alt="image" src="https://github.com/user-attachments/assets/8eab31ed-b5cc-42ed-872c-e8a774396170" />
<img width="671" height="539" alt="image" src="https://github.com/user-attachments/assets/75cf0054-5fba-4040-8f35-4e731c753956" />
<img width="397" height="449" alt="image" src="https://github.com/user-attachments/assets/21de3448-6c98-48c8-a8a0-8205b29fdb6b" />
<img width="427" height="126" alt="image" src="https://github.com/user-attachments/assets/ca1f3178-0a44-460d-a5e9-1e16fcb35378" />

### Pertanyaan
1. Proses divide dijalankan pada baris kode yang menghitung titik tengah (middle) untuk membagi rentang pencarian menjadi dua bagian:

mid = (left + right) / 2;

2. Proses conquer dijalankan saat program memutuskan bagian mana yang akan diperiksa selanjutnya (kiri atau kanan) dengan membandingkan nilai yang dicari dengan nilai di posisi mid:

if (cari < listMhs[mid].ipk) atau else if (cari > listMhs[mid].ipk)

3. left: Menyimpan indeks batas awal (paling kiri) dari rentang pencarian yang aktif.

right: Menyimpan indeks batas akhir (paling kanan) dari rentang pencarian yang aktif.

mid: Indeks nilai tengah yang digunakan sebagai titik pembanding utama.

4. Tidak bisa. Program mungkin tetap berjalan (tidak error), tetapi hasilnya akan salah atau tidak akurat. Syarat mutlak Binary Search adalah data harus dalam keadaan terurut agar logika pembagian dua rentang dapat bekerja secara konsisten.

5. Hasilnya tidak akan sesuai jika menggunakan kode standar ascending. Agar sesuai, logika perbandingannya
6. Binary Search menentukan data tidak ada ketika kondisi perulangan while (left <= right) sudah tidak terpenuhi lagi. Artinya, rentang pencarian sudah menyempit hingga habis dan nilai left menjadi lebih besar dari right tanpa pernah menemukan kecocokan.
7. <img width="507" height="116" alt="image" src="https://github.com/user-attachments/assets/5ba5392d-e795-403c-9e98-211cb073aa14" />


