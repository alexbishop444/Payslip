import Model.PaySlip;
import Model.UserPayDetails;
import PaySlipGenerator.GeneratePaySlip;
import org.junit.Assert;
import org.junit.Test;

public class NetIncomeTests {
    private GeneratePaySlip generatePaySlip = new GeneratePaySlip();

    @Test
    public void createPayslipFor60050NetIncomeIs4082() {
        UserPayDetails userPayDetails = new UserPayDetails("alex","bishop",60050,9,"March 1","march 30");
        PaySlip payslip = generatePaySlip.generatePaySlip(userPayDetails);

        double netIncome = payslip.getNetIncome();

        Assert.assertEquals(4082,netIncome,0);
    }
    @Test
    public void createPayslipFor65000NetIncomeIs4361() {
        UserPayDetails userPayDetails = new UserPayDetails("alex","bishop",65000,9,"March 1","march 30");
        PaySlip payslip = generatePaySlip.generatePaySlip(userPayDetails);

        double netIncome = payslip.getNetIncome();

        Assert.assertEquals(4361,netIncome,0);
    }
    @Test
    public void createPayslipFor40000NetIncomeIs2954() {
        UserPayDetails userPayDetails = new UserPayDetails("alex","bishop",40000,9,"March 1","march 30");
        PaySlip payslip = generatePaySlip.generatePaySlip(userPayDetails);

        double netIncome = payslip.getNetIncome();

        Assert.assertEquals(2954,netIncome,0);
    }
}
