## 4.2.3 Pertanyaan

1. Algoritma Divide Conquer pencarian nilai faktorial adalah saat menerima
parameter sama dengan satu maka akan dikembalikan lagi sama dengan satu.
Jika menerima parameter lebih dari satu maka parameter atau n tersebut akan
dikalikan dengan method faktorialDC dengan parameter n-1, proses tersebut
terus berulang dan akan berhenti jika n sama dengan satu.
2. Iya terdapat 3 tahapan divide, conquer, dan combien
Tahapan divide ditunjukan dengan adanya pembagian kondisi if else, tahapan
conquer ditunjukkan dengan proses pengkalian nilai n dengan method
faktorialDC, dan tahapan combien ditujukkan dengan penampilan hasil
penghitungan faktorial pada return.
3. Bisa, dirubah menggunakan 
while
public int faktorialBF(int n){
 int fakto = 1;
 int i = 1;
 while (i <= n){
 fakto = fakto * i;
 i++;
 }
 return fakto;
 }
 4. Baik

## 4.3.3 Pertanyaan

1. Pada method PangkatBF menggunakan perulangan for untuk melakukan perhitungan perkalian nilai yang dipangkat dengan pangkatnya, sedangkan pada method PangkatDC proses pehitungannya dengan dibagi menggunakan kondisi if else lalu untuk proses pengkaliannya dengan cara memanggil atau mengkalikannya dengan fungsi PangkatDC. 
2. Pada potongan program tersebut terdapat kondisi apabila nilai n adalah modulus 2 = 1, maka returnnya adalah mengkalikan method PangkatDC
dengan method PangkatDC dengan parameter a,n/2 lalu mengkalikannya dengan a. Jika kondisinya else returnnya adalah mengkalikan method
PangkatDC dengan method PangkatDC dengan parameter a,n/2 tanpa mengkalikannya dengan a.
3. Sudah, pada kode tersebut melakukan combine dengan menggunkan return
4. Baik

## 4.4.3 Pertanyaan

1. 
