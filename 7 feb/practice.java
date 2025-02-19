import java.util.Scanner;
public class practice {
    public static void main(String[] args){
        System.out.println("3 > 4 && 6 < 9 && 5==5:-" +(3 > 4 && 6 < 9 && 5 == 5));
        System.out.println("3 > 4 || 6 < 9 || 5==5:-" +(3 > 4 || 6 < 9 || 5 == 5));
        System.out.println("!3 > 4 || 6 < 9 || 5==5:-" +!(3 > 4 || 6 < 9 || 5 == 5));
        Scanner scan= new Scanner (System.in);
    
        System.out.println("Enter the value of a:" );
        int a=scan.nextInt();
        System.out.println("a+a:-" +(a+a));
        System.out.println("a-a:-" +(a-a));
        System.out.println("a*a:-" +(a*a));
        
        System.out.println("a%a:-" +(a%a));
        System.out.println("a/a:-" +(a/a));

    }
    
}
