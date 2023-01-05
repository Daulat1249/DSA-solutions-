package questions;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        /*
        palindrome numbers 131 = 131
        a number when reversed gives th same number
         */
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number to check");
        int num = in.nextInt();
        int rev = 0 , rem;
        int temp=num; // Because after the while loop temp will be
                      // zero and we need num for checking the palindrome
        while (temp>0){
             rem = temp%10;
            rev = rev*10+rem;
            temp=temp/10;
        }
        System.out.println(rev);
        if (rev == num){
            System.out.println("The number is Palindrome");
        }else{
            System.out.println("Not a palindrome number");
        }
    }
}
