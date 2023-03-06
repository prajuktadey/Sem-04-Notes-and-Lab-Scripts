import java.util.*;
public class quest3
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Others, 2 for Worker and 3 for Manager.");
        int choice = sc.nextInt();
        
        switch(choice)
        {
            case 1:
            others ob1 = new others();
            ob1.DeptId=1;
            ob1.EmployeeId=23;
            ob1.encashment();
            break;

            case 2:
            worker ob2 = new worker();
            ob2.DeptId=2;
            ob2.EmployeeId=25;
            ob2.encashment();
            break;

            case 3:
            manager ob3 = new manager();
            ob3.DeptId=3;
            ob3.EmployeeId=27;
            ob3.encashment();
            break;

        }
    }
}
