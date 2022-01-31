package for_3;

import java.util.Scanner;

public class For_3 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         int baris, kolom, masuk, angka;
         
         do
         {
             System.out.print("Masukkan Jumlah Pengulangan  = ");
             masuk = sc.nextInt();
         }
         while(masuk < 1);
         
        System.out.println("");
        System.out.println("+-------Tugas For 3-------+");
        System.out.println("+-------------------------+");
        System.out.println("");
         
         for (baris = 0, angka = 0; baris < masuk; baris++, angka++) 
         {
             for (kolom = baris; kolom < masuk; kolom++) 
             {
                 System.out.print("* ");
             }
             System.out.println(angka);
        }
        System.out.println("");
        System.out.println("+------- 025314020 -------+");
        System.out.println("+-------Program Java------+");
    }
    
}
