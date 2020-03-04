import Model.PaySlip;
import Model.UserPayDetails;
import PaySlipGenerator.GeneratePaySlip;
import org.junit.Assert;
import org.junit.Test;

public class PaySlipGeneratorTest {
    @Test
    public void createPayslipFor60050SalaryIncomeTaxIs422() {
        UserPayDetails userPayDetails = new UserPayDetails("alex","bishop",60050,9,"March 1","march 30");
        GeneratePaySlip generatePaySlip = new GeneratePaySlip();
        PaySlip payslip = generatePaySlip.generatePaySlip(userPayDetails);

        long actualIncomeTax = payslip.getIncomeTax();

        Assert.assertEquals(922,actualIncomeTax);
    }
    @Test
    public void createPayslipFor60050SalarySuperIs450() {
        UserPayDetails userPayDetails = new UserPayDetails("alex","bishop",60050,9,"March 1","march 30");
        GeneratePaySlip generatePaySlip = new GeneratePaySlip();
        PaySlip payslip = generatePaySlip.generatePaySlip(userPayDetails);

        long actualIncomeTax = payslip.getSuperAmount();

        Assert.assertEquals(450,actualIncomeTax);
    }
}
