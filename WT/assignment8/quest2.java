import java.util.*;
public class quest2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for sheet and 1 for box.");
        int choice = sc.nextInt();
        
        switch(choice)
        {
            case 0:
            System.out.println("Enter the length: ");
            int l= sc.nextInt();
            System.out.println("Enter the breadth: ");
            int b= sc.nextInt();
            sheet ob1 = new sheet();
            ob1.length= l;
            ob1.breadth=b;
            ob1.price();
            break;

            case 1:
            System.out.println("Enter the length: ");
            int l1= sc.nextInt();
            System.out.println("Enter the breadth: ");
            int b1= sc.nextInt();
            System.out.println("Enter the height: ");
            int h1= sc.nextInt();
            box ob2 = new box();
            ob2.length= l1;
            ob2.breadth=b1;
            ob2.height= h1;
            ob2.price();
            break;

        }
    }
}
