public class Demo{
    public static void main(String[] args)
    {
      System.out.println("3 < 9 :" +(3 < 9));
      System.out.println("3 > 3 :" +(3 > 3));
      System.out.println("3 >= 9 :" +(3 >= 9));
      System.out.println("3 <= 9 :" +(3 <= 9));
      System.out.println("3 == 9 :" +(3 == 9));
      System.out.println("3 != 9 :" +(3 != 9));

      System.out.println("3 < 9 && 5 < 9:" +(3 < 9 && 5 < 9));
      System.out.println(" 3 == 3 || 5 > 9:" +( 3 == 3 || 5 >9));

      System.out.println(!true);
      System.out.println(!false);
      System.out.println(!(6 > 9));
    }
}