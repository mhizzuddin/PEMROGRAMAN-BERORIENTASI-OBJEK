package week3;
import java.util.Scanner;

public class inputan//sesuai file name
{
    public static void main(String[] Spongebob)
    {
        Scanner s = new Scanner(System.in);//Scanner sesuai dengan import java.util.Scanner
        System.out.print("Masukan angka : ");
        int angka = s.nextInt();
        if(angka % 2 ==0)
        {
            System.out.println("Bilangan Genap");

        }
        else
        {
            System.out.println("bilangan ganjil");
        }

        System.out.print("Masukan Nama : ");
        String nama = s.next();
        System.out.print("Masukan IPK : ");
        double ipk = s.nextDouble();
        System.out.println("Halo, "+nama);
        System.out.println("IPK "+ipk);
    }
}