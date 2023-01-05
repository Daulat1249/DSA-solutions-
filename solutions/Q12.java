package questions;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        // fibonacci series 0,1,1,2,5,8,13,21,.....
        Scanner in = new Scanner(System.in);
        System.out.println("enter the Nth term of the series: ");
        int n=in.nextInt();
        int a=0, b=1;
        for (int i = 2; i <=n; i++) {
            int temp = b;
            b=a+b;
            a=temp;
            System.out.println(b);
        }
    }
}
