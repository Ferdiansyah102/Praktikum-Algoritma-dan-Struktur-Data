## 8.2.3 Pertanyaan
1. Pada method Create, mengapa atribut front dan  rear diinisialisasi dengan nilai -1, tidak 0?
Karena, indeks pertama pada array adalah 0, maka pada inisialisasi queue yang belum memiliki isi dengan -1 jika, mengunakan 0 maka terdapat isi pada indeks ke 0 queue tersebut.
2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode
berikut!
Jika, posisi REAR berada pada indeks terakhir array, maka posisi REAR
selanjutnya adalah di indeks 0.
3. Perhatikan kembali method Enqueue, baris kode program manakah yang
menunjukkan bahwa data baru disimpan pada posisi terakhir di dalam
queue?
else {
if (IsEmpty()) {
front = rear = 0;
} else {
if (rear == max - 1) {
rear = 0;
} else {
rear++;
}
}
Q[rear] = data;
size++;
}
4. Perhatikan kembali method Dequeue, baris kode program manakah yang menunjukkan bahwa data yang dikeluarkan adalah data pada posisi paling
depan di dalam queue?
else {
data = Q[front];
size--;
5. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!
Jika, posisi FRONT saat ini berada di indeks terakhir array, maka
FRONT selanjutnya diletakkan di indeks 0.
6. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), melainkan int i=front?
Karena, posisi dari FRONT tidaklah selalu berada pada index 0 dan posisi REAR tidak selalu berada pada index terakhir, maka dituliskan int i=front agar tidak terjadi kesalahan saat penampilan hasilya.
7. Perhatikan kembali method print, jelaskan maksud dari potongan kode
berikut!
Untuk menghentikan looping, jika kode program tersebut dihilangkan akan terjadi infinit loop pada method print.
## 8.3.3 Pertanyaan
1. Perhatikan class Queue, apa fungsi kode program berikut pada method
Dequeue?
Fungsi kode program diatas adalah untuk melakukan instansiasi objek dari class
Penumpang yang berparameter.
2. Pada soal nomor 1, apabila kode program tersebut diganti dengan kode berikut: Penumpang data = new Penumpang() Apakah yang terjadi? Mengapa demikian?
Jika kode pada nomer 1 diubah akan terjadi error, karena konstruktor Penumpang merupakan konstruktor berparameter. Jika parameternya tidak disertakan maka akan terjadi error.
3. Tunjukkan kode program yang digunakan untuk menampilkan data yang dikeluarkan dari queue!
System.out.println("Antrian yang keluar: " + data.nama + " " +
data.kotaAsal + " " + data.kotaTujuan + " " +
data.jumalhTiket + " " + data.harga);
break;
4. Lakukan modifikasi program dengan menambahkan method baru bernama
peekRear pada class Queue yang digunakan untuk mengecek antrian yang
berada di posisi belakang! Tambahkan pula daftar menu 5. Cek Antrian
paling belakang pada class QueueMain sehingga method peekRear dapat
dipanggil!
class Penumpang
public void peekRear() {
if (!IsEmpty()) {
System.out.println("Elemen terbelakang: " + Q[rear].nama +
" " + Q[rear].kotaAsal
+ " " + Q[rear].kotaTujuan + " " +
Q[rear].jumalhTiket + " " + Q[rear].harga);
} else {
System.out.println("Queue masih kosong");}
}