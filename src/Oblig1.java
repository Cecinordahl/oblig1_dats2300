import java.util.Arrays;
import java.util.HashSet;
import java.util.NoSuchElementException;

public class Oblig1 {

    public static int maks(int[] a) {
        /**
         * Når blir det flest ombyttinger?
         * Når blir det færrest?
         * Hvor mange blir det i gjennomsnitt?
         */

        if (a.length == 0) {
            throw new NoSuchElementException("The array is empty");
        }

        int highestNumber = 0;
        for (int position = 0; position < a.length; position++) {
            if (a[position] == a[a.length-1]){
                return a[a.length-1];
            }
            if (a[position] > a[position+1]) {
                highestNumber = a[position+1];
                a[position] = a[position+1];
                a[position+1] = highestNumber;
            }
        }

        return highestNumber;
    }

    public static int antallUlikeSortert(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                throw new IllegalStateException("This array is not in ascending order");
            }
        }
        return fetchUniqueNumbers(a).size();
    }


    public static int antallUlikeUsortert(int[] a) {
        return fetchUniqueNumbers(a).size();
    }

    public  static  void  delsortering(int[] a) {
        // TODO sorter

        //Arrays.sort(a);

        int left = 0;
        int right = a.length-1;

        for (int i = 0; i < a.length; i++) {
            while (a[left] %2 == 0) {
                left++;
            }

            while (a[right] %2 == 1) {
                right--;
            }

            if (left > right){
                int temporary = a[left];
                a[left] = a[right];
                a[right] = temporary;
            }
        }
    }

    /* Helper methods */

    private static HashSet<Integer> fetchUniqueNumbers(int[] a) {
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for (int number : a) {
            uniqueNumbers.add(number);
        }
        return uniqueNumbers;
    }
}
