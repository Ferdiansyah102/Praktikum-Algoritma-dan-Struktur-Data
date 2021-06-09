## 12.2.3 Pertanyaan Percobaan
1. Sebutkan beberapa jenis (minimal 3) algoritma yang menggunakan dasar Graph, dan apakah kegunaan algoritma-algoritma tersebut?
a.BFS adalah algoritma yang digunakan untuk melakukan pencarian.
b.DFS adalah algoritma yang digunakan untuk melakukan pencarian.
c.Algoritma Bellman-Ford adalah algoritma yang digunakan untuk
menemukan lintasan terpendek.
2. Pada class Graph terdapat array bertipe LinkedList, yaitu LinkedList[]. Apakah tujuan pembuatan variabel tersebut ?
Untuk memanggil fungsi linked list dan untuk mengisi list yang berupa vertex pada linked list tersebut.
3. Apakah alasan pemanggilan method addFirst() untuk menambahkan data, bukan method add jenis lain pada linked list ketika digunakan pada
method addEdge pada class Graph?
Untuk mengenalkan pertama kali vertex tersebut dan juga koneksinya.
4. Bagaimana cara mendeteksi prev pointer pada saat akan melakukan penghapusan suatu edge pada graph ?
Dengan melakukan looping pada vertex. Jika, vertex lebih besar dari i dan destination sama dengan i maka edge akan secara otomatis dihapus.5. Kenapa pada praktikum 12.2 langkah ke-12 untuk menghapus path yang bukan merupakan lintasan pertama kali menghasilkan output yang salah
? Bagaimana solusinya ?
Output yang dikeluarkan tidak mengalami error, namun data vertex yang dilewati mengalami perubahan lintasan.
## 12.3.3 Pertanyaan Percobaan
1. Apakah perbedaan degree/derajat pada directed dan undirected graph?
Pada directed graph degree mempengaruhi bobot pada edge antar vertex (beratnya tidak sama antara A ke B dan B ke A), sedangkan undirected graph degree tidak mempengaruhi bobot (bobot antara A ke B sama dengan B ke A). Pada directed graph degreenya bisa berbeda untuk derajat in dan outnya,
sedangkan pada undirected degreeya sama.
2. Pada implementasi graph menggunakan adjacency matriks. Kenapa jumlah vertices harus ditambahkan dengan 1 pada indeks array berikut?
Karena, pada matrix index dimulai dari 0 maka, agar vertex dalam matrix sama dengan vertex yang aslinya harus ditambah 1.
3. Apakah kegunaan method getEdge() ?
Untuk menampilkan apakah vertex tersedia atau tidak di dalam graph.
4. Termasuk jenis graph apakah uji coba pada praktikum 12.3 ?
Graph adjacency matrix yaitu directed graph.
5. Mengapa pada method main harus menggunakan try-catch Exception ?
Untuk penanganan error agar program tetap berjalan meskipun ada error serta tidak terjadi hang.