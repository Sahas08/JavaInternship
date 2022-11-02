----------------------------------------------------
  
Write a Java program to print the following patters.
  
  -----
 /     \
/       \
\       /
 \     /
  -----




 \        /
  \      /
   ------
+----------+




  ------
 /      \
/        \
|  STOP  |
\        /
 \      /
  ------




  -------
 /       \
/         \
+---------+

----------------------------------------------------

package InternshipAssignment;

public class Q_7
{
    public static void main(String[] args) {
        Figure1();
        System.out.println("\n\n\n");
        Figure2();
        System.out.println("\n\n\n");
        Figure3();
        System.out.println("\n\n\n");
        Figure4();
        
    }

    public static void Figure1()
    {
        System.out.println("  -----"); 
        System.out.println(" /     \\");
        System.out.println("/       \\");
        System.out.println("\\       /");
        System.out.println(" \\     /");
        System.out.println("  -----");
    }

    public static void Figure2()
    {
        System.out.println(" \\        /");
        System.out.println("  \\      /");
        System.out.println("   ------");
        System.out.println("+----------+");
    }

    public static void Figure3()
    {
        System.out.println("  ------");
        System.out.println(" /      \\");
        System.out.println("/        \\");
        System.out.println("|  STOP  |");
        System.out.println("\\        /");
        System.out.println(" \\      /");
        System.out.println("  ------");
    }

    public static void Figure4()
    {
        System.out.println("  -------");
        System.out.println(" /       \\");  
        System.out.println("/         \\");
        System.out.println("+---------+");
    }


}
