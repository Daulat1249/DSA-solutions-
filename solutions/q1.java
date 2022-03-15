package daulat;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.print("enter the year ");
        int y  = in.nextInt();
        System.out.println("enter the number of days in the year ");
        int d = in.nextInt();
        if (d==366){
            System.out.println("tne year is a leap year");
        }else{
            System.out.println("not a leap year");
        }
    }
}
