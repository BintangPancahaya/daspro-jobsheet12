package Rekursif;

import java.util.Scanner;

public class Fibonacci {
    static int fibo(int n, int a, int b) {
        if (n == 0) {
            return a;
        }
        return fibo(n - 1, b, a + b);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bulan: ");
        int bulan = input.nextInt();
        System.out.println("Total pasangan marmut pada bulan ke-" + bulan + " adalah " + fibo(bulan, 0, 1));
        input.close();
    }
}
