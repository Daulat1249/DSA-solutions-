package questions;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        //Area of circle = pi*r*r
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int r = in.nextInt();
        float area = (float) (3.14*Math.pow(r,2));
        System.out.println("Area of the circle is: "+area);
    }
}
