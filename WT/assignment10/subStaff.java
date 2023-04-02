import java.util.*;
interface abc{
    void earnings(double num);
    void deductions(double num);
    void bonus(double num);
}
abstract class manager implements abc{
    public void earnings(double num){
        double sal = num + 0.8*num + 0.15*num;
        System.out.println("Earnings: " + sal);
    }
    public void deductions(double num){
        double sal = 0.12*num;
        System.out.println("Deductions: " + sal);
    }
}

class subStaff extends manager{
    public void bonus(double num) {
        double sal = 0.5*num;
        System.out.println("Bonus: " + sal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary of Sub Staff:");
        double sal = sc.nextInt();

        subStaff emp = new subStaff();
        emp.earnings(sal);
        emp.deductions(sal);
        emp.bonus(sal);
    }
}