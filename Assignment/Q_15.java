Write a program to check whether the number is prime or not.

-------------------------------------------------------
package InternshipAssignment;

import java.util.Scanner;

public class Q_15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        System.out.println(checkPrimeNumber(n));


    }

    public static boolean checkPrimeNumber(int n){

        for(int i=2; i*i<n; i++){
            if(n%i==0 || n%(n/i)==0){
                return false;
            }
        }
        return true;

    }
    
}
