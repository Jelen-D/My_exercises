package Basics;

import java.util.Scanner;

public class SzesciokatForemny {

    double dlBoku = Integer.MIN_VALUE;

    public static void main(String[] args) {
        SzesciokatForemny szesciokatForemny = new SzesciokatForemny();
        double bok_a = szesciokatForemny.odczytajDlugoscBoku();
        System.out.println("Przyjęto długość boku a = "+bok_a);
        szesciokatForemny.policzPolePowierzchni(bok_a);
        szesciokatForemny.policzObwod(bok_a);
        szesciokatForemny.policzPrzekatne(bok_a);
        szesciokatForemny.policzPromienieOkrekow(bok_a);
    }

    public double odczytajDlugoscBoku(){
        String bok = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość boku sześciokąta:");

        while (dlBoku < 0) {
            try {
                bok = scanner.nextLine();
                dlBoku = Double.parseDouble(bok);
                if (dlBoku<0){
                    System.out.println("Długość boku nie może być ujemna.");
                    System.out.println("Podaj długość boku sześciokąta:");
                }
            } catch (NumberFormatException ie) {
                System.out.println("Zły format liczby.");
                System.out.println("Podaj długość boku sześciokąta:");
            }
        }
        return dlBoku;
    }

    public void policzPolePowierzchni(double dlBoku){
        double pole = (3*Math.pow(dlBoku, 2)*Math.sqrt(3))/2;
        System.out.println("Pole szesciokata wynosi: "+pole);
    }

    public void policzObwod(double dlBoku){
        double obwod = 6*dlBoku;
        System.out.println("Obwód szesciokata wynosi: "+obwod);
    }

    public void policzPrzekatne(double dlBoku){
        double przekatna_D = 2*dlBoku;
        double przekatna_d = dlBoku*Math.sqrt(3);
        System.out.println("Dłuższa przekątna D szesciokata wynosi: "+przekatna_D);
        System.out.println("Krótsza przekątna d szesciokata wynosi: "+przekatna_d);
    }

    public void policzPromienieOkrekow(double dlBoku){
        double przekatnaOkreguWpisanego_r = (dlBoku*Math.sqrt(3))/2;
        double przekatnaOkreguOpisanego_R = dlBoku;
        System.out.println("Promień okręgu r wpisanego w sześciokąt wynosi: "+przekatnaOkreguWpisanego_r);
        System.out.println("Promień okręgu R wpisanego w sześciokąt jest równy długości boku a i wynosi: "+przekatnaOkreguOpisanego_R);
    }

    public double getDlBoku() {
        return dlBoku;
    }
}
