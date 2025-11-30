import java.util.Scanner;

public class RekapPenjualanCafe07 {

    static void inputPenjualan(String[] menu, int[][] penjualan) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Input penjualan untuk menu: " + menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print(" Hari " + (j+1) + ":");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }

    static void tampilData(String[] menu, int[][] penjualan) {
        System.out.println("\n=== TABEL PENJUALAN ===");
            for (int i = 0; i < menu.length; i++) {
                System.out.print(menu[i] + ": ");
                for (int j = 0; j < 7; j++) {
                    System.out.print(penjualan[i][j] + " ");
                }
                System.out.println();
            }
        }
        
        static void menuTerlaris(String[] menu, int[][] penjualan) {
            int max = -1, idx = 0;

            for (int i = 0; i < menu.length; i++) {
                int total = 0;
                for (int j = 0; j < 7; j++) total += penjualan[i][j];

                if (total > max) {
                    max = total;
                    idx = i;
                }
            }

            System.out.println("\nPenjualan Tertinggi: " + menu[idx] + " (Total: " + max + ")");
        } 
        
        static void rataRata(String[] menu, int[][] penjualan) {
            System.out.println("\n=== Rata-rata Penjualan ===");
                for (int i = 0; i < menu.length; i++) {
                    int total = 0;
                    for (int j = 0; j < 7; j++) total += penjualan[i][j];

                    System.out.println(menu[i] + ": " + (total / 7.0));
                }
            }

            public static void main(String[] args) {
                String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
                int[][] penjualan =new int[5][7];

                inputPenjualan(menu, penjualan);
                tampilData(menu, penjualan);
                menuTerlaris(menu, penjualan);
                rataRata(menu, penjualan);
            }
        }
        
