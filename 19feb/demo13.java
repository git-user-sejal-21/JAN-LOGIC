import java.util.Scanner;
public class demo13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("To Unlock Enter Password :");
        int pass=sc.nextInt();
        int count =1;
        while(pass !=1234)
        {
            count++;
            if(count ==5){
                System.out.println("Your Device is locked for 1 day");
                break;
            }
            System.out.println("\n Wrong Passkey:"+pass);
            System.out.println("Please try again :");
            pass=sc.nextInt();
        }
        if(count<5)
        {
            System.out.println("Device unlocked");
        }
    }
    
}
