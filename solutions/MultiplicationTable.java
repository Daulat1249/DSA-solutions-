package foundingquestions;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number ");
        int num1 = in.nextInt();
        for (int i = 1; i <11 ; i++) {
            int multiply = num1*i;
            System.out.println(num1+"x"+i+"="+multiply);
        }
    }
}
