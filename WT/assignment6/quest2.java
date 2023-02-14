import java.util.*;
class quest2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String first = sc.nextLine();
        System.out.println("Enter your last name: ");
        String last = sc.nextLine();

        System.out.println("Your name is: "+ last + " " + first);

    }
}