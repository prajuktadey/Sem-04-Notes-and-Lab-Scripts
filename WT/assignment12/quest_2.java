import java.util.Scanner;

class NegativeNumberException extends Exception{
    public NegativeNumberException(String s)
    {
        System.out.println(s);
    }
}

public class quest_2 {
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        try 
        {
           if(num<0)
              throw new NegativeNumberException("Negative");

            else
            {
              System.out.println("The doubled number is: " +num*2);
            }
        }
        
        catch (NegativeNumberException e) 
        {
            System.out.println(e);
        }
    }
}




