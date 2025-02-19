import java.util.Scanner;
public class demo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Character :");
        String ch =sc.next();
        switch(ch)
        {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            System.out.println("Vowel");
            break;
            case "@":
            case "#":
            case "$":
            case "%":
            case "^":
            case "&":
            System.out.println("Special character");
            break;
            default:
            System.out.println("Consonany");

        }
        
    }
    
}
