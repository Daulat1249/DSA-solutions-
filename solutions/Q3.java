package questions;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        multiplication table
        2*1=2
        2*2=4
        2*3=6.....
        therefore we use for loop
        */
        System.out.println("Enter the integer: ");
        int n = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            int num1 = n * i;
            System.out.println(n + "*" + i + "=" + num1);
        }
    }
}
