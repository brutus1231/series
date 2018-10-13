package pl.sda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class DistinctNumber {

    public static final String FILE_PATH = "in2.txt";

    public static void main(String[] args) {
        calculate();
    }

    private static void calculate() {

        int[] cardinalities = new int[11];
        Arrays.fill(cardinalities, 0);
        try (Scanner scanner = new Scanner(new File(FILE_PATH))) {
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                cardinalities[number]++;
            }

            checkDistinctCount(cardinalities);
            checkMostFrequentlyNumber(cardinalities);
        } catch (FileNotFoundException ex) {
            System.out.println("Exception with reading file " + ex);
        }
    }

    private static void checkMostFrequentlyNumber(int[] cardinalities) {
        int maxCardinality = 0;
        int result = 0;
        for (int i = 1; i < cardinalities.length; i++) {
            if (cardinalities[i] > maxCardinality) {
                result = i;
                maxCardinality = cardinalities[i];
            }
        }
        System.out.println("Najczęściej wystąpiła liczba " + result);

    }

    private static void checkDistinctCount(int[] cardinalities) {
        int result = 0;
        for (int i = 1; i < cardinalities.length; i++) {
            if (cardinalities[i] != 0) {
                result++;
            }
        }
        System.out.println("Wystąpiło " + result + " różnych liczb ");


/*      //druga opcja, rozwiązanie z wykorzystaniem stream-u
        long res2 = IntStream.range(1, cardinalities.length)
                .filter(t -> cardinalities[t] != 0).count();
        System.out.println("Wystąpiło " + res2 + " różnych liczb ");*/

    }


}
