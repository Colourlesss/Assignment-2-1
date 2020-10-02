import java.util.Scanner;

public class MortgageCalculator
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle:");
        double p = sc.nextDouble();
        System.out.println("Enter the Rate:");
        double r = sc.nextDouble();
        System.out.println("Enter the Time Past:");
        double t = sc.nextDouble();
        double a = p*Math.pow(1+r,t);
        System.out.println("The amount after " + t + " years are " + a + " dollars");
    }
}
