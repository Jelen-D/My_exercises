package tablice;

public class Instrukcje{

    public static void main(String[] args) {

        System.out.println("1) Instrukcja warunkowa if...else if");

        int x = 0;
        if (x > 0) {
            System.out.println("x większe od zera");
        } else if (x < 0) {
            System.out.println("X mniejsze od zera");
        } else {
            System.out.println("X równe zero");
        }

        System.out.println("2) Operator warunkowy:");

        int liczba =-5;
        int liczba2 = liczba < 0 ? -1:1;
        System.out.println(liczba2);

        System.out.println("3) Pętla for:");

        for(int i=0; i<5; i++){
            System.out.println("Przebirg dla for " +i);
        }

        System.out.println("4) Rozszerzona pętla for");

        int tab[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int val: tab){
            System.out.println("rozszerzona pętla for: "+val);
        }

        System.out.println("5) Pętla While");

        int i = 0;
        while (i<=4) {
            System.out.println("Przebieg dla While: " + i);
            i ++;
        }

        System.out.println("6) Pętla do...while");

        int j = 0;
        do {
            System.out.println(" Przebieg pępli do...while "+j);
        }
        while (j++ < 6);

        System.out.println("7) Instrukcja break dla pętli pojedycznych");

        i=0;
        while (true){
            System.out.println("Przebieg dla pojedynczego break: " +i);
            if (i++ >= 4) break;
        }

        System.out.println("8) Instrukcja break dla pętli zagnieżdżonych");

        for (i=0; i<3; i++){
            for (j=0; j < 3; j++){
                if (i==2) break;
                System.out.println(i + " "+ j);
            }
        }

        System.out.println("9) Instrukcja continue");

        for (i = 1; i <= 10; i++){
            if(i % 2 != 0) continue;
            System.out.println(i);
        }
    }
}
