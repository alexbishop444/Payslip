import Model.PaySlip;
import Model.UserPayDetails;
import PaySlipGenerator.GeneratePaySlip;
import org.junit.Assert;
import org.junit.Test;

public class IncomeTaxTests {
    @Test
    public void createPayslipFor60050IncomeTaxIs922() {
        UserPayDetails userPayDetails = new UserPayDetails("alex","bishop",60050,9,"March 1","march 30");
        GeneratePaySlip generatePaySlip = new GeneratePaySlip();
        PaySlip payslip = generatePaySlip.generatePaySlip(userPayDetails);

        double incomeTax = payslip.getIncomeTax();

        Assert.assertEquals(922,incomeTax,0);
    }
    @Test
    public void createPayslipFor65000IncomeTaxIs1056() {
        UserPayDetails userPayDetails = new UserPayDetails("alex","bishop",65000,9,"March 1","march 30");
        GeneratePaySlip generatePaySlip = new GeneratePaySlip();
        PaySlip payslip = generatePaySlip.generatePaySlip(userPayDetails);

        double incomeTax = payslip.getIncomeTax();

        Assert.assertEquals(1056,incomeTax,0);
    }
    @Test
    public void createPayslipFor40000IncomeTaxIs379() {
        UserPayDetails userPayDetails = new UserPayDetails("alex","bishop",40000,9,"March 1","march 30");
        GeneratePaySlip generatePaySlip = new GeneratePaySlip();
        PaySlip payslip = generatePaySlip.generatePaySlip(userPayDetails);

        double incomeTax = payslip.getIncomeTax();

        Assert.assertEquals(379,incomeTax,0);
    }
}
