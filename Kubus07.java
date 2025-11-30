public class Kubus07 {
    
    // Fungsi untuk menghitung volume kubus
    // Rumus volume kubus = sisi * sisi * sisi (s^3)
    static int volume(int sisi){
        return sisi * sisi * sisi;
    }

    // Fungsi untuk menghitung  luas permukaan kubus
    // Rumus luas permukaan kubus = 6 * sisi * sisi (6s^2)
    static int luasPermukaan(int sisi){
        return 6 * sisi * sisi; // Mengembalikan luas permukaan kubus
    }

    public static void main(String[] args) {
        int s = 5; // Nilai sisi kubus (contoh: sisi = 5)

        // Memanggil fungsi volume() dan menampilkan hasilnya
        System.out.println("Volume Kubus = " + volume(s));
        
        // Memanggil fungsi luasPermukaan() dan menampilkan hasilnya
        System.out.println("Luas Permukaan = " + luasPermukaan(s));
    }
}