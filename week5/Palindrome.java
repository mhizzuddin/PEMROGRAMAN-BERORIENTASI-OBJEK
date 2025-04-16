package week5;

import java.util.Scanner;

// Kelas Main (program utama)
public class Palindrome {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Membuat objek TextGame untuk pengecekan palindrome biasa
        TextGame game1 = new TextGame();
        
        // Membuat objek FancyTextGame untuk pengecekan dengan animasi
        TextGame game2 = new FancyTextGame();
        
        // Meminta input dari pengguna
        System.out.print("Masukkan kata: ");
        String input = scanner.nextLine();
        
        // Menampilkan hasil untuk TextGame
        System.out.println("\nHasil TextGame:");
        game1.displayResult(input);
        
        // Menampilkan hasil untuk FancyTextGame
        System.out.println("\nHasil FancyTextGame:");
        game2.displayResult(input);
        
        // Menutup scanner
        scanner.close();
    }
}