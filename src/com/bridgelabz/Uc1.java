package com.bridgelabz;

public class Uc1 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=2;j<=i;j++){
                if (i>=2 && j<=i-1){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
