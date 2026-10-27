import java.util.Scanner;

public class Tugas24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nilai n = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int angka = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + angka++);
            }
            System.out.println();
        }
    }
}
