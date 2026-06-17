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
<h4> Screenshot </h4>
<img width="872" height="729" alt="image" src="https://github.com/user-attachments/assets/683ac496-9161-4782-9e5a-dcdec137affe" />
<img width="1117" height="688" alt="image" src="https://github.com/user-attachments/assets/05607aa0-9240-4995-85dd-427e1948c5fb" />

### Pertanyaan
1. dataMahasiswa: Berfungsi sebagai wadah penyimpanan (kontainer) untuk menyimpan objek-objek Mahasiswa00 yang disusun mengikuti struktur pohon biner di dalam memori linear (array).  idxLast: Berfungsi untuk menandai batasan indeks terakhir dari elemen atau node yang valid di dalam array pohon tersebut. Ini digunakan sebagai kondisi berhenti (base case) saat melakukan penelusuran (traversal) agar tidak mengakses indeks di luar data pohon.
2. Method ini digunakan untuk menginisialisasi atau menyalin barisan data array mahasiswa secara massal (bulk input) dari main() ke dalam atribut dataMahasiswa internal class, sekaligus mencatat posisi indeks terakhir (idxLast) dari pohon tersebut.
3. Method ini digunakan untuk mengunjungi dan menampilkan informasi seluruh node mahasiswa di dalam pohon biner dengan urutan In-Order (Left-Root-Right) secara rekursif. Karena pohon diatur menggunakan indeks array, method ini membaca anak kiri dulu, membaca node saat ini, baru kemudian membaca anak kanan.
4. Sesuai rumus penempatan pohon biner berbasis array (berbasis indeks 0):Left Child: $2 \times \text{idxStart} + 1 = 2 \times 2 + 1 =$ Indeks 5.  Right Child: $2 \times \text{idxStart} + 2 = 2 \times 2 + 2 =$ Indeks 6.
5. Statement tersebut digunakan untuk memberikan informasi kepada objek BinaryTreeArray00 bahwa jumlah node mahasiswa yang valid di dalam array dataMahasiswas berjumlah 7 node (berada dari indeks 0 hingga indeks 6). Elemen setelah indeks 6 (seperti null) tidak akan ikut diproses dalam fungsi traversa
6. Dalam struktur data pohon biner yang diimplementasikan menggunakan array lengkap (complete binary tree) berbasis indeks 0, hubungan hierarki antarnode dipetakan secara matematis melalui indeksnya:Indeks 2*idxStart+1 merepresentasikan anak kiri (left child) dari node saat ini.  Indeks 2*idxStart+2 merepresentasikan anak kanan (right child) dari node saat ini.
Rumus ini memastikan bahwa visualisasi pohon biner tetap terjaga konsistensinya tanpa memerlukan pointer (left dan right) layaknya pada Linked List.

### Tugas Praktikum
<h4> Sdcreenshot</h4>
<img width="852" height="925" alt="image" src="https://github.com/user-attachments/assets/87dd89de-dab8-419c-96ac-ad4c6038014b" />
<img width="931" height="810" alt="image" src="https://github.com/user-attachments/assets/abf02005-f680-482d-bd95-7492e2e8b67a" />
<img width="966" height="1008" alt="image" src="https://github.com/user-attachments/assets/d990be97-834d-4c66-a31e-539249b90f6f" />
<img width="797" height="292" alt="image" src="https://github.com/user-attachments/assets/4c3fa2bf-787f-431b-ab4f-e4c363fb0090" />

