import java.util.Scanner;

class AreaToRadius{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = 0;
        double area = 0;
        System.out.println("Type the Area and Enter:");
        area = sc.nextDouble();
        r = Math.sqrt(area / Math.PI); 
        System.out.println("The radius is:" + r + " unit");
    }
    
}
