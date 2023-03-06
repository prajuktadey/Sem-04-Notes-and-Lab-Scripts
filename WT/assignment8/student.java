import java.util.*;
class student
{
    int RollNo;
    String course;

    void register()
    {
        System.out.println("The student is entered into the following course:"+RollNo + " " + course);
    }

}

class kiitian extends student
{

   void hostelRequest()
   {
    System.out.println("The following roll number is asking for a 3 bedded-ac accomodation: ");
    System.out.println(RollNo);
   }
}


