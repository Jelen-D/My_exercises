package Basics;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class RownanieKwadratowe {

    private double a, b, c;

    public static void main(String[] args) {
        RownanieKwadratowe rownanie = new RownanieKwadratowe(3214.43, 34.23, -43.22);
        rownanie.oblicz();
    }

    public RownanieKwadratowe(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void oblicz(){
        double delta = pow(b, 2)-4*a*c;

        if (delta>0){
            double x1 = (-b-sqrt(delta))/(2*a);
            double x2 = (-b+sqrt(delta))/(2*a);
            System.out.println("Delta jest plusowa i równa: " + delta);
            System.out.println("X1 rwóna się: " + x1);
            System.out.println("X2 równa się: " + x2);
        } else if (delta==0){
            double x0 = -b/(2*a);
            System.out.println("Delta jest zerowa: " + delta);
            System.out.println("X0 róna się: " + x0);
        }else {
            System.out.println("Delta jest mniejsza od zera i równa: " + delta);
            System.out.println("Więc równanie nie ma rozwiązań");
        }
    }
}
