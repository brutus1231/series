package pl.sda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SumFileNumbers {

    public static final String FILE_PATH = "in.txt";

    public static void main(String[] args)  {
        calculate();
    }

    private static void calculate() {

        int sum = 0;
        try (Scanner scanner = new Scanner(new File(FILE_PATH))) {
            while (scanner.hasNextInt()) {
                int digit = scanner.nextInt();
                sum += digit;
                System.out.println(sum);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Exception with reading file " + ex);
        }

    }
}
