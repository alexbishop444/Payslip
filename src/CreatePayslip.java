import IO.Input;
import IO.Output;
import Model.PaySlip;
import Model.UserPayDetails;
import PaySlipGenerator.GeneratePaySlip;

public class CreatePayslip {
    private Input input = new Input();
    private GeneratePaySlip generatePaySlip = new GeneratePaySlip();
    private Output output = new Output();

    public void runProgram() {
        UserPayDetails userPayDetails = input.takeUserInput();
        PaySlip paySlip = generatePaySlip.generatePaySlip(userPayDetails);
        output.printPayslip(paySlip);
    }
}
