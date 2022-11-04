Write a program to check whether the number is a perfect number or not.

--------------------------------------------------------------------
package InternshipAssignment;

import java.util.Scanner;

public class Q_14 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        int n = sc.nextInt();

        System.out.println(checkPerfectNumber(n));

    }

    public static boolean checkPerfectNumber(int n){

        int sum = 1;

        for(int i = 2; i*i < n; i++){
            if(n%i==0){
                sum += i;
                sum += n/i;
            }
        }

        if(sum==n){
            return true;
        } else {
            return false;
        }

    }

}

/*
 n = 10
 1 * 10
2 * 5
 */
