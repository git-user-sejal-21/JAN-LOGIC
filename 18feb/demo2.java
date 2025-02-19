import java.util.Scanner;
public class demo2 {
    public static void main(String[] args) {
        int i=1;
        // int n=5;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n=sc.nextInt();
        while(i <= 10)
        {
            System.out.println(n+"x"+i+":"+n*i);
            i++;
        }
    }
    
}
