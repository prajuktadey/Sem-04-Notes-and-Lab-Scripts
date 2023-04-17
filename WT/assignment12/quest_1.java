import java.util.*;

public class quest_1 
{
    public void division()
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        try
        {
            float c = a/b;
            System.out.println(c);
        }

        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception caught.");
        }

        finally
        {
            System.out.println("Enter NO to exit from the program.");
            String w = sc.next();
            if (w.equalsIgnoreCase("No"))
            {
                System.exit(a);
            }   

            else
            {
                division();
            }
        }
    }


    public static void main(String[] args)
    {
        quest_1 obj = new quest_1();
        obj.division();
    }

}

