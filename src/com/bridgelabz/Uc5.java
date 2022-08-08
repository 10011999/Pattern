package com.bridgelabz;

import java.util.Scanner;

public class Uc5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the rows you want");
        int rows=sc.nextInt();
        System.out.println(" ");
        int i,j,k,l=1;
        for(i=1; i<=rows; i++ ){

            for(j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for(k=1; k<=i; k++,l++){
                System.out.print(l+" ");
            }
            System.out.println(" ");

        }
    }
    }

