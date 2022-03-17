import java.util.Scanner;
public class SquareOfNumbers{
    static int square(int n){
    if(n==0)
        return 0;
    else 
        return ((square(n-1)+n+n-1));
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int result=square(n);
        System.out.println("Square of "+n+" is " +result);
    }
}