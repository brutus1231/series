package pl.sda;

import java.io.File;
import java.util.Scanner;

public class Draws {
    public static void main(String[] args) {
        int n = getInputNumber();
        if (checkInputNumberIsIncorrect(n)) {
            return;
        }
        drawX(n);
    }

    private static void drawX(int n) {

        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                if (i == j || i + j + 1 == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        }
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
}
