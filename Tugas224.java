import java.util.Scanner;

public class Tugas224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalJumlah = 0, n, hitungPerkalian = 0;

        while (true) {
            System.out.print("Masukkan nilai n (minimal 3): ");
            n = sc.nextInt();
            if (n >= 3) {
                break;
            }
            System.out.println("Input tidak valid! Nilai n harus minimal 3.");
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                hitungPerkalian = i * j;
                totalJumlah += hitungPerkalian;
                System.out.printf("%4d", hitungPerkalian);
            }
            System.out.println();
        }

        System.out.println("Jumlah seluruh angka: " + totalJumlah);
    }
}
