package week4; //sesuai folder

class Array { //sesuai file 
    public static void main(String[] args)
    {
        int[] angka = new int[6];
        angka[1] = 6;
        angka[5] = 3;
        
        for(int i = 0; i < angka.length; i++){
            System.out.print(angka[i]+ ",");
        }
        String[] kata = {"udang","tembok","lebah","bani"};

        kata[2] = "";

        for(int i = 0; i < kata.length; i++)        
        {
            if(kata[i] != "")
            {
            System.out.print(kata[i]+ ",");
            }
        }
        int [][] matriks = {
            {5,4,2,1},
            {9,6,1,5},
            {7,5,3,1},
        };

            System.out.println();
        for(int i = 0; i <matriks.length; i++)
        {
            for(int j = 0; j<matriks[i].length; j++)
            {
                System.out.print(matriks[i][j] +", ");
            }
                System.out.println("");
        }
    }
}