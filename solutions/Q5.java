package questions;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        char ch;
        do {
            System.out.print("Please enter the integer");
            int num = in.nextInt();
            sum=sum+num;
            System.out.print("enter x to stop or any other to continue");
            ch = in.next().trim().charAt(0);
        }while ( ch!='x');
        System.out.println(sum);
    }
}
