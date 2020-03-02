package PaySlipGenerator;

import Model.PaySlip;
import Model.UserPayDetails;

public class GeneratePaySlip implements PaySlipGeneration {

    public PaySlip generatePaySlip(UserPayDetails userPayDetails) {

        String name = userPayDetails.getFirstName() + " " + userPayDetails.getLastName();
        String payPeriod = userPayDetails.getStartDate() + " - " + userPayDetails.getEndDate();
        double salaryPerMonth = userPayDetails.getSalary() / 12;
        long superAmount = calculateSuper(userPayDetails,salaryPerMonth);
        long incomeTax = calculateIncomeTax(userPayDetails);
        long netIncome = Math.round(salaryPerMonth - incomeTax);
        long grossSalary = Math.round(salaryPerMonth);

        return new PaySlip(name,payPeriod,grossSalary,incomeTax,netIncome,superAmount);
    }

    private long calculateSuper(UserPayDetails userPayDetails, double salaryPerMonth) {

        double superAmount = userPayDetails.getSuperAmount();

        return Math.round(salaryPerMonth*(superAmount/100.0f));
    }

    private long calculateIncomeTax(UserPayDetails userPayDetails) {

        double salary = userPayDetails.getSalary();
        double tax;

        if (salary > 18200 && salary <= 37000) {
            tax = ((salary - 18200) * 0.19) / 12;
        }
        else if (salary >= 37001 && salary <= 87000) {

            tax = (3572 + (salary - 37000) * 0.325) / 12;
        }
        else if (salary >= 87001 && salary < 180000) {
            tax = (19822 + (salary - 87000) * 0.37) / 12;
        }
        else if (salary >= 180000) {
            tax = (54232 + (salary - 180000) * 0.45) / 12;
        } else {
            tax = 0;
        }

        return Math.round(tax);
    }
}
