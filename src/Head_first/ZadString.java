package Head_first;

public class ZadString {
    public static void main(String[] args) {
        int iloscButelek = 10;
        String slowo = "bottles";
        while (iloscButelek >0){
            if (iloscButelek==1){
                slowo = "bottle";
            }
            System.out.println(iloscButelek+" "+slowo+" of beer on the wall");
            System.out.println(iloscButelek+" "+slowo+" of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            iloscButelek = iloscButelek -1;
            if (iloscButelek>1){
                System.out.println(iloscButelek+" "+slowo+" of beer on the wall");
            } else if (iloscButelek==1){
                System.out.println("1 bottle of beer on the wall");
            }
            else {
                System.out.println("No more bottles of beer on the wall");
            }
        }
    }
}
