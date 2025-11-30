import java.util.Scanner;

public class ModifikasiTugas3a {

    static void inputData(String[] menu, int[][] data) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Input penjualan " + menu[i]);
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(" Hari " + (j+1) + ": ");
                data[i][j] = sc.nextInt();
            }
        }
    }

    static void tampil(String[] menu, int[][] data) {
        System.out.println("\n=== TABEL ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + ": ");
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void tertinggi (String[] menu, int[][] data) {
        int max = -1, idx = 0;

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < data[0].length; j++) total += data[i][j];
            if (total > max) {
                max = total;
                idx = i;
            }
        }

        System.out.println("Menu Tertinggi: " + menu[idx] + " (Total: " + max + "}");
    }
    
    static void rata(String[] menu, int[][] data) {
        System.out.println("\n=== Rata-Rata ===");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < data[0].length; j++) total += data[i][j];
            System.out.println(menu[i] + ": " + (total / (double) data[0].length));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah menu: ");
        int m = sc.nextInt();
        System.out.print("Jumlah hari: ");
        int h = sc.nextInt();

        String[] menu = new String[m];
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            System.out.print("Nama menu ke-" + (i+1) + ": ");
            menu[i] = sc.nextLine();
        }

        int[][] data = new int[m][h];

        inputData(menu, data);
        tampil(menu, data);
        tertinggi(menu, data);
        rata(menu, data);
    }
}