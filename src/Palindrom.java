public class Palindrom {

    public static void main(String[] args) {

        String sprawdzanyPalindrom = "fafsfsdfsew";
        char[] slowo = sprawdzanyPalindrom.toCharArray();

        boolean istPalindrome = false;

        int x = 0;
        int y = slowo.length - 1;

        while (x < y) {
            if (slowo[x] != slowo[y]) {
                istPalindrome = false;
            } else {
                istPalindrome = true;
            }
            ++x;
            --y;
        }

        if (istPalindrome==true){
            System.out.println("Słowo jest palidromem");
        }else {
            System.out.println("Słowo nie jest palidromem");
        }
    }
}
