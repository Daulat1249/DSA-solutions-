package questions;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the Numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.println("The sum of the 2 numbers is: "+sum);
    }
}
