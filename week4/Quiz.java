package week4;

public class Quiz {
    private String[] questions = {
        "Ibu kota Indonesia adalah?",
        "Hewan apa yang paling pendiam?",
        "Planet terbesar di tata surya?",
        "2 + 2 sama dengan?",
        "Warna langit pada siang hari biasanya?",
        "1 tahun berapa hari?",
        "Benua terkecil di dunia?",
        "Mata uang Jepang adalah?",
        "Gunung tertinggi di Indonesia?",
        "Lambang kimia air adalah?"
    };
    
    private String[][] options = {
        {"1. Jakarta", "2. Bandung", "3. Surabaya", "4. Bali"},
        {"1. Harimau", "2. Semute", "3. Gajah", "4. Kucing"},
        {"1. Mars", "2. Bumi", "3. Jupiter", "4. Saturnus"},
        {"1. 3", "2. 4", "3. 5", "4. 6"},
        {"1. Merah", "2. Hijau", "3. Biru", "4. Kuning"},
        {"1. 365", "2. 366", "3. 360", "4. 364"},
        {"1. Asia", "2. Australia", "3. Afrika", "4. Eropa"},
        {"1. Dollar", "2. Yuan", "3. Yen", "4. Won"},
        {"1. Rinjani", "2. Semeru", "3. Kerinci", "4. Jayawijaya"},
        {"1. H2O", "2. CO2", "3. O2", "4. H2SO4"}
    };
    
    private int[] correctAnswers = {1, 2, 3, 2, 3, 1, 2, 3, 4, 1}; 
    private int score = 0;
    
   
    public int getQuestionCount() {
        return questions.length;
    }
    
    
    public void displayQuestion(int index) {
        System.out.println("\nPertanyaan " + (index + 1) + ": " + questions[index]);
        for (int j = 0; j < options[index].length; j++) {
            System.out.println(options[index][j]);
        }
    }
    
    public void checkAnswer(int index, int userAnswer) {
        if (userAnswer == correctAnswers[index]) {
            System.out.println("Benar!");
            score += 10;
        } else {
            System.out.println("Salah! Jawaban yang benar adalah: " + 
                options[index][correctAnswers[index] - 1]);
        }
    }
    
    // Method untuk mendapatkan skor
    public int getScore() {
        return score;
    }
}