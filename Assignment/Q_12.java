Write a method that returns the largest of three numbers using if statements.
  
------------------------------------------------------------------------------
  
  
package InternshipAssignment;

import java.util.Scanner;

public class Q_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Largest Number : "+largestNumber(a, b, c));

    }

    public static int largestNumber(int a, int b, int c){
        if(a > b){
            if(a > c){
                return a;
            }
            return c;
        }

        if(b>c){
            return b;
        }

        return c;

    }
}
