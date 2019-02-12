package Basics;

public class NumbersDivisibleBy3and5 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int counter = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = counter;
            counter += 1;
        }

        System.out.println("Liczby podzielne przez 3:");
        for (int i : array) {
            if (i%3 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Liczby podzielne przez 5:");
        for (int i : array) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Liczby podzielne przez 3 i 5:");
        for (int i : array) {
            if (i %3 == 0 || i%5==0) {
                System.out.println(i);
            }
        }
    }
}
