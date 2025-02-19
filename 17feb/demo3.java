import java.util.Scanner;
public class demo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Username");
        String username = sc.next();
        System.out.println("Enter a Password");
        String password=sc.next();
        if("admin".equals(username)){
            if("1234".equals(password)){
                System.out.println("Login Successfully");
            }
            else{
                System.out.println("incorrect password");
            }

        }else{
            System.out.println("Invalid username");
        }

    }
    
}
