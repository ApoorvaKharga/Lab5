import Marketing.sales;
import java.util.Scanner;

public class LQ1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the employee id and employee name: ");
        int id = sc.nextInt();
        String name = sc.next();

        System.out.print("Enter the basic salary: ");
        double basic = sc.nextDouble();

        sales s = new sales(id, name, basic);

        double totalEarning = s.earnings();

        System.out.println("The emp id of the employee is " + s.getEmpid());
        System.out.println("The total earning is " + totalEarning);
    }
}
