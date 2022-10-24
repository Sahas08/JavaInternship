This exercise is called the Rectangles game.

Get from the command line the coordinates of two rectangles.
The "winning rectangle" is set according to these rules:
• If a rectangle is contained (even partially) in the other, the contained (=inner) rectangle wins
If no one contains the other, the bigger by both area and perimeter wins
If no one is bigger by both area and perimeter, we have a tie
Example
Rectangle A: 1 1 10 10 (which means: ×1=1, y1=1, ×2=10, 2=10)
Rectangle B: 5 5 10 10 (which means: ×1=5, y1=5, ×2=10, 2=10)
The winner is Rectangle B (contained in A!)

----------------------------------------------------------------------------------------------------------


import java.lang.Math;

public class Test4 {

    public static void main(String[] args)
    {
        int x1_a = Integer.parseInt(args[0]);
        int y1_a = Integer.parseInt(args[1]);
        int x2_a = Integer.parseInt(args[2]);
        int y2_a = Integer.parseInt(args[3]);

        int x1_b = Integer.parseInt(args[4]);
        int y1_b = Integer.parseInt(args[5]);
        int x2_b = Integer.parseInt(args[6]);
        int y2_b = Integer.parseInt(args[7]);

        double area1 = (x2_a - x1_a) * (y2_a - y1_a);
        double area2 = (x2_b - x1_b) * (y2_b - y1_b);

        double perimeter1 = 2 * ((x2_a - x1_a)+(y2_a - y1_a));
        double perimeter2 = 2 * ((x2_b - x1_b)+(y2_b - y1_b));

        int diff = (Math.min(x1_b,x2_b) - Math.max(x1_a,x2_a));

        
        if(diff >= 0)
        {
            if((area1 > area2) && (perimeter1 > perimeter2))
            {
                System.out.println("The winner is Rectangle A");
            } else if ((area2 > area1) && (perimeter2 > perimeter1))
                 {
                    System.out.println("The winner is Rectangle B");
                 } else {
                    System.out.println("Tie");
                 }

        } else {
            if(area1 < area2)
            {
                System.out.println("The winner is Rectangle A");
            } else {
                System.out.println("The winner is Rectangle B");
            }
        }

    }
    
}



