Write a method that prints out if it is good weather to go for a bike ride. The
weather is good if the temperature is between 40 degrees and 100 degrees inclusive,
unless it is raining(if raining means not good for ride.)
  
-----------------------------------------------------------------------------------

package InternshipAssignment;

import java.util.Scanner;

public class Q_11 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature");

        double temp = sc.nextDouble();

        System.out.println("Type Yes if raining/ No if it isn't raining");
        String ch = sc.next();

        if(ch.equals("Yes")==false && ch.equals("No")==false)
        {
            System.out.println("Invalid input");
            System.exit(0);
        }

        checkWeather(temp, ch);

    }

    public static void checkWeather(double temp, String ch){

        if(ch == "No"){
            System.out.println("Not a good weather for bike riding");
        } else {
            if(temp>=40 && temp<=100){
                System.out.println("Good weather to go for bike riding");
            } else {
                System.out.println("Not a good weather for bike riding");
            }
        }

    }
}
