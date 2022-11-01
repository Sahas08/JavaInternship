package InternshipAssignment;

import java.util.Scanner;

public class Q_1 {
   static double ans;
   static double x_1, x_2;
   static double y_1, y_2; 

   public static void main(String[] args) {
        takeInput();
        calcuate();
   }

   

   public static void takeInput()
   {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 x values");
        x_1 = sc.nextDouble();
        x_2 = sc.nextDouble();

        System.out.println("Enter 2 y values");
        y_1 = sc.nextDouble();
        y_2 = sc.nextDouble();
   }

   public static void calcuate()
   {
        ans = Math.sqrt((Math.pow ((x_2-x_1) , 2)) + (Math.pow ((y_2-y_1) , 2)));

        System.out.println("The answer is "+ans);
   }

}


