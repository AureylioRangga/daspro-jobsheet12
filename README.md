PERCOBAAN 1

1. Apakah fungsi tanpa parameter selalu harus bertipe void?
   jawab : Tidak. Fungsi tanpa parameter boleh mengembalikan nilai (return) ataupun tidak.
           parameter hanya berhubungan dengan input, bukan tipe return.

2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi
   Menu()? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu
   tanpa menggunakan fungsi!
   jawab : Bisa, Cukup tulis semua perintah print langsung di dalam main().

3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua
  perintah penampilan menu langsung di dalam fungsi main.
  jawab : 
  1. Menghindari duplikasi kode (reusable).
  2. Program lebih rapi dan mudah dibaca.
  3. Mudah diperbarui (cukup ubah di fungsi, tidak di banyak tempat).
  4. Memudahkan pemeliharaan & pengembangan program.

4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main
   (mulai dari program dijalankan sampai daftar menu tampil di layar).
   jawab :
   1. Program dimulai dari main().
   2. Main() memanggil fungsi Menu().
   3. Program masuk ke dalam badan fungsi Menu().
   4. Menu dicetak ke layar.
   5. Eksekusi kembali ke main().
   6. Program berhenti.


PERCOBAAN 2

1. Apakah kegunaan parameter di dalam fungsi?
   jawab : Parameter digunakan untuk mengirim data dari pemanggil ke fungsi supaya fungsi bisa bekerja sesuai    
           kebutuhan.

2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter
   namaPelanggan dan isMember?
   jawab : 
   1. namaPelanggan → untuk menampilkan siapa yang datang.
   2. isMember → menentukan apakah pelanggan dapat diskon.

3. Apakah parameter sama dengan variabel? Jelaskan
   jawab : Tidak sama, tetapi terkait.
           1. Parameter adalah variabel, tetapi berada di dalam tanda kurung fungsi
           2. Parameter digunakan untuk menerima nilai dari luar fungsi
           3. Parameter bersifat lokal hanya di fungsi tersebut

4. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa
   perbedaan output ketika isMember bernilai true dan ketika false?
   jawab : 
   > Jika true → tampilkan “member“ dan diskon.
   > Jika false → tampilkan “non-member“.

5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter
   namaPelanggan dan isMember?
   jawab : Muncul error compile karena fungsi membutuhkan parameter.

6. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String).
   Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo
   adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang
   berlaku, tampilkan kode invalid.
   jawab : sudah

7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan
   tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris
   perintah pemanggilan fungsi menu yang benar.
   jawab : sudah, Menu("Budi", true, "DISKON30");
 

8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember 
   pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan
   dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter?
   Jelaskan alasan Anda.
   jawab : iya, karena 
           1. fungsi menjadi fleksibel
           2. nilai dapat diganti tanpa mengedit isi fungsi
           3. mempermudah pengembangan program


PERCOBAAN 3 

1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return
   value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh
   dari program kafe pada Percobaan 3 untuk masing-masing kasus.
   jawab : 
        1. Return DIBUTUHKAN jika:
           fungsi menghasilkan nilai, misal perhitungan total harga.
        2. Return TIDAK diperlukan jika:
           hanya menampilkan sesuatu, contoh fungsi Menu().

2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan
   pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua
   buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing
   parameter dalam konteks program kafe.
   jawab : 
          > Return type: int atau double (total harga)
          > Parameter:
            int pilihanMenu = menu mana yang dipilih
            int banyakItem = berapa porsi yang dipesan

3. Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoAbsen dapat menerima 
   kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari
   totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka
   mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode
   promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga
   totalHarga.
   jawab : sudah

4. Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta
   menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga
   pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3
   sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis
   menu)? 
   jawab :


PERCOBAAN 4

1. Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String...
   namaPengunjung!
   jawab :

2. Modifikasi method daftarPengunjung menggunakan for-each loop.
   jawab :

3. Bisakah menggunakan dua tipe data varaargs dalam satu fungsi? Jelaskan jawaban
   Anda berdasarkan aturan varargs di Java, dan berikan contohnya!
   jawab :

4. Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen. 
   Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan?
   Jika tetap berjalan, bagaimana output yang dihasilkan?
   jawab :








