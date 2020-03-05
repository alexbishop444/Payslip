import Model.PaySlip;
import Model.UserPayDetails;
import PaySlipGenerator.GeneratePaySlip;
import org.junit.Assert;
import org.junit.Test;

public class SuperTests {
    private GeneratePaySlip generatePaySlip = new GeneratePaySlip();

    @Test
    public void createPayslipFor60050SuperIs450() {
        UserPayDetails userPayDetails = new UserPayDetails("alex","bishop",60050,9,"March 1","march 30");
        PaySlip payslip = generatePaySlip.generatePaySlip(userPayDetails);

        double superAmount = payslip.getSuperAmount();

        Assert.assertEquals(450,superAmount,0);
    }
    @Test
    public void createPayslipFor65000SuperIs488() {
        UserPayDetails userPayDetails = new UserPayDetails("alex","bishop",65000,9,"March 1","march 30");
        PaySlip payslip = generatePaySlip.generatePaySlip(userPayDetails);

        double superAmount = payslip.getSuperAmount();

        Assert.assertEquals(488,superAmount,0);
    }
    @Test
    public void createPayslipFor40000SuperIs300() {
        UserPayDetails userPayDetails = new UserPayDetails("alex","bishop",40000,9,"March 1","march 30");
        PaySlip payslip = generatePaySlip.generatePaySlip(userPayDetails);

        double superAmount = payslip.getSuperAmount();

        Assert.assertEquals(300,superAmount,0);
    }
}
