public class quest5 
{
    public static void main(String[] args) 
    
    {
        int num = 1111;
        int n = num;
        int m=0;

        while(n!=0){
            int rem = n%10;
            m = 10*m + rem;
            n = n/10;
        }

        if(m == num)
        {
            System.out.println("Palindrome.");
        }
        else
        {
            System.out.println("Not Palindrome.");
        }
    }
}
