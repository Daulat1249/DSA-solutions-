package foundingquestions;

import java.util.Scanner;

public class sumOF2num {
    public static void main(String[] args) {
        /*program for finding the sum of two numbers */
        Scanner in = new Scanner(System.in);
        //enter  the first number
        int num1 = in.nextInt();
        //enter the second number
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.println("The of the two numbers is "+sum);
    }
}
