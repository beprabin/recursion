import java.util.Scanner;

//fibonacci series using recursion in java
public class FibonacciSeries{
    static int fib(int n){
        //base case
        if(n==0){
            return 0;
        }
        else if(n==1)
            return 1;
        //recursive case
        else{
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = scan.nextInt();
        System.out.println("Fibonacci series:");
        for(int i=0;i<n;i++){
            System.out.println(fib(i));
    }
    }

} 
