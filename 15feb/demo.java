import java.util.Scanner;
public class demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=sc.nextInt();
        switch(num){
            case 1:
                  System.out.println("Monday");
                  break;
            case 2:
                  System.out.println("Tuesday");
                  break;
            case 3:
                  System.out.println(" Wedenesday");
                  break;
            case 4:
                  System.out.println("Thursday");
                  break;
            case 5:
                  System.out.println("Friday");
                  break;
            case 6:
                  System.out.println("Saturday");
                  break;
            default:
                  System.out.println("Invalid input");
                  
                  
                  

        }
    }
}