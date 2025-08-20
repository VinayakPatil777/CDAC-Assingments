
// Q1. Write a program to input n numbers on command line argument and calculate maximum of them.

import java.util.Scanner;
public class Q1 {   
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Biggest number is: " + max);
        sc.close();
    }
}


