package questions;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount in rupees:");
        float rupee = in.nextInt();
        //As of current data 1 dollar = 82 rupees 5/01/2023
        float dollar = rupee/82;
        System.out.println("You have "+dollar+"$ dollars");
    }
}
