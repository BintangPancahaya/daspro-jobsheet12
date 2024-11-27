package Rekursif;
import java.util.Scanner;

public class CekPrimaRekursif {

    public static boolean cekPrima(int a, int b) {
        if (b == 1) {
            return true;
        }
        if (a % b == 0) {
            return false;
        }
        return cekPrima(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int a = scanner.nextInt();

        if (a < 2) {
            System.out.println(a + " bukan bilangan prima.");
        } else {
            if (cekPrima(a, a - 1)) {
                System.out.println(a + " adalah bilangan prima.");
            } else {
                System.out.println(a + " bukan bilangan prima.");
            }
        }
        scanner.close();
    }
}