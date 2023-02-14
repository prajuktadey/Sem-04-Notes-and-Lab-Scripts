
import java.util.*;
class quest4
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter a number: ");
       int a = sc.nextInt();
       System.out.println("Enter the 2nd number: ");
       int b = sc.nextInt();

       while(a!=0)
       {
         int c = b;
         int a1= a%10;
         while(c!=0)
         {
           int b1= c%10;
           if(a1 == b1)
        {
          System.out.println("Common digit is: " +a1);
        }

          c = c/10;
          }
          a = a/10;
         }
    }
}
