package IO;

import Model.PaySlip;

public class Output {

    public void returnPayslip(PaySlip paySlip) {
        System.out.println("Your payslip has been generated:");
        System.out.println("Name: " + paySlip.getName());
        System.out.println("Pay Period: " + paySlip.getPayPeriod());
        System.out.println("Gross Income: " + paySlip.getGrossSalary());
        System.out.println("Income tax " + paySlip.getIncomeTax());
        System.out.println("Net income " + paySlip.getNetIncome());
        System.out.println("Super: " + paySlip.getSuperAmount());
    }
}
