package daulat;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = in.nextInt();
        if (num%2==0){
            System.out.println("The number is even ");
        }else {
            System.out.println("the number is odd ");
        }
    }
}
