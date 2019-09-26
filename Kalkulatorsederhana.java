/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulatorsederhana;

/**
 *
 * @author surga 2019
 */
public class Kalkulatorsederhana {

    public static void main(String[] args) {
        System.out.println("jadi hasil dari penjumlahan di atas adalah : " + penjumlahan());
        System.out.println("jadi hasil dari pengurangan di atas adalah : " + pengurangan());
        System.out.println("jadi hasil dari perkalian di atas adalah : " + perkalian());
        System.out.println("jadi hasil dari pembagian di atas adalah : " + pembagian());
        System.out.println("hasil dari modulus di atas adalah : " + modulus());
    }

    public static int penjumlahan() {
        System.out.println("PENJUMLAHAN");
        int bill1 = 1;
        int bill2 = 2;
        int hasil = bill1 + bill2;
        System.out.println(bill1 + "+" + bill2 + "=" + hasil);
        return hasil;
    }

    public static int pengurangan() {
        System.out.println("\nPENGURANGAN");
        int bill1 = 3;
        int bill2 = 6;
        int hasil = bill2 - bill1;
        System.out.println(bill2 + "-" + bill1 + "=" + hasil);
        return hasil;
    }

    public static int perkalian() {
        System.out.println("\nPERKALIAN");
        int bill1 = 2;
        int bill2 = 4;
        int hasil = bill1 * bill2;
        System.out.println(bill1 + "*" + bill2 + "=" + hasil);
        return hasil;
    }

    public static double pembagian() {
        System.out.println("\nPEMBAGIAN");
        int bill1 = 100;
        int bill2 = 4;
        double hasil = bill1 / bill2;
        System.out.println(bill1 + "/" + bill2 + "=" + hasil);
        return hasil;
    }

    public static double modulus() {
        System.out.println("\nMODULUS");
        int bill1 = 10;
        int bill2 = 9;
        double hasil = bill1 / bill2;
        System.out.println(bill1 + "%" + bill2 + "=" + hasil);
         if (bill1 > bill2) {
            System.out.println("\nsisa hasil bagi " + (bill1 % bill2));
        } else if (bill1 < bill2) {
            System.out.println("\nSisa hasil bagi = tidak ada sisa hasil bagi");
        }
        return hasil;
    }

}
