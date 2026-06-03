# Laporan Jobsheet 14 ASD
## Nama : M. Naufal Aryandito A.
## Kelas: TI-1E

### Praktikum 1
<h4> Screenshot </h4>
<img width="1129" height="662" alt="image" src="https://github.com/user-attachments/assets/9803df97-ab07-4459-b979-d2a37453506f" />
<img width="1067" height="455" alt="image" src="https://github.com/user-attachments/assets/b3e0e793-d114-4415-83c9-93148e472055" />
<img width="1210" height="1073" alt="image" src="https://github.com/user-attachments/assets/41fecd0b-4588-42a4-8468-9a830ed71eac" />
<img width="979" height="981" alt="image" src="https://github.com/user-attachments/assets/5eb3af87-6270-4fd4-a579-751812b304a1" />
<img width="727" height="1007" alt="image" src="https://github.com/user-attachments/assets/4bcc4469-64d5-4b59-baf3-f0b79dc2f5cb" />
<img width="637" height="971" alt="image" src="https://github.com/user-attachments/assets/95216ffd-c0f7-42c1-99dd-d76ac62316e7" />
<img width="1113" height="1029" alt="image" src="https://github.com/user-attachments/assets/62857752-513d-48ac-851a-1771d316545e" />

### Pertanyaan
1. Efisiensi Pencarian BST vs Binary Tree Biasa:
Pencarian data pada BST lebih efektif karena datanya sudah terurut (kiri lebih kecil, kanan lebih besar dari root). Hal ini memungkinkan program memangkas setengah jalur pencarian pada setiap langkah, berbeda dengan binary tree biasa yang harus memeriksa seluruh node satu per satu.
2. left: Menyimpan referensi/alamat ke node anak sebelah kiri (left child). right: Menyimpan referensi/alamat ke node anak sebelah kanan (right child).
3. a. Kegunaan: Sebagai pintu masuk utama/fondasi awal pohon yang menyimpan referensi ke node paling atas untuk memulai seluruh operasi tree. b. Nilai awal: Bernilai null saat objek pertama kali dibuat.
4. Program mendeteksi bahwa tree kosong melalui fungsi isEmpty() , lalu langsung menetapkan node baru tersebut sebagai root utama (root = newNode).
5. parent = current;: Menyimpan node saat ini sebagai calon induk.Jika IPK baru lebih kecil dari node saat ini, program bergerak ke kiri (current.left). Jika kosong, node baru dimasukkan di kiri. Jika IPK baru lebih besar, program bergerak ke kanan (current.right). Jika kosong, node baru dimasukkan di kanan.
6. Langkah: Program mencari node pengganti (successor), menyalin datanya ke node yang ingin dihapus, lalu menghapus node successor yang asli agar struktur pohon tidak terputus. Fungsi getSuccessor(): Membantu mencari node pengganti terbaik dengan cara mengambil nilai terkecil dari sub-pohon sebelah kanan (bergerak ke kanan sekali, lalu ke kiri sampai habis).

### Praktikum 2
