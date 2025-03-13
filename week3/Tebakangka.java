package week3;
import java.util.Scanner;
import java.util.Random;
                        

class Tebakangka
{
    public static void main(String[] aaa)
    {
        Scanner s =new Scanner(System.in);
        Random r = new Random();
        System.out.println("====================");
        System.out.println("    TEBAK ANGKA     ");
        System.out.println("====================");
        int angka = r.nextInt(100) + 1;
        //System.out.println(angka);
        System.out.print("Masukkan angka : ");
        int tebakan = s.nextInt();
        //tulis kondisi di sini
        if (tebakan == angka)
        {
                    System.out.println("Tebakan kamu benar");

        }
        else{
                    System.out.println("Tebakan kamu salah");

        }
        System.out.println("Tebakan kamu benar");
        System.out.println("Tebakan kamu salah");
    }
}