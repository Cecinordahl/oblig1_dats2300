// import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

class Oblig1Test {
    // TODO Remove main method and 'public static' on Tests

    public static void main(String[] args) {
        // Oblig1Test.antallUlikeSortert();
        // Oblig1Test.antallUlikeUsortert();

        Oblig1Test.delsortering();
    }
    // @Test
    public static void antallUlikeSortert() {
        // TODO consider parameterized test
        // test om den returnerer riktig antall forskjellige verdier
        int[] arrayListAscending = new int[]{
                3,  3,  4,  5,  5,  6,  7,  7,  7, 8
        };
        int result = Oblig1.antallUlikeSortert(arrayListAscending);

        int[] arrayListNotAscending = new int[]{
                3,  7,  4,  5,  5,  6,  7,  7,  7, 8
        };
        int resultNotAscending = Oblig1.antallUlikeSortert(arrayListNotAscending);

        System.out.println("sortert = " + resultNotAscending);
    }

    // @Test
    public static void antallUlikeUsortert() {
        // test om den er sortert stigende el at exception blir kastet

        // test om den returnerer riktig antall forskjellige verdier
        int[] arrayList = new int[]{
                3,  3,  4,  5,  5,  6,  7,  7,  7, 8
        };
        int result = Oblig1.antallUlikeUsortert(arrayList);

        System.out.println(result);
        // test med tom array at 0 blir returnert
    }
    // @Test
    public static void delsortering() {
        int[] a = {6,10,9,4,1,3,8,5,2,7};
        Oblig1.delsortering(a);
        System.out.println(Arrays.toString(a));

        // Utskrift: [1, 3, 5, 7, 9, 2, 4, 6, 8, 10]
    }
}