package questions;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        /*Simple interest
        SI = P*R*T
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principal");
        int P = in.nextInt();
        System.out.print("Enter Rate");
        int R = in.nextInt();
        System.out.print("Enter Time");
        int T = in.nextInt();
        int SI = P*R*T;
        System.out.println("Simple Interset: "+SI);
    }
}
