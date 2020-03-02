import IO.Input;
import Model.PaySlip;
import Model.UserPayDetails;
import PaySlipGenerator.GeneratePaySlip;

public class RunThing {
    private Input input = new Input();
    private GeneratePaySlip generatePaySlip = new GeneratePaySlip();

    public void runProgram() {
        UserPayDetails userPayDetails = input.takeUserInput();
        PaySlip paySlip = generatePaySlip.generatePaySlip(userPayDetails);
        System.out.println(paySlip);

    }
}
