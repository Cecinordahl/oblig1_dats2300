import java.util.HashSet;

public class Oblig1 {
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

        int left = 0;
        int right = a.length-1;

        for (int i = 0; i < a.length; i++) {
            while (a[left] %2 == 0) {
                left++;
            }

            while (a[right] %2 == 1) {
                right--;
            }

            if (left < right){
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
