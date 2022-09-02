package foundingquestions;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        /* A leap year contains 366 days that is february has
        29 days and last five leap years were 2020 2016 2012 2008 i.e
        multiple of 4
         */
        Scanner in = new Scanner(System.in);
        System.out.print("enter your year");
        int YEAR = in.nextInt();
        if (YEAR%4==0){
            System.out.println("the year is a leap year");
        }else{
            System.out.println("the year you entered is not a leap year");
        }
    }
}
