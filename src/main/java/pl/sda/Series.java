package pl.sda;

import java.util.Scanner;

public class Series {

    public static void main(String[] args) {

        int n = getInputNumber();
        if (checkInputNumberIsIncorrect(n)) {
            return;
        }

        printNumberSequence1(n);
        printNumberSequence2(n);
        printNumberSequence3(n);
    }

    private static int getInputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę n: ");
        return scanner.nextInt();
    }

    private static boolean checkInputNumberIsIncorrect(int n) {
        if (n < 1 || n > 20) {
            System.out.print("Niepoprawna liczba");
            return true;
        }
        return false;
    }

    private static void printNumberSequence1(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i * 2 - 1 + " ");
        }
    }

    private static void printNumberSequence2(int n) {
        System.out.println();
        for (int i = 1, k = -1, j = 1; i <= n; j*=2, k += j, i++) {
            System.out.print(k + " ");
        }
    }

    private static void printNumberSequence3(int n) {
        System.out.print("\n");

        int multipier = 1;
        System.out.print("2 ");
        for (int i = 1, result = 4; i < n;
             i++, result += 2 * multipier) {
            if (i % 3 == 0) multipier *= -1;
            System.out.print(result + " ");
        }
    }
}
