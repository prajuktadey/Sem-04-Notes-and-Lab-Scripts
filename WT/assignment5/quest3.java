public class quest3 
{
    public static void main(String[] args) 
    {
        int marks = 90;

        if(marks>=90)
        {
            System.out.println("O grade is awarded.");
        }

        else if(marks<90 && marks>=89)
        {
            System.out.println("E grade is awarded.");
        }

        else if(marks<89 && marks>=79)
        {
            System.out.println("A grade is awarded.");
        }

        else if(marks<79 && marks>=69)
        {
            System.out.println("B grade is awarded.");
        }

        else if(marks<69 && marks>=59)
        {
            System.out.println("C grade is awarded.");
        }

        else
        {
            System.out.println("Failed.");
        }
    }
    
}
