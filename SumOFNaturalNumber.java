// sum of natural number
import java.util.*;
public class SumOFNaturalNumber {
    int addition(int num){
        if(num==0)
            return 0;
        else
            return (num+addition(num-1));
        }
        
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            SumOFNaturalNumber sum = new SumOFNaturalNumber();
    
            System.out.print("Enter a number to calculate sum of natural number:");
            int num = s.nextInt();
            int result = sum.addition(num);
            System.out.println(""+result);
    
        }
}
