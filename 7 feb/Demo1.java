import java.util.Scanner;
public class Demo1 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number:");
        int n= sc.nextInt();
        System.out.println("n: " + n);
        System.out.println("n²: " + n*n);
        System.out.println("n² + n²: " +( (n*n) + (n*n)));
        System.out.println("n³: " + n*n*n);
        System.out.println("n⁴: " + n*n*n*n);
        System.out.println("n⁵: " + n*n*n*n*n);

        
    }
    
}
