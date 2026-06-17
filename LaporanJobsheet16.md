# Laporan Jobsheet 16 ASD
## Nama : M.Naufal Aryandito A.
## Kelas : TI-1E
### Praktikum 1
<h4> Screenshot </h4>
<img width="587" height="512" alt="image" src="https://github.com/user-attachments/assets/3af2a661-ee0b-4d87-a6a8-1019a57bc501" />
<img width="276" height="62" alt="image" src="https://github.com/user-attachments/assets/6ebfd1c1-498b-471c-95ed-344d0bd5d626" />

### Pertanyaan 
1. Karena ArrayList tersebut dideklarasikan secara raw type (tanpa menggunakan Generics <T>). Secara default, Java akan menganggap elemen di dalamnya bertipe objek induk tertinggi yaitu Object. Karena semua kelas di Java merupakan turunan dari kelas Object, maka tipe data apa pun (seperti Integer dan String) bisa dimasukkan ke dalam satu ArrayList yang sama.
2. <img width="258" height="50" alt="image" src="https://github.com/user-attachments/assets/cdc9ccb9-29b4-40b5-8df7-a1923dd20af8" />
3. <img width="433" height="64" alt="image" src="https://github.com/user-attachments/assets/57b27017-26d9-4505-a362-e40d7a5a9396" />
4. <img width="284" height="59" alt="image" src="https://github.com/user-attachments/assets/aa5eed89-350e-4b01-9db1-3cdf402a044f" />
5. Method push() merupakan fungsi khas dari struktur data Stack (LIFO - Last In First Out) yang diimplementasikan oleh LinkedList. Fungsi push() akan memasukkan elemen baru di posisi paling depan (indeks 0). Oleh karena itu, saat "Mei-mei" dimasukkan menggunakan push(), dia otomatis menggeser "Noureen" dan menjadi elemen pertama (getFirst()), sedangkan elemen terakhir (getLast()) tetap tidak berubah.

### Praktikum 2
 <h4> Screenshot </h4>
<img width="343" height="521" alt="image" src="https://github.com/user-attachments/assets/0d3ada08-aef9-47e8-aa78-6ab825855ce6" />
<img width="206" height="65" alt="image" src="https://github.com/user-attachments/assets/22da655b-527d-4759-892c-66f085818888" />

### Pertanyaan
1. push() adalah method spesifik milik kelas Stack untuk memasukkan elemen ke posisi paling atas/akhir dari tumpukan (mengikuti konsep LIFO). Method ini mengembalikan nilai dari elemen yang dimasukkan.
  add() adalah method turunan dari interface Collection / List. Method ini berfungsi memasukkan elemen ke akhir list dan mengembalikan nilai boolean (true jika berhasil).
2.  Perulangan di bawahnya (Iterator, Stream, dan For Loop) tidak akan menampilkan data apa pun (kosong). Hal ini terjadi karena pada baris kode sebelumnya (baris 37-39), terdapat fungsi perulangan while (!fruits.empty()) { fruits.pop(); } yang telah mengosongkan dan menghapus seluruh isi Stack fruits hingga tak tersisa.
3.  Baris tersebut (46-49) berfungsi untuk menampilkan atau menjelajahi seluruh elemen di dalam koleksi fruits secara berurutan menggunakan objek Iterator. Fungsi it.hasNext() digunakan untuk mengecek apakah masih ada elemen selanjutnya, dan it.next() digunakan untuk mengambil data elemen tersebut.
4.  Terjadi error kompilasi (compile-time error). Hal ini dikarenakan interface List bersifat umum dan tidak memiliki method-method spesifik milik struktur data Stack seperti push(), pop(), dan empty().
5.  <img width="389" height="42" alt="image" src="https://github.com/user-attachments/assets/7acd021f-bf03-4edc-9083-e8475fdea411" />
<img width="306" height="68" alt="image" src="https://github.com/user-attachments/assets/d1df3ef2-fd2f-4861-af45-909136e909f2" />
6. <img width="446" height="95" alt="image" src="https://github.com/user-attachments/assets/42f98fe2-37ea-4d4f-93cb-8b3d2412d6b1" />
<img width="368" height="79" alt="image" src="https://github.com/user-attachments/assets/b4b05384-dc1e-4448-bee8-c6cefb5324c1" />

### Praktikum 3
<h4> Screenshot </h4>
<img width="437" height="531" alt="image" src="https://github.com/user-attachments/assets/082729d5-b982-41f2-b3a4-0dc834b9e3be" />
<img width="263" height="89" alt="image" src="https://github.com/user-attachments/assets/b1e41f07-a479-4c6d-a694-874d67bee633" />

### Pertanyaan
1. Fungsi tersebut menggunakan konsep Varargs (Variable Arguments) yang ditandai dengan sintaks tiga titik (...) setelah tipe data parameter (Mahasiswa... mahasiswa).  Kelebihannya: > Memberikan fleksibilitas tinggi karena kita bisa memasukkan argumen objek dengan jumlah berapapun secara dinamis (bisa memasukkan 1, 2, 3, atau lebih objek sekaligus dalam satu baris perintah) tanpa harus membuat atau membungkus objek-objek tersebut ke dalam sebuah array secara manual terlebih dahulu.
2. Algoritma Binary Search mensyaratkan data di dalam List harus dalam keadaan terurut (sorted) sebelum dicari. Oleh karena itu, kita harus mengurutkannya terlebih dahulu menggunakan bantuan Lambda Expression atau Comparator.
   <img width="467" height="161" alt="image" src="https://github.com/user-attachments/assets/74301f6c-c9d5-4200-96ed-6a3c7755b79f" />
<img width="239" height="34" alt="image" src="https://github.com/user-attachments/assets/3bbfc28d-9eaf-4248-8602-1d8bfebf7030" />
3. <img width="299" height="46" alt="image" src="https://github.com/user-attachments/assets/2c661468-43e7-43a0-9633-7f21a944ba30" />
<img width="253" height="110" alt="image" src="https://github.com/user-attachments/assets/7ad76e6c-4287-43fa-bd01-88ef2bf7094d" />


