package IO;

import Model.UserPayDetails;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public UserPayDetails takeUserInput() {
        System.out.println("Welcome to the payslip generator!");
        System.out.println("Please Input your first name");
        String firstName = scanner.nextLine();
        System.out.println("Please input your surname");
        String lastName = scanner.nextLine();
        System.out.println("Please enter your annual salary");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input your super rate");
        double superAmount = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input your payment start date");
        String startDate = scanner.nextLine();
        System.out.println("Please input your end date");
        String endDate = scanner.nextLine();
        return new UserPayDetails(firstName,lastName,salary,superAmount,startDate,endDate);
    }
}
