package questions;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        //Check if the number is Even or odd
        //If num%2==0 it is even else it is odd
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int num = in.nextInt();
        if (num%2==0){
            System.out.println(num+" is even ");
        }else {
            System.out.println(num+" is odd");
        }
    }
}
