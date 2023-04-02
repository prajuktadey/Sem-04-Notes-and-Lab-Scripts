import java.util.*;
abstract class student
{
    int roll;
    int regd;

    abstract void course();
}

class kiitian extends student
{
    void course()
    {
        System.out.println("The student has taken a course.");
        
    }

    public static void main(String[] args) 
    {
        
        kiitian ob1 = new kiitian();
        ob1.course();
    }
}