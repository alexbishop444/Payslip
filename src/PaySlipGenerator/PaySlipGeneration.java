package PaySlipGenerator;

import Model.PaySlip;
import Model.UserPayDetails;

public interface PaySlipGeneration {
    PaySlip generatePaySlip(UserPayDetails userPayDetails);
}
