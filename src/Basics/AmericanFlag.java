package Basics;

public class AmericanFlag {
    public static void main(String[] args) {
        String sequence1 = "* * * * * * =================================";
        String sequence2 = " * * * * *  =================================";
        String sequence3 = "=============================================";

        for (int i =0; i<4; i++){
            System.out.println(sequence1);
            System.out.println(sequence2);
            if (i==3){
                System.out.println(sequence1);
            }
        }
        for (int j =0; j<6; j++){
            System.out.println(sequence3);
        }
    }
}
