import java.util.*;
class quest1
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter a number: ");
       int a = sc.nextInt();
       System.out.println("Enter the 2nd number: ");
       int b = sc.nextInt();
       System.out.println("Enter the 3rd number: ");
       int c = sc.nextInt();

       if ((a>b) && (a>c))
       {
         System.out.println("The largest number is: "+ a);
       }

       else if((b>a) && (b>c))
       {
         System.out.println("The largest number is: "+ b);
       }

       else
       {
         System.out.println("The largest number is: "+ c);
       }

    }
}