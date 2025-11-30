import java.util.Scanner;

public class NilaiMahasiswa07 {

    // Fungsi untuk mengisi array nilai mahasiswa 
    // Parameter: int[] a = array yang akan diisi
    static void isianArray(int[] a){ 
        Scanner sc = new Scanner(System.in); 

        // Loop untuk mengisi setiap elemen array
        for(int i=0; i<a.length; i++){
            System.out.print("Nilai Mahasiswa ke-" + (i+1) + ": ");
            a[i] = sc.nextInt();
        }
    }

    // Fungsi untuk menampilkan isi array
    static void tampilArray(int[] a){
        System.out.println("\nDaftar Nilai:");

        // Menggunakan for-each untuk menampilkan semua nilai
        for(int x : a){
            System.out.println(x);  // Menampilkan nilai mahasiswa
        }
    }

    // Fungsi untuk menghitung total nilai semua mahasiswa
    // Mengembalikan nilai total sebagai int
    static int hitTot(int[] a){
        int total = 0;  // Variabel penampung jumlah nilai
        
        // Menjumlahkan semua elemen array
        for(int x : a){
            total += x; // Tambahkan nilai ke total
        }
        return total;   // Kembalikan jumlah total
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input jumlah mahasiswa
        System.out.print("Jumlah mahasiswa: ");
        int N = sc.nextInt();

        // Membuat array dengan ukuran N
        int[] nilai = new int[N];

        // Memanggil fungsi untuk mengisi nilai mahasiswa
        isianArray(nilai);

        // Menampilkan seluruh nilai mahasiswa
        tampilArray(nilai);

        // Menghitung total nilai dengan memanggil fungsi hitTot()
        int total = hitTot(nilai);

        // Menampilkan hasil total
        System.out.println("Total nilai = " + total);
    }
}

