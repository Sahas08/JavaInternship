Prompt the user to enter two people's heights in inches.
- Each person should be classified as one of the following:
• short (under 5'3")
• medium (5'3" to 5'11")
• tall (6' or over)
- The program should end by printing which person is taller.
Height in feet and inches: 5 7
You are medium.
Height in feet and inches: 6 1
You are tall.
Person #2 is taller than person
#1.



-------------------------------------------------------------------------------------------
package InternshipAssignment;

import java.util.Scanner;

public class Q_10 {
 
    public static void main(String[] args) {
        
        heightInput();

    }

    public static void heightInput(){
        int foot1 = 0, inch1 = 0;
        int foot2 = 0, inch2 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of person 1");
        foot1 = sc.nextInt();
        inch1 = sc.nextInt();

        System.out.println("Enter the height of person 2");
        foot2 = sc.nextInt();
        inch2 = sc.nextInt();

        displayHeight(foot1, inch1);
        displayHeight(foot2, inch2);

        int height1 = (foot1 * 12) + inch1;
        int height2 = (foot2 * 12) + inch2;

        findTallerPerson(height1, height2);

    }

    public static void displayHeight(int foot, int inch){
        System.out.println("Height in feet and inches: "+foot+" "+inch);
        if(foot <=5 && inch<3)
        {
            System.out.println("You are short.");
        } else if (foot<=5 && inch<=11){
            System.out.println("You are medium.");
        } else {
            System.out.println("You are tall.");
        }
    }

    public static void findTallerPerson(int height1, int height2){

        if(height1 > height2){
            System.out.println("Person #1 is taller than person #2.");
        } else if(height1 == height2) {
            System.out.println("Person #1 and Person #2 are of equal heights.");
        } else {
            System.out.println("Person #2 is taller than person #1.");
        }

    }

}
