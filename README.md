# Saya Raffi Ardhi Naufal NIM 2202495 mengerjakan Latihan Praktikum 2 dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

Saya membuat desain kode untuk sistem pendataan baju dari sebuah perusahaan dengan 3 kelas, yaitu Product; Clothing dan Shirt. Masing-masing berisi kode konstruktor, destruktor, getter dan setter. Berikut merupakan urutan pewarisan daripada 3 kelas tersebut : 

![Struktur Pewarisan Kelas](image.png)

Penjelasan : Saya mengurutkan pewarisan ini dari Product, lalu ada Clothing sebagai anaknya, dan Shirt sebagai cucu dari Product. Saya memilih urutan ini untuk memastikan struktur pewarisan dimulai dari benda/konsep yang lebih umum (Product) dan merinci hingga benda/konsep yang lebih spesifik (Shirt).

Lalu penjelasan mengenai alur pemakaiannya :
1. Pengguna membuka aplikasi sistem pendataan baju
2. Pengguna masuk dan diperlihatkan data baju yang ada beserta opsi untuk melakukan tambah data atau keluar aplikasi di bagian bawah
3. Pengguna memilih opsi menambah data baju
4. Pengguna memasukkan data-data yang diperlukan (id, nama, brand, harga, ukuran, bahan, jenis kelamin, warna, dan sleeve)
5. Jika sudah dimasukkan, maka pengguna akan diberitahu bahwa data sudah ditambah dan akan diarahkan kembali ke halaman utama
6. Kemudian, pengguna memilih opsi keluar dari aplikasi
7. Maka, akan ada pesan selamat tinggal kepada pengguna, dan pengguna keluar dari aplikasi
