package Basics;

import java.util.ArrayList;
import java.util.Scanner;

public class ConvertingDecimalIntoBinary {
    public static void main(String[] args) {
        String stringNumber = "";
        int number=Integer.MIN_VALUE;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj licznę naturalną do przeliczenia:");

        while (number < 0) {
            try {
                stringNumber = scanner.nextLine();
                number = Integer.parseInt(stringNumber);
            } catch (NumberFormatException ie) {
                System.out.println("Zły format liczby");
                System.out.println("Podaj licznę naturalną do przeliczenia:");
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        while (number > 0) {
            list.add(number % 2);
            number = number / 2;
        }
        for (int i = list.size()-1; i > -1; i--){
            System.out.print(list.get(i));
        }
    }
}

