public class SortowaniePrzezZliczanie {

    public int[] sortuj(int[] tab){

        int max = -1;
        for(int i=0; i<tab.length; i++){
            if (tab[1]>max){
                max = tab[1];
            }
        }
        int[] tabDoZliczen = new int[max+1];
        for (int i=0; i <tab.length; i++){
            tabDoZliczen[tab[i]]++;
        }
        int licznik = 0;
        for(int i=0; i<tabDoZliczen.length; i++){
            while (tabDoZliczen[i]>0){
            tab[licznik] = i;
            tabDoZliczen[i]--;
            licznik++;
            }
        }
        return tabDoZliczen;
    }
}
