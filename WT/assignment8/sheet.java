import java.util.*;
class sheet 
{
    int length;
    int breadth;

    void price()
    {
        int area = length*breadth;
        System.out.println("Area is: " +area);

        System.out.println("The price of the 2d sheet is: " +area*40);
    }
}

class box extends sheet
{
    int length;
    int breadth;
    int height;

    void price()
    {
        int area = length*breadth*height;
        System.out.println("Area is: " +area);

        System.out.println("The price of the 3d box is: " +area*60);
    }
}
