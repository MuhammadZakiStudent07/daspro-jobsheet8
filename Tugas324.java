import java.util.Scanner;

public class Tugas324 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlToko, totalBarangSeluruhToko = 0;
        int tokoTerbanyakNomor = 1;
        int maxBarangToko = -1;

        while (true) {
            System.out.print("Masukkan jumlah toko: ");
            jmlToko = input.nextInt();
            if (jmlToko >= 1) {
                break;
            }
            System.out.println("Input tidak valid! Jumlah toko minimal 1.");
        }

        String ringkasanToko = "";

        for (int i = 1; i <= jmlToko; i++) {
            int jmlPelanganToko = 0;
            int totalBarangToko = 0;

            System.out.println("\n--- Data Toko " + i + " ---");
            
            while (true) {
                System.out.print("Masukkan jumlah pelanggan untuk Toko " + i + ": ");
                jmlPelanganToko = input.nextInt();
                if (jmlPelanganToko >= 0) {
                    break;
                }
                System.out.println("Input tidak valid! Jumlah pelanggan tidak boleh negatif.");
            }

            for (int j = 1; j <= jmlPelanganToko; j++) {
                int jmlBarangPelanggan = 0;
                while (true) {
                    System.out.print("  Jumlah barang yang dibeli Pelanggan " + j + ": ");
                    jmlBarangPelanggan = input.nextInt();
                    if (jmlBarangPelanggan >= 0) {
                        break;
                    }
                    System.out.println("  Input tidak valid! Jumlah barang tidak boleh negatif.");
                }

                totalBarangToko += jmlBarangPelanggan;
            }

            ringkasanToko += "Toko " + i + " - pelanggan: " + jmlPelanganToko + ", total barang: " + totalBarangToko + "\n";
            totalBarangSeluruhToko += totalBarangToko;

            if (totalBarangToko > maxBarangToko) {
                maxBarangToko = totalBarangToko;
                tokoTerbanyakNomor = i;
            }
        }

        System.out.print(ringkasanToko);
        System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + "Toko " + tokoTerbanyakNomor);

        input.close();
    }
}
