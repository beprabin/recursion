//factorial using recursion
import java.util.*;

public class Factorial{
        int fact(int num){
    if(num==0)
        return 1;
    else
        return (num*fact(num-1));
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Factorial factorial = new Factorial();

        System.out.print("Enter a number to calculate factorial:");
        int num = s.nextInt();
        int result = factorial.fact(num);
        System.out.println("Factorial of "+num+" is "+result);

    }
}