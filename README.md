# UTS - Pemrograman Berbasis Objek

## Identitas

Nama  : Akhmad Rafliansyah

NIM   : 2509116045

Prodi : Sistem Informasi 25'B

Tema  : Sistem Informasi Manajemen Rental Kendaraan

## Deskripsi Program

Sistem Informasi Manajemen Rental Kendaraan merupakan program berbasis Java yang digunakan untuk mengelola data rental kendaraan.
Program ini membantu pengguna dalam menambahkan, menampilkan, mengubah, dan menghapus data transaksi rental kendaraan. Program dibuat
dengan menerapkan konsep Object-Oriented Programming (OOP) seperti class, object, constructor, encapsulation, serta penggunaan ArrayList 
untuk menyimpan data transaksi selama program berjalan.

## Alur Program

Program dimulai dengan menampilkan menu utama yang berisi beberapa pilihan, yaitu tambah data, tampilkan data, tampilkan harga, ubah data, 
hapus data, dan keluar dari program. Pengguna dapat memilih salah satu menu dengan memasukkan angka sesuai pilihan yang tersedia.

<img width="255" height="205" alt="image" src="https://github.com/user-attachments/assets/d1f22794-e118-4dfb-a4b1-b4e1fb9094dd" />

1. Tambah Data Rental
   
   Pada bagian **Tambah Data Rental**, Proses dimulai dengan memilih menu 1. Tambah Data Rental, kemudian pengguna menginput ID
   transaksi, ID pelanggan, nama pelanggan, nomor telepon, nomor plat, merek kendaraan, warna kendaraan, dan lama sewa. Selanjutnya
   pengguna memilih jenis kendaraan, yaitu mobil atau motor, kemudian memasukkan jumlah roda mobil atau cc motor. kemudian sistem
   menyimpan seluruh data tersebut dan menampilkan pesan “Data Rental Berhasil Ditambahkan!” sebagai tanda bahwa data berhasil
   disimpan.

   <img width="271" height="520" alt="image" src="https://github.com/user-attachments/assets/5b34470c-507b-49c5-b1f8-8a702c94ff23" />

2. Tampilkan Data Rental
   
   Pada menu **Tampilkan Data Rental**, sistem akan memeriksa apakah terdapat data transaksi di dalam `ArrayList`. Jika belum               terdapat data, sistem akan menampilkan informasi bahwa belum ada data Rental. Jika terdapat data, sistem menggunakan perulangan          untuk mengambil setiap transaksi dan menampilkan informasi transaksi, pelanggan, serta jenis kendaraan yang dipilih.

   <img width="262" height="622" alt="image" src="https://github.com/user-attachments/assets/32375122-9ef4-409b-90c9-da1a0a19d948" />

3. Tampilkan Harga Rental

   **Tampilkan Harga Rental** digunakan untuk menampilkan daftar harga sewa kendaraan berdasarkan jenis kendaraannya. Pada menu ini,        sistem menampilkan harga rental mobil sebesar Rp300.000 per hari dan motor sebesar Rp100.000 per hari. Menu ini membantu pengguna        mengetahui tarif sewa sebelum melakukan rental kendaraan.

   <img width="250" height="272" alt="image" src="https://github.com/user-attachments/assets/7d9d85e1-223c-4011-bc2e-466553ecdf84" />

4. Ubah Data Rental
   
   Pada menu **Ubah Data Rental** pengguna diminta memasukkan ID transaksi yang ingin diubah. Sistem kemudian mencari ID tersebut di        dalam `ArrayList`. Jika ID ditemukan, pengguna dapat memasukkan data baru untuk nama pelanggan, nomor telepon, nomor plat kendaraan,     merk kendaraan, warna kendaraan, jenis kendaraan, dan jumlah roda mobil atau cc motor. Data tersebut kemudian diperbarui menggunakan     setter yang terdapat pada masing-masing class. Jika ID transaksi tidak ditemukan, sistem akan menampilkan pesan bahwa data tidak         ditemukan.

   <img width="262" height="511" alt="image" src="https://github.com/user-attachments/assets/b265d113-6a92-4b02-a6ab-9d2b809eda37" />

5. Hapus Data Rental
   
   Pada menu **Hapus Data Rental**, pengguna memasukkan ID transaksi yang ingin dihapus. Sistem mencari transaksi berdasarkan ID            tersebut. Jika transaksi ditemukan, data akan dihapus dari `ArrayList`. Jika ID tidak ditemukan, sistem akan menampilkan pesan bahwa     data tidak ditemukan.

   <img width="244" height="287" alt="image" src="https://github.com/user-attachments/assets/d98e2adf-4ac7-4cfa-8d69-6f648e16dab4" />

6. Keluar dari Program
   
   Setelah setiap proses selesai, program kembali menampilkan menu utama sehingga pengguna dapat memilih proses lainnya. Program akan       terus berjalan selama pengguna belum memilih menu **Keluar**. Ketika pengguna memilih menu keluar, program akan menampilkan pesan        bahwa program selesai dan menghentikan proses.

   <img width="522" height="303" alt="image" src="https://github.com/user-attachments/assets/b07d15d3-1c13-43d6-a4a4-7cb921fac36b" />
