Use for loop for printing these patterns.
  
#================#
|      <><>      |
|    <>....<>    |
|  <>........<>  |
|<>............<>|
|<>............<>|
|  <>........<>  |
|    <>....<>    |
|      <><>      |
#================#


---------------------------------------------------------------------
package InternshipAssignment;

public class Q_8 {

    public static void main(String[] args) {
        topAndBottom();
        upperHalfDiamond();
        lowerHalfDiamond();
        topAndBottom();
    }

    public static void topAndBottom() {
        System.out.print("#");
        for (int i = 1; i <= 16; i++) {
            System.out.print("=");
        }
        System.out.print("#");
        System.out.println();
    }

    public static void upperHalfDiamond() {
        String s = "<>";

        for (int line = 0; line < 4; line++) {
            System.out.print("|");
            for (int space = 6 - (line * 2); space > 0; space--) {
                System.out.print(" ");
            }
            System.out.print(s);

            for (int dot = 1; dot <= 4 * line; dot++) {
                System.out.print(".");
            }

            System.out.print(s);

            for (int space = 6 - (line * 2); space > 0; space--) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();

        }
    }

    public static void lowerHalfDiamond() {

        String s = "<>";

        for (int line = 0; line <= 3; line++) {
            System.out.print("|");
            for (int space = 1; space <= line * 2; space++) {
                System.out.print(" ");
            }

            System.out.print(s);

            for (int dot = 1; dot <= 12 - (4 * line); dot++) {
                System.out.print(".");
            }
            System.out.print(s);

            for (int space = 1; space <= line * 2; space++) {
                System.out.print(" ");
            }

            System.out.print("|");
            System.out.println();
        }
    }

}
/*
 * 
 * #================# , 16 =
 * | <><> | - 6 (0)
 * | <>....<> - 4 (4)
 * | <>........<> - 2 (8)
 * |<>............<> - 0 (12)
 * |<>............<> - 0
 * | <>........<> - 2
 * |
 * |
 * #================#
 * 
 */
