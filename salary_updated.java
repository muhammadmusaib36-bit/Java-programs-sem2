import java.util.Scanner;

public class salary_updated {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your salary");
        int salary = sc.nextInt();

        System.out.println("Enter your increment");
        int increment = sc.nextInt();

        System.out.println("Enter the number of years of increment");
        int years = sc.nextInt();

        for (int i = 1; i <= years; i++) {

            salary += increment;

            System.out.println("your salary in year " + i + " is " + salary);


        }
    }
}