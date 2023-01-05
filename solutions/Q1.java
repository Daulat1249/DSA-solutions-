package questions;

import java.util.Scanner;


public class Q1 {
    public static void main(String[] args) {

        //find out leap year or not
        // leap year has 366 days and last leap year was 2020
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year");
        int Yr = in.nextInt();

        if (Yr%4==0){
            System.out.println(Yr+" is a "+"leap year");
        }else {
            System.out.println("The year you entered is not a leap year");
        }
    }
}
