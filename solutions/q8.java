package daulat;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the value of P: ");
        int P = in.nextInt();
        System.out.print("enter the value of T: ");
        int T = in.nextInt();
        System.out.print("enter the value of R: ");
        int R = in.nextInt();

        float simIN;
        simIN = (P * R * T)/100;
        System.out.println("Simple interest is : "+simIN);
    }
}
