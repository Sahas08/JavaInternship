Question

Get Strings from the command line, present in the console a
vertical bar chart of the frequency of each letter in the input.

Treat small and capital letters the same -- as capital

Ignore any char that is not an English letter

Example

For the following input:
Hey how are you?

we expect the following chart:

A	#
E	##
H	##
O	##
R	#
Y	##
U	#
W	#

---------------------------------------------------------------------------

public class Test3 {

    public static void main(String args[]) {
        String s = "";
        for (String i : args) {
            s += i;
        }
        s = s.toUpperCase();

        int count = 0;

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ch) {
                    count++;
                }
            }

            if(count==0)
                continue;

            System.out.print(ch + "       ");
            for (int j = 1; j <= count; j++) {
                System.out.print("#");
            }
            System.out.println("");
            count = 0;
        }
    }
}
