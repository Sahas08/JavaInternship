Write a program to count factors of a number.
	


---------------------------------------------
	
import java.util.*;

public class CountFactors {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(countFactors(n));

        sc.close();

    }

    static int countFactors(int n)
    {
        int count = 0;

        for(int i=1; i*i<=n; i++)
        {
            if(n%i==0)
            {
                if(n!=i)
                {
                    count+=2;
                }

                else 

                {
                    count+=1;
                }
            }
        }

        return count;
    }

}
  
