import java.util.*;
public class others
{
    int DeptId;
    int EmployeeId;

    void encashment()
    {
       System.out.println("Enter the number of days: ");
       Scanner sc = new Scanner(System.in);
       int days= sc.nextInt();
       System.out.println("The employee is neither a worker nor a manager.");
       System.out.println("Leave encashment is: " +days*600);
    }
}

class worker extends others
{

    void encashment()
    {
        System.out.println("Enter the number of days: ");
        Scanner sc = new Scanner(System.in);
        int days= sc.nextInt();
        System.out.println("The employee is a worker.");
        System.out.println("Leave Encashment: " + days*500);
    }
}

class manager extends others
{

    void encashment()
    {
        System.out.println("Enter the number of half days: ");
        Scanner sc = new Scanner(System.in);
        int days= sc.nextInt();
        System.out.println("The employee is a manager.");
        System.out.println("Leave Encashment: " + days*400);
    }
}

