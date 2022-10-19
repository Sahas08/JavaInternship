Question - 

Get strings from the command line and print to screen only those
which contain the word “Java” (with a capital ‘J’).

------------------------------------------------------------------------

public class Test1 {
    
    public static void main(String[] args)
    {
        for(String s : args)
        {
            if(s.contains("Java"))
            {
                System.out.println(s);
            }
        }
    }

}
