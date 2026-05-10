# Laporan Praktikum Jobsheet 11 
## Nama: M.Naufal Aryandito A.
## Kelas: TI-1E
## Absen: 16

### Praktikum 1
<h4> Screenshot </h4>

<img width="1086" height="579" alt="image" src="https://github.com/user-attachments/assets/bff899cb-3272-48e1-8365-d2e71bc78838" />
<img width="1132" height="822" alt="image" src="https://github.com/user-attachments/assets/936bed92-71a0-4269-a525-bc446d9a803d" />
<img width="967" height="593" alt="image" src="https://github.com/user-attachments/assets/9c14e0b6-b27e-4167-a38f-3a93fe99ac59" />
<img width="930" height="588" alt="image" src="https://github.com/user-attachments/assets/4d971a89-9432-4cb2-b912-c76b0b62a353" />
<img width="1137" height="510" alt="image" src="https://github.com/user-attachments/assets/2d0e0e7f-df41-45d6-9471-43d9bea1bf7b" />
<img width="443" height="345" alt="image" src="https://github.com/user-attachments/assets/1f8f872e-9533-49f6-adc6-cc554d3ab70b" />

### Pertanyaan
1. Karena sll.print() dipanggil sebelum data apapun ditambahkan ke linked list. Pada saat itu, variabel head masih bernilai null (belum diinisialisasi dengan node manapun). Di dalam method print(), kondisi !isEmpty() diperiksa terlebih dahulu — karena isEmpty() mengembalikan true (head == null), maka program masuk ke blok else dan mencetak "Linked list kosong".
2. Variable temp berfungsi sebagai pointer sementara yang digunakan untuk menelusuri (traverse) node-node dalam linked list tanpa mengubah posisi head atau tail yang asli. Cara kerjanya: temp diset ke head di awal, lalu dipindahkan ke temp.next secara berulang sampai menemukan posisi yang diinginkan. Jika head langsung digeser, kita akan kehilangan referensi ke awal linked list secara permanen, sehingga seluruh data sebelumnya tidak bisa diakses lagi.
3. <img width="571" height="221" alt="image" src="https://github.com/user-attachments/assets/f34bf125-7e0f-47ad-bea0-57f9ad5cf0a2" />
   <img width="586" height="294" alt="image" src="https://github.com/user-attachments/assets/22c3ed8a-fce8-462a-8633-1a3f076f99ec" />
   <img width="456" height="566" alt="image" src="https://github.com/user-attachments/assets/df9d5cfa-ea94-4dae-8da4-d6b2e23479f6" />

### Praktikum 2
<h4> Screenshot </h4>


<img width="797" height="714" alt="image" src="https://github.com/user-attachments/assets/10c76790-d76c-4522-8349-e39dda60cc6b" />
<img width="887" height="802" alt="image" src="https://github.com/user-attachments/assets/4777c88e-6fb4-45d4-9da4-6cccd951daf6" />
<img width="848" height="601" alt="image" src="https://github.com/user-attachments/assets/d77979cb-5179-44c1-a03a-660b9ea3351e" />
<img width="1218" height="980" alt="image" src="https://github.com/user-attachments/assets/5abb0da8-47b7-40ac-a6c6-65ce45bd43ae" />
<img width="1034" height="547" alt="image" src="https://github.com/user-attachments/assets/e4b7863a-7557-4b38-aee9-b51afdda9902" />
<img width="432" height="749" alt="image" src="https://github.com/user-attachments/assets/ca363adb-a7ba-429e-90af-99ae8fc86fcb" />

### Pertanyaan
1. Keyword break digunakan untuk menghentikan loop while segera setelah node yang cocok ditemukan dan dihapus. Tanpa break, loop akan terus berjalan ke node-node berikutnya walaupun penghapusan sudah selesai dilakukan. Ini bisa menyebabkan dua masalah: (1) pemborosan waktu komputasi, dan (2) potensi bug jika ada node lain dengan nama yang sama ikut terhapus padahal seharusnya hanya node pertama yang cocok yang dihapus.
2. <h4>temp.next = temp.next.next — Ini adalah inti dari penghapusan node. Baris ini membuat node sebelumnya (temp) langsung menunjuk ke node dua langkah ke depan, sehingga node yang berada di tengah (node yang ingin dihapus) tidak lagi dirujuk oleh siapapun dan otomatis terhapus dari linked list. <h4>
if (temp.next == null) { tail = temp; } — Setelah penghapusan, dicek apakah temp.next menjadi null. Jika iya, berarti node yang dihapus tadi adalah node terakhir (tail). Maka tail harus diperbarui menjadi temp (node sebelumnya), supaya pointer tail tidak menunjuk ke node yang sudah tidak ada di list.

## Tugas Praktikum
<img width="392" height="375" alt="image" src="https://github.com/user-attachments/assets/9550dbb1-3235-40a3-9245-91f633ea4452" />
<img width="239" height="306" alt="image" src="https://github.com/user-attachments/assets/af6f84b5-ff6d-4f57-ad80-75eca24c020b" />
<img width="239" height="432" alt="image" src="https://github.com/user-attachments/assets/37d7fba1-c5ef-490d-8569-f48df0b6b1b0" />
<img width="224" height="149" alt="image" src="https://github.com/user-attachments/assets/ae49c034-2e2a-47db-b0d7-ed1e1edfd55a" />
<img width="330" height="186" alt="image" src="https://github.com/user-attachments/assets/89b8a637-6345-44de-af87-50ec4f2825d3" />
<img width="205" height="421" alt="image" src="https://github.com/user-attachments/assets/85b237d1-7d66-404e-b27e-aea11b694845" />
<img width="473" height="277" alt="image" src="https://github.com/user-attachments/assets/622765ef-b9ac-498a-8b5a-8e638c8bdb55" />
<img width="418" height="469" alt="image" src="https://github.com/user-attachments/assets/af20fb4b-f51b-40fa-a477-d58bf4b59a86" />
