package week3;//folder sesuai dengan nama package
import java.util.Scanner;
import java.util.Random;

class Tebakangkatgs//file sesuai dengan nama class
{
    public static void main(String[] aaa)
    {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.println("====================");
        System.out.println("    TEBAK ANGKA     ");
        System.out.println("====================");
        
        // Generate angka random antara 1 sampai 100
        int angka = r.nextInt(100) + 1;
        //System.out.println(angka); // Komentar ini bisa dihapus atau digunakan untuk debugging
        
        boolean tebakanBenar = false; // Untuk menentukan kapan loop berhenti
        
        // Loop sampai tebakan benar
        while (!tebakanBenar)//Secara keseluruhan, perintah ini berarti: "Lakukan perulangan selama tebakanBenar bernilai false". Dengan kata lain, blok kode di dalam while akan terus berjalan sampai kondisi tebakanBenar menjadi true.
        {
            System.out.print("Masukkan angka : ");
            int tebakan = s.nextInt();
            
            // Cek apakah tebakan benar
            if (tebakan == angka)
            {
                System.out.println("Tebakan kamu benar");
                tebakanBenar = true; // Keluar dari loop
            }
            else
            {
                System.out.println("Tebakan kamu salah");
                // Beri petunjuk apakah tebakan terlalu kecil atau besar
                if (tebakan < angka)
                {
                    System.out.println("Tebakan kamu terlalu kecil");
                }
                else
                {
                    System.out.println("Tebakan kamu terlalu besar");
                }
            }
        }
        
        s.close(); // Menutup scanner
    }
}
