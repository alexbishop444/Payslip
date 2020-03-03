package IO;

import Model.UserPayDetails;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public UserPayDetails takeUserInput() {
        System.out.println("Welcome to the payslip generator!");
        System.out.println("Please enter your first name");
        String firstName = takeAndValidateName();
        System.out.println("Please input your surname");
        String lastName = takeAndValidateName();
        System.out.println("Please enter your annual salary");
        double salary = takeAndValidateSalaryOrSuper();
        System.out.println("Please input your super rate");
        double superAmount = takeAndValidateSalaryOrSuper();
        System.out.println("Please input your payment start date");
        String startDate = takeAndValidateDate();
        System.out.println("Please input your end date");
        String endDate = takeAndValidateDate();
        return new UserPayDetails(firstName,lastName,salary,superAmount,startDate,endDate);
    }

    private String takeAndValidateName() {
        boolean nameValidated = false;
        String name = "";
        while(!nameValidated) {
            name = scanner.nextLine();
            if (name.matches(".*\\d.*")) {
                System.out.println("Please enter only characters");
            } else if (name.equals("")) {
                System.out.println("Please enter a name");

            } else {
                nameValidated = true;
            }
        }
        return name;
    }

    private double takeAndValidateSalaryOrSuper() {
        boolean validated = false;
        double salaryOrSuper = 0;
        String salaryString;
        while(!validated) {
            salaryString = scanner.nextLine();
            if (!salaryString.matches(".*\\d.*")) {
                System.out.println("Please enter only numbers");
            } else if (salaryString.equals("")) {
                System.out.println("Please enter numbers");
            } else {
                salaryOrSuper = Double.parseDouble(salaryString);
                validated = true;
            }
        }
        return salaryOrSuper;
    }

    private String takeAndValidateDate() {
        boolean dateValidated = false;
        String date = "";
        while(!dateValidated) {
            date = scanner.nextLine();
            if (date.equals("")) {
                System.out.println("Please enter a name");
            } else {
                dateValidated = true;
            }
        }
        return date;
    }
}
