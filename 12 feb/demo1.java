import java.util.Scanner;
public class demo1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the num:(1-7):-");
        // int num=sc.nextInt();
        // if(num==1)
        // {
        //     System.out.println("Monday");
        // }
        // else if(num==2)
        // {
        //     System.out.println("Tuesday");
        // }
        // else if(num==3)
        // {
        //     System.out.println("wednesday");
        // }
        // else if(num==4)
        // {
        //     System.out.println("Thursday");
        // }
        // else if(num==5)
        // {
        //     System.out.println("friday");
        // }
        // else if(num==6)
        // {
        //     System.out.println("saturday");
        // }
        // else if(num==7)
        // {
        //     System.out.println("sunday");
        // }
        // else 
        // {
        //     System.out.println("invalid input");
        // }


        // System.out.println("Enter a Yearly Income");
        // double annualIncome=sc.nextDouble();
        // if(annualIncome < 500000){
        //     System.out.println("No tax");
        // }else if(annualIncome >= 500000 && annualIncome < 100000){
        //     double tax=(annualIncome)*0.02;
        //     System.out.println("Tax amount:" +tax);
        // }else if (annualIncome >= 100000 && annualIncome <2000000){
        //     double tax=(annualIncome)*0.05;
        //     System.out.println("Tax amount:" +tax);
        // }else{
        //     double tax=(annualIncome)*0.07;
        //     System.out.println("Tax amount:" +tax);
        // }
        

        System.out.print("Enter x:");
        int x=sc.nextInt();
        System.out.print("Enter Y:");
        int y=sc.nextInt();
        if(x > 0 && y > 0)
        {
            System.out.println("The points lie in the first quarant");
        }
        else if(x < 0 && y > 0)
        {
            System.out.println("The points lie in the second quarant");
        }
        else if(x < 0 && y < 0)
        {
            System.out.println("The points lie in the Third quarant");
        }
         else if(x > 0 && y < 0)
        {
            System.out.println("The points lie in the fourth quarant");
        }
        else if(x == 0 && y == 0)
        {
            System.out.println("The points lie in the origin");
        }
         else if(x == 0 )
        {
            System.out.println("The points lie in the  y axis");
        }
        else if( y == 0)
        {
            System.out.println("The points lie in the x axis");
        }
        else
        {
            System.out.println("Invalid input");
        }

    }
}