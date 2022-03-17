import java.util.Scanner;
public class XtoPowerY {
    public static int power(int base, int exp){
        if(exp<1)
            return 1;
        else
            return (base* power(base,exp-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a base number:");
        int base=sc.nextInt();
        System.out.print("Enter a exponent:");
        int exp=sc.nextInt();
        System.out.println(+base+" to the power "+exp+" is " +power(base, exp));
    }
}
