package Basics;

public class PoleProstokata {
    private int szerokość;
    private int wysokosc;

    public static void main(String[] args) {
        PoleProstokata prostokat = new PoleProstokata(-7, 20);
        prostokat.obliczPoleProstokata();
    }

    public PoleProstokata(int szerokość, int wysokosc) {
        this.szerokość = szerokość;
        this.wysokosc = wysokosc;
    }

    public void obliczPoleProstokata(){
        int a = szerokość;
        int b= wysokosc;
        int pole;

        if (a == 0 || b==0){
            pole = 0;
            System.out.println("Pole prostokąta równa się zero, bo jedna z wartości jest równa zero: "+pole);
        }else if (a<0 || b<0) {
            System.out.println("Nie da się obliczyć pola, bo jedna z wartości jest ujemna");
            if (a<0){
                System.out.println("serokość: " + a);
            }else {
                System.out.println("wysokość: " + b);
            }
        }else {
            pole = a*b;
            System.out.println("Pole prostokąta wynosi: " + pole);
        }
    }
}
