import java.util.*;
class quest3
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter a number: ");
       int a = sc.nextInt();
       System.out.println("Enter the 2nd number: ");
       int b = sc.nextInt();

       while(a!=0 && b!=0)
       {
        int a1= a%10;
        int b1= b%10;
        if(a1 == b1)
        {
            System.out.println("Common digit is: " +a1);
        }
        
        a= a/10;
        b= b/10;

       }
    }
}
