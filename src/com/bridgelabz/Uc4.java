package com.bridgelabz;

import java.util.Scanner;

public class Uc4 {
    public static void main(String[] args) {

            int currentRow = 1;
            int counter = 1;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number");
            int rows = scanner.nextInt();
            System.out.println("Printing the pattern");
            for (int i = 1; i <= rows; i++) {
                if (i % 2 == 0) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(counter + " ");
                        counter++;
                    }
                } else {
                    int reverse = currentRow + counter - 1;
                    for (int j = 0; j < i; j++) {
                        System.out.print(reverse-- + " ");
                        counter++;
                    }
                }
                System.out.println();
                currentRow++;
            }
        }
    }
