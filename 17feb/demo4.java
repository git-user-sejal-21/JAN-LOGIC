import java.util.Scanner;
public class demo4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a :");
        int a=sc.nextInt();
        String ans = (a % 2==0)? "even":"odd";
        System.out.println("number is " +ans);
    }
    
}
