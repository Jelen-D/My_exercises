package Basics;

import static java.lang.Math.sqrt;

public class KwadratWpisanyWOkrag {
    private double bokKwadratu;
    private double promienKola;

    public static void main(String[] args) {
        KwadratWpisanyWOkrag kwadratWpisanyWOkrag = new KwadratWpisanyWOkrag(5, 6);
        kwadratWpisanyWOkrag.sprawdz();
    }

    public KwadratWpisanyWOkrag(double bokKwadratu, double promienKola) {
        this.bokKwadratu = bokKwadratu;
        this.promienKola = promienKola;
    }

    public void sprawdz(){
        double przekatnaKwadratu = bokKwadratu*sqrt(2);

        if (2*promienKola >= przekatnaKwadratu){
            System.out.println("Kwadrato o boku a = " + bokKwadratu+" DA SIĘ wpisać w koło o promieniu R = " + promienKola + " ponieważ " +
                    "jego przekątna wynosi d = " + przekatnaKwadratu + " i jest mniejsza od średnicy koła 2R = " + (promienKola*2));
        }else {
            System.out.println("Nie można wpisać kwadratu o boku a = "+bokKwadratu+" ponieważ jego przekątna d = "+ przekatnaKwadratu +
                    " jest mniejsza od promienia koła R = "+promienKola);
        }
    }
}
