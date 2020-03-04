import Model.PaySlip;
import Model.UserPayDetails;
import PaySlipGenerator.GeneratePaySlip;
import org.junit.Assert;
import org.junit.Test;

public class GrossIncomeTests {
    @Test
    public void createPayslipFor60050GrossSalaryIs5004() {
        UserPayDetails userPayDetails = new UserPayDetails("alex","bishop",60050,9,"March 1","march 30");
        GeneratePaySlip generatePaySlip = new GeneratePaySlip();
        PaySlip payslip = generatePaySlip.generatePaySlip(userPayDetails);

        double grossSalary = payslip.getGrossSalary();

        Assert.assertEquals(grossSalary,5004,0);
    }
    @Test
    public void createPayslipFor65000GrossSalaryIs5004() {
        UserPayDetails userPayDetails = new UserPayDetails("alex","bishop",65000,9,"March 1","march 30");
        GeneratePaySlip generatePaySlip = new GeneratePaySlip();
        PaySlip payslip = generatePaySlip.generatePaySlip(userPayDetails);

        double grossSalary = payslip.getGrossSalary();

        Assert.assertEquals(grossSalary,5417,0);
    }
    @Test
    public void createPayslipFor40000GrossSalaryIs5004() {
        UserPayDetails userPayDetails = new UserPayDetails("alex","bishop",40000,9,"March 1","march 30");
        GeneratePaySlip generatePaySlip = new GeneratePaySlip();
        PaySlip payslip = generatePaySlip.generatePaySlip(userPayDetails);

        double grossSalary = payslip.getGrossSalary();

        Assert.assertEquals(grossSalary,3333,0);
    }
}