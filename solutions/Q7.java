package questions;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter your name");
        String name = in.next();
        String lastname = in.next();
        System.out.println("Hello "+name+" "+lastname+" hope you are doing well");
    }
}
