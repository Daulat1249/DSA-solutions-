package daulat;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if (num1>num2){
            System.out.println(num1+" is larger than "+num2);
        }else {
            System.out.println(num2+" is larger than "+num1);
        }
    }
}
