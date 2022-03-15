package daulat;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number ");
        int num = in.nextInt();
        for (int i = 1; i <11 ; i++) {
            int x = num*i;
            System.out.print(num+"*"+i+"="+x+" ");
        }
    }
}
