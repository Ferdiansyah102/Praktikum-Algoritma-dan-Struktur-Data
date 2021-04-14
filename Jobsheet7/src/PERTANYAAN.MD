## 7.2.3 Pertanyaan
1. Perhatikan class StackMain, apakah fungsi angka 5 pada potongan kode
program berikut?

    Fungsi angka 5 pada potongan program diatas adaalah panjang atau banyaknya
    elemen yang diisikan pada program tersebut adalah sebanyak 5.
2. Lakukan penambahan data ke stack sebanyak dua kali, menggunakan angka 18 dan 40. Tampilkan hasilnya!

    Sudah
3. Pada soal nomor 2, mengapa data yang dimasukkan ke dalam Stack hanya
angka 18, sedangkan angka 40 tidak dimasukkan? Jelaskan!

    karena isi dari stack diatas adalah 5, oleh karena itu data yang dapat dimasukkan
adalah 18 dan jika, angka 40 dimasukkan akan menampilkan “Isi stack penuh!”,
karena angka 40 merupakan data ke-6.

## 7.3.3 Pertanyaan
1. Perhatikan class StackMain, pada saat memanggil fungsi push, parameter
yang dikirimkan adalah bk. Data apa yang tersimpan pada variabel bk
tersebut?
    Data yang tersimpan adalah data dari buku yang meliputi judul, nama pengarang,
tahun terbit, jumlah halaman, dan harga.
2. Tunjukkan potongan kode program untuk menentukan kapasitas
penampungan stack!

    Buku st = new Buku(8);
3. Apakah fungsi penggunaan do-while yang terdapat pada class StackMain?

    Fungsi dari do-while adalah untuk melakukan pengulangan pada pengisian data
buku dimana setelah mengisi data buku dilakukan pengecekan apakah ingin
menambah data baru jika y akan mengulang mengisi data buku jika n maka akan
keluar dari perulangan.
4. Modifikasi kode program pada class StackMain sehingga pengguna dapat
memilih operasioperasi pada stack (push, pop, peek, atau print) melalui
pilihan menu program!
    
    Sudah

## 7.4.3 Pertanyaan
1. Perhatikan class Postfix, jelaskan alur kerja method derajat!
Method derajat pada class Postfix adalah untuk mengurutkan derajat pada
operator aritmatika, dimana derajat tertinggi adalah pangkat dengan return 3 dan
+ - derajat terendaj dengan return 1.
2. Apa fungsi kode program berikut?

    Fungsi potongan kode tersebut unutk menyimpan data dari inputan pengguna.
3. Jalankan kembali program tersebut, masukkan ekspresi 3*5^(8-6)%3.
Tampilkan hasilnya!

    Masukkan ekspresi matematika (infix): 
    
    3*5^(8-6)%3
    
    Posftix: 3586-^*3%

4. Pada soal nomor 2, mengapa tanda kurung tidak ditampilkan pada hasil
konversi? Jelaskan!

    Karena tanda kurung hanya digunakan untuk menyimpan symbol pada stack dan
unutk mengeluarkan operator yang ada pada stack.