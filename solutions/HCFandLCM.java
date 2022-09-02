package foundingquestions;

import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        /*we have a formula for HCF and LCM of two numbers
        product of two numbers = HCF X LCM
        */
        int temp1 , temp2 ,num1 , num2 , temp , lcm , hcf;
        Scanner in = new Scanner(System.in);
        System.out.print("enter first number");
        num1 = in.nextInt();
        System.out.print("enter second number");
        num2 = in.nextInt();

        temp1 = num1;
        temp2 = num2;
        while (temp2!=0){
            temp = temp2;
            temp2 = temp1%temp2;
            temp1 = temp;
        }
        hcf = temp1;
        lcm = (num1*num2)/hcf;

        System.out.println("HCF of two numbers: "+hcf);
        System.out.println("LCM of two numbers: "+lcm);

    }
}
