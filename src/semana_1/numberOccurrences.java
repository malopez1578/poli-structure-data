package semana_1;

import java.util.Scanner;

public class numberOccurrences {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String valueArr;
        String valueSearch;
        String[] arrNumbers;

        System.out.println("Write a list of numbers separated by commas");
            valueArr = keyboard.next();
            arrNumbers =  valueArr.split(",", 0);

        System.out.println("Write a number to find how many times it is in the list");
            valueSearch = keyboard.next();

        int numberOcurrences = searchOccurrenceNumber(arrNumbers, valueSearch);

        System.out.println("The number "+ valueSearch +" is found "+ numberOcurrences +" times in the array " + valueArr);
    }
    public static int searchOccurrenceNumber(String[] arrBase, String numberSearch){
        int i;
        int cantOccurrences = 0;
        for(in ti=0 ; i < arrBase.length ; i++){
            if (arrBase[i].equals(numberSearch)){
                cantOccurrences = cantOccurrences +1;
            }
        }
        return cantOccurrences;
    }
}
