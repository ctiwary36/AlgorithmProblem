package com.datastuctureandalgorithm.findyournumber;
import java.util.Scanner;
public class FindYourNumber {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int low = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        int high = (int) Math.pow(2, n);
        FindYourNumber findYourNumber = new FindYourNumber();
        findYourNumber.guessANum(low, high);

    }
    public void guessANum(int low, int high) {

        int mid = (high + low) / 2;

        if (high <= low) {
            System.out.println("\n Is your number is even number :");
            char ch = getString().charAt(0);
            if (ch == 'Y' || ch == 'y') {

                System.out.println("\n Your number should be: " + high);

            } else {
                System.out.println("\n Your number should be: " + (low + 1));
            }
        } else {
            System.out.println("\n Is you number is between " + low + "-" + mid + " : ");
            char ch = getString().charAt(0);

            if (ch == 'y' || ch == 'Y') {
                guessANum(low, mid - 1);
            } else {
                guessANum(mid + 1, high);
            }
        }



    }
    public String getString() {
        return sc.next();
    }

}