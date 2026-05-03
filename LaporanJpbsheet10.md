# Laporan Jobsheet 10 ASD
## Nama: M. Naufal Aryandito A.
## Kelas: TI-1E
## Absen: 16

### Praktikum 1
<h4> Screenshot </h4>

<img width="715" height="555" alt="image" src="https://github.com/user-attachments/assets/4edf3f31-557d-4c8b-9db3-153a03802c65" />
<img width="503" height="373" alt="image" src="https://github.com/user-attachments/assets/f9f72651-4372-468c-b1f7-e86d82c9e98f" />
<img width="500" height="535" alt="image" src="https://github.com/user-attachments/assets/7fc217a7-3f79-42d9-bb3a-47bd773cd63b" />
<img width="602" height="356" alt="image" src="https://github.com/user-attachments/assets/d903b75c-7f45-44c7-bb32-817a9ebfda1e" />
<img width="619" height="471" alt="image" src="https://github.com/user-attachments/assets/22bbf742-16ee-46df-b2fd-b04a73edfb57" />
<img width="310" height="423" alt="image" src="https://github.com/user-attachments/assets/aefedb94-438d-45b4-b034-067a4ff8d870" />

### Pertanyaan
1. Pada konstruktor class Queue, nilai awal atribut front dan rear diinisialisasi dengan nilai -1 karena kondisi tersebut menunjukkan bahwa queue masih kosong dan belum memiliki elemen sama sekali. Nilai -1 dipilih karena indeks array dimulai dari 0, sehingga -1 menandakan bahwa belum ada posisi yang digunakan. Sementara itu, atribut size diinisialisasi dengan nilai 0 karena jumlah elemen dalam queue pada awalnya memang belum ada.
2. Pada method enqueue, potongan kode tersebut berfungsi untuk menambahkan elemen baru ke dalam queue. Jika queue dalam kondisi kosong, maka nilai front dan rear akan diatur menjadi 0 sebagai posisi awal data pertama. Namun jika queue sudah berisi, maka nilai rear akan bertambah satu untuk menunjuk ke posisi berikutnya. Setelah itu, data dimasukkan ke dalam array pada indeks rear, dan nilai size bertambah satu untuk menandakan jumlah elemen dalam queue meningkat.
3. Pada method dequeue, potongan kode digunakan untuk mengambil data dari bagian depan queue. Data yang berada pada indeks front akan diambil terlebih dahulu, kemudian nilai front digeser ke indeks berikutnya dengan increment. Setelah itu, nilai size dikurangi satu karena jumlah elemen berkurang. Terakhir, data yang diambil akan dikembalikan sebagai hasil dari proses dequeue.
4. Pada method print, perulangan tidak dimulai dari indeks 0 melainkan dari nilai front karena posisi awal data dalam queue dapat berubah akibat proses dequeue. Jika perulangan dimulai dari 0, maka akan menampilkan data yang sudah tidak termasuk dalam antrian. Oleh karena itu, perulangan dimulai dari front agar hanya data yang masih ada dalam queue yang ditampilkan.
5. Pada method print, potongan kode perulangan dari front hingga rear bertujuan untuk menampilkan seluruh elemen yang masih tersimpan dalam queue. Dengan cara ini, program hanya mencetak data yang aktif dalam antrian sesuai urutan, tanpa menampilkan elemen yang sudah dikeluarkan sebelumnya.
6. Queue overflow terjadi ketika kondisi queue sudah penuh, yaitu saat jumlah elemen sama dengan kapasitas maksimum yang telah ditentukan. Potongan kode yang menunjukkan kondisi ini biasanya terdapat pada pengecekan method isFull, dimana jika kondisi tersebut terpenuhi maka program akan menampilkan pesan bahwa queue sudah penuh dan tidak dapat menerima data baru.
7. <img width="355" height="82" alt="image" src="https://github.com/user-attachments/assets/91980358-b597-4630-81cd-1d629cfc9fe5" />
<img width="344" height="85" alt="image" src="https://github.com/user-attachments/assets/6935a392-fd91-422d-9c76-d0178bc825cc" />

## Praktikum 2
<h4> Screenshot </h4>

<img width="336" height="446" alt="image" src="https://github.com/user-attachments/assets/1df9b1fd-240c-468d-8558-424a2f16b5ba" />
<img width="314" height="580" alt="image" src="https://github.com/user-attachments/assets/7273c685-431f-43bd-9236-a64869d745e6" />
<img width="395" height="324" alt="image" src="https://github.com/user-attachments/assets/88e73296-66d3-4f69-9347-bc1667ec60ed" />

## Pertanyaan

<img width="522" height="150" alt="image" src="https://github.com/user-attachments/assets/79ed87d0-a480-43d1-8135-15cc344fe071" />
<img width="299" height="64" alt="image" src="https://github.com/user-attachments/assets/b04e2734-ec1f-40aa-b665-49885123046b" />

