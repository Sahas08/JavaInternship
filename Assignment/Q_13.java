Write a method that asks the user for 3 numbers and returns true if all the numbers are distinct.
  
--------------------------------------------------------------------------------------------------

package InternshipAssignment;

import java.util.Scanner;

public class Q_13 {
    
    public static void main(String[] args) {
        System.out.println(distinctNumber());
    }

    public static boolean distinctNumber(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a!=b && b!=c && c!=a){
            return true;
        } else {
            return false;
        }

    }
}
