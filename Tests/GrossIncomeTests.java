import Model.PaySlip;
import Model.UserPayDetails;
import PaySlipGenerator.GeneratePaySlip;
import org.junit.Assert;
import org.junit.Test;

public class GrossIncomeTests {

    private GeneratePaySlip generatePaySlip = new GeneratePaySlip();

    @Test
    public void createPayslipFor60050GrossSalaryIs5004() {
        UserPayDetails userPayDetails = new UserPayDetails("alex","bishop",60050,9,"March 1","march 30");
        PaySlip payslip = generatePaySlip.generatePaySlip(userPayDetails);

        double grossSalary = payslip.getGrossSalary();

        Assert.assertEquals(5004,grossSalary,0);
    }
    @Test
    public void createPayslipFor65000GrossSalaryIs5417() {
        UserPayDetails userPayDetails = new UserPayDetails("alex","bishop",65000,9,"March 1","march 30");
        PaySlip payslip = generatePaySlip.generatePaySlip(userPayDetails);

        double grossSalary = payslip.getGrossSalary();

        Assert.assertEquals(5417,grossSalary,0);
    }
    @Test
    public void createPayslipFor40000GrossSalaryIs333() {
        UserPayDetails userPayDetails = new UserPayDetails("alex","bishop",40000,9,"March 1","march 30");
        PaySlip payslip = generatePaySlip.generatePaySlip(userPayDetails);

        double grossSalary = payslip.getGrossSalary();

        Assert.assertEquals(3333,grossSalary,0);
    }
}