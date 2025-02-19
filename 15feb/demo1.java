import java.util.Scanner;
public class demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        System.out.print("Enter Operation:");
        String op=sc.next();
        switch (op.charAt(0)) {
            case '+':
                    System.out.println("Addition:"+(a+b));
                 break;
            case '-':
                    System.out.println("Subtraction:"+(a-b));
                 break;
                 case '*':
                    System.out.println("Multiplication:"+(a*b));
                 break;
                 case '/':
                 if(b ==0){
                    System.out.println("Can't divide by zero");
                 }else{
                    System.out.println("Divition:"+(a/b));
                    break; 
                 }
                    
        
            
        }

        
    }
    
}
