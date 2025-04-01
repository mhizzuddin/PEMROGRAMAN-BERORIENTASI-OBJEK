package week4;

import java.util.Scanner;

public class mainquiz{
    public static void min(String[]args){
        Scanner scanner = new Scanner(System.in);
        Quiz quiz = new Quiz();

        System.out.println("selamat datang di kuis!");
        System.out.println("jawab semua pertanyaan dengan memilih nomor opsi");
        
        Quiz.displayQuestion(0);     
        Quiz.displayQuestion(1);     
        Quiz.displayQuestion(2);     

    }
}