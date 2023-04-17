import java.util.Scanner;

class InvalidTime extends Exception{
    public InvalidTime(String s)
    {
        System.out.println(s);
    }
}

public class quest_3 {
    public void Exception() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start time(hours): ");
        int starth = sc.nextInt()*60;
        System.out.print("Enter start time(minutes): ");
        int startm = sc.nextInt();
        System.out.print("Enter end time(hours): ");
        int endh = sc.nextInt()*60;
        System.out.print("Enter end time(minutes): ");
        int endm = sc.nextInt();

        int start = starth+startm;
        int end = endh+endm;

        try 
        {
           if(end<start)
              throw new InvalidTime("End time is lesser than start time.");

            else
            {
              System.out.println("The difference: " +(end-start));
            }
        }
        
        catch (InvalidTime e) 
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args)
    {
       quest_3 obj = new quest_3();
       obj.Exception();
    }
}



