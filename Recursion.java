public class Recursion{
    
    static int sum = 0, factorial = 1;
    static int exponent = 1;

    public static int sum(int n){
        if(n==1){
            sum+=n;
            return sum;
        }
        else{
            sum+=n;
            return sum(n-1);
        }
    }

    public static int factorial(int n){
        if(n==1){
            return factorial;
        }
        else{
            factorial*=n;
            return factorial(n-1);
        }
    }

    // 5 * 5 * 5
    public static int exponentiation(int n, int p){
        if(p==1){
           return exponent*n;
        }
        else{
            exponent*=n;
            return exponentiation(n, p-1);
        }

    }

    public static void main(String[] args) {
        System.out.println("The sum is "+sum(5));
        System.out.println("The factorial is "+factorial(5));
        System.out.println("The exponentiation is "+exponentiation(5,3));
    }
}
