PERCOBAAN 1

1. Apakah fungsi tanpa parameter selalu harus bertipe void?
   jawab : tidak. fungsi tanpa parameter boleh mengembalikan nilai (return) ataupun tidak.
           parameter hanya berhubungan dengan input, bukan tipe return.

2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi
   Menu()? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu
   tanpa menggunakan fungsi!
   jawab : bisa, cukup tulis semua perintah print langsung di dalam main().

3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua
  perintah penampilan menu langsung di dalam fungsi main.
  jawab : 
  1. menghindari duplikasi kode (reusable).
  2. program lebih rapi dan mudah dibaca.
  3. mudah diperbarui (cukup ubah di fungsi, tidak di banyak tempat).
  4. memudahkan pemeliharaan & pengembangan program.

4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main
   (mulai dari program dijalankan sampai daftar menu tampil di layar).
   jawab :
   1. Program dimulai dari main().
   2. main() memanggil fungsi Menu().
   3. Program masuk ke dalam badan fungsi Menu().
   4. Menu dicetak ke layar.
   5. Eksekusi kembali ke main().
   6. Program berhenti.


PERCOBAAN 2



