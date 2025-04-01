package week4;

import java.util.Scanner;

public class mainquiz1 {
    public static void main(String[] args) {  // Perbaiki 'min' menjadi 'main'
        Scanner scanner = new Scanner(System.in);
        Quiz quiz = new Quiz();

        System.out.println("Selamat datang di kuis!");
        System.out.println("Jawab semua pertanyaan dengan memilih nomor opsi");
        
        // Loop untuk menampilkan semua pertanyaan dan memproses jawaban
        for (int i = 0; i < quiz.getQuestionCount(); i++) {
            quiz.displayQuestion(i);
            System.out.print("Masukkan jawaban Anda (1-4): ");
            int userAnswer = scanner.nextInt();
            quiz.checkAnswer(i, userAnswer);
        }
        
        // Tampilkan skor akhir
        System.out.println("\nKuis selesai!");
        System.out.println("Skor Anda: " + quiz.getScore());
        
        scanner.close();
    }
}