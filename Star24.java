import java.util.Scanner;

class Star24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukan nilai n = ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        sc.close();
    }
}