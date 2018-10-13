package pl.sda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

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
        } catch (FileNotFoundException ex) {
            System.out.println("Exception with reading file " + ex);
        }
    }

    private static void checkDistinctCount(int[] cardinalities) {
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            if (cardinalities[i] != 0) {
                result++;
            }
        }
        System.out.println("Wystąpiło " + result + " różnych liczb ");
    }


}
