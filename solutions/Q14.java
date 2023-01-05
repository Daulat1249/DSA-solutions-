package questions;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        /*ARMSTRONG NUMBERS
        n = 153
        then 1^3+5^3+3^3 = 1+125+27 = 153 3=p(power)
         */
        //CONDITION--ONLY FOUR DIGITS NUMBERS AS INPUT
        Scanner in = new Scanner(System.in);
        System.out.print("enter the integer for checking: ");
        int num = in.nextInt();
        int arm = 0;
        int rem, pow=4;
        int temp = num;
        while (temp > 0) {
            rem=temp%10;
                arm = (int) (arm + Math.pow(rem,pow));
            temp=temp/10;
        }
        if (arm == num){
            System.out.println("Armstrong Number");
        }else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
