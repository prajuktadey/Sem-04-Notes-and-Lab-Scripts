public class Savings_account 
{
        static float interest_rate = 7;  
        static void modify_intRate(float r)
       {
          interest_rate = r;
       }

       int accountNo;
       String Name;
       float balance;

       void calculate_interest(int P,int T)
       {
         float interest = P*interest_rate*T/100;
         System.out.println("Interest: " +interest);
       }

       public static void main(String[] args) 
       {
        Savings_account obj = new Savings_account();
        obj.calculate_interest(1000,3);

        Savings_account.modify_intRate(10);
        Savings_account obj2 = new Savings_account();
        obj2.calculate_interest(2000,5);
        }
}
    




