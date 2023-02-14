import java.util.*;
class mybox
{
    public static void main(String[] args) 
    {
        box b1 = new box();

        Scanner sc = new Scanner(System.in);

       System.out.println("Enter the length: ");
       int length = sc.nextInt();
       System.out.println("Enter the width: ");
       int width = sc.nextInt();
       System.out.println("Enter the height: ");
       int height = sc.nextInt();

       b1.setdim(length, width, height);
       b1.volume();
       b1.dim();

    }
}