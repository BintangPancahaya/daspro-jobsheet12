package Rekursif;

import java.util.Scanner;

public class DeretDescendingRekursif {
    static int bilanganRekursif (int n) {
        if (n == 0) {
            return (0);
        } else {
            System.out.print(n+" ");
            return bilanganRekursif(n-1);
        }
    }
    static int bilanganInteratif (int n) {
        for (int i = n; i >= 1; i--) {
            System.out.print(i+" ");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bilangan;
        System.out.print("Masukkan bilangan: ");
        bilangan = input.nextInt();
        System.out.print("Jika Rekursif: ");
        System.out.println(bilanganRekursif(bilangan));
        System.out.print("Jika Interatif: ");
        System.out.println(bilanganInteratif(bilangan));
        input.close();
    }
}
