package Rekursif;
import java.util.Scanner;

public class Percobaan2 {
    static int hitungPangkat(int x, int y, String deret) {
        if (y == 0) {
            System.out.print(deret + "1 = ");
            return 1;
        } else {
            return (x * hitungPangkat(x, y - 1, deret + x + " x "));
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bilangan yang dihitung: ");
        int bilangan = input.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = input.nextInt();
        System.out.println(hitungPangkat(bilangan, pangkat, ""));
        input.close();
    }
}
