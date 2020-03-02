package Model;

public class PaySlip {
    private String name;
    private String payPeriod;
    private long incomeTax;
    private long netIncome;
    private long superAmount;

    public String getName() {
        return name;
    }

    public String getPayPeriod() {
        return payPeriod;
    }

    public long getIncomeTax() {
        return incomeTax;
    }

    public long getNetIncome() {
        return netIncome;
    }

    @Override
    public String toString() {
        return "PaySlip{" +
                "name='" + name + '\'' +
                ", payPeriod='" + payPeriod + '\'' +
                ", incomeTax=" + incomeTax +
                ", netIncome=" + netIncome +
                ", superAmount=" + superAmount +
                '}';
    }

    public long getSuperAmount() {
        return superAmount;
    }

    public PaySlip(String name, String payPeriod, long incomeTax, long netIncome, long superAmount) {
        this.name = name;
        this.payPeriod = payPeriod;
        this.incomeTax = incomeTax;
        this.netIncome = netIncome;
        this.superAmount = superAmount;
    }

}
