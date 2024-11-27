package Rekursif;
import java.util.Scanner;
public class PenjumlahanRekursif {
    static int jumlahRekursif(int n) {
        if (n == 0) {
            return 0;
        } else {
            int result = n + jumlahRekursif(n-1);
            return result;
        }
    }
    
    static void tampilkanPerhitungan(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i < n) System.out.print(" + ");
        }
        System.out.print(" = " + jumlahRekursif(n));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();
        tampilkanPerhitungan(bilangan);
        input.close();
    }
}