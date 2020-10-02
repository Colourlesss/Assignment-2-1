import java.util.Scanner;

public class DistFormula
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x1,x2,y1,y2;
        System.out.println("Enter the coordinates of the first point in the form x y");
        x1=sc.nextDouble();
        y1=sc.nextDouble();
        System.out.println("Enter the coordinates of the second point in the form x y");
        x2=sc.nextDouble();
        y2=sc.nextDouble();
        double dist = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        System.out.println("The distance between the two points is " + dist);
    }
}
