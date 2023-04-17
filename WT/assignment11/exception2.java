public class exception2
{
    public static void main(String[] args)
    {
        try
        {
            int ar[] = new int[-2];
            
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index out of bounds exeption.");
        }

        catch(NegativeArraySizeException n)
        {
            System.out.println("Array size cannot be negative.");
        }

        System.out.println("End of program.");
    }
}

