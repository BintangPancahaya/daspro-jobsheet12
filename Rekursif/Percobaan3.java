package Rekursif;

import java.util.Scanner;

public class Percobaan3 {
    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return (saldo);
        } else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah saldo awal: ");
        double saldoAwal = input.nextDouble();
        System.out.print("Lamanya investasi (tahun) : ");
        int tahun = input.nextInt();

        System.out.print("Jumlah saldo setelah " + tahun + " tahun: ");
        System.out.print(hitungLaba(saldoAwal, tahun));
        input.close();
    }
}
