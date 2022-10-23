Question -

Get integers from the command line (well, you will get Strings but
should find a way to turn them to ints), calculate the average then
print to screen all the numbers and the average.
  
 ---------------------------------------------------------------------
  
 public class Test2 {
    
    public static void main(String args[])
    {
        int n = 0;
        double avg = 0;
        double sum = 0;

        for(String i : args)
        {
            sum = sum + Integer.parseInt(i);
        }

        avg = sum / args.length;

        for(String i : args)
        {
            System.out.println(i);
        }
        System.out.println("Average = "+avg);
    }

}
