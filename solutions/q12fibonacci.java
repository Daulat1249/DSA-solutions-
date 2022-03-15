package daulat;

import java.util.Scanner;

public class q12fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the Nth term of the fibonacci");
        int n = in.nextInt();
        int n1=0,n2=1,n3 ;
        for (int i = 2; i < n + 1; i++) {
                n3 = n1+n2;
                System.out.println(n3);
                n1=n2;
                n2=n3;
            }

    }
}
