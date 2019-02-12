package Recruitment_tasks;

import java.util.Arrays;
import java.util.stream.IntStream;


public class AlmostIncreasingSequence {
    public static void main(String[] args) {
        int[] array = {1,3,2,1};
        AlmostIncreasingSequence IncreasingSequence = new AlmostIncreasingSequence();
        boolean wynik = IncreasingSequence.almostIncreasingSequence(array);
        System.out.println(wynik);
    }

    int firstBadSequence(int sequenceInt[]){
        int result = -1;
        loop:
        for(int i = 0; i< sequenceInt.length-1; i++){
            if(sequenceInt[i]>=sequenceInt[i+1]){
                result = i;
                break loop;
            }
        }
        return result;
    }

    int[] deleteOneNumberFromArray(int[] array, int k){
        int[] firstArray = new int[k];
        int[] secondArray = new int[array.length - (k+1)];
        for (int i=0; i<firstArray.length; i++){
            firstArray[i]=array[i];
        }
        for (int j=0; j<secondArray.length; j++){
            secondArray[j]=array[k+1+j];
        }
        int[] fullArray= new int[array.length-1];
        fullArray = IntStream.concat(Arrays.stream(firstArray), Arrays.stream(secondArray)).toArray();
        return fullArray;
    }

    boolean almostIncreasingSequence(int[] sequence) {
        int j = firstBadSequence(sequence);
        if (j==-1){
            return true;
        }else if (firstBadSequence(deleteOneNumberFromArray(sequence, j))==-1){
            return true;
        }else if (firstBadSequence(deleteOneNumberFromArray(sequence, (j+1)))==-1){
            return true;
        }else {
            return false;
        }
    }
}

/*
boolean almostIncreasingSequence(int[] sequence) {
    boolean flag=true;
    int seq1=0;
    int seq2=0;
    for(int i=0;i<sequence.length-1;i++){
        if(sequence[i]>=sequence[i+1]) seq1++;
    }
    for(int k=0;k<sequence.length-2;k++){
        if(sequence[k]>=sequence[k+2]) seq2++;
    }
    if(seq1+seq2>2) flag=false;
    return flag;
}
 */