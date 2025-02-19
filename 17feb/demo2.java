import java.util.Scanner;
public class demo2 {
    public static void main(String[] args) {
        Scanner sc=new  Scanner (System.in);
        System.out.println("Enter ssc Marks:");
        double ssc= sc.nextDouble();
        if(ssc>=35)
        {
            System.out.println("Enter Hsc marks:");
            Double Hsc=sc.nextDouble();
        if(Hsc >= 35){
            System.out.println("Eligible for placement!");
        }else{
            System.out.println("Not eligible");
        }

        }else{
            System.out.println("not eligible");
        }
    }
    
}
