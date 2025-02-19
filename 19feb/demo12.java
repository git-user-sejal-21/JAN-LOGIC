import java.util.Scanner;
public class demo12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a even number:");
        int n=sc.nextInt();
        while(n % 2==0)
        {
            System.out.println("Number:" +n);
            System.out.println("Enter a even number  :");
            n=sc.nextInt();
        }
        System.out.println("Oops! It's not an even number");
        
    }
    
}
