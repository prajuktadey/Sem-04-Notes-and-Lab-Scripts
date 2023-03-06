import java.util.*;
public class quest1 
{
    public static void main(String[] args) 
    {
        student ob1 = new student();
        kiitian ob2 = new kiitian();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your roll number:");
        int r = sc.nextInt();
        System.out.println("Enter your course:");
        String c = sc.next();

        ob1.RollNo= r;
        ob1.course = c;

        ob1.register();

        
        ob2.RollNo= r;
        ob2.course =c;
        ob2.hostelRequest();

    }
}
