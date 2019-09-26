
package latihanfunction5;

import java.util.Scanner;

public class latihan5 {
    public static void hasil(int a, int b, int c){
        if(a > b && a > c){
            System.out.println("Nilai terbesar adalah " +a);
        }else if(b > a && b > c){
            System.out.println("Nilai terbesar adalah "+b);
        }else if(c > a && c > b){
            System.out.println("Nilai terbesar adalah "+c);
            
        }
        
    }
    public static void main(String[] args) {
        Scanner larang = new Scanner(System.in);
        System.out.print("Masukkan bilangan I = ");
        int x = larang.nextInt();
        System.out.print("Masukkan bilangan II = ");
        int y = larang.nextInt();
        System.out.print("Masukkan bilangan III = ");
        int z = larang.nextInt();
        hasil(x,y,z);
    }
    
}
