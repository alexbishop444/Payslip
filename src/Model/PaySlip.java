package Model;

public class PaySlip {
    private String name;
    private String payPeriod;
    private double grossSalary;
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

    public double getGrossSalary() {
        return grossSalary;
    }

    public long getSuperAmount() {
        return superAmount;
    }

    public PaySlip(String name, String payPeriod, double grossSalary, long incomeTax, long netIncome, long superAmount) {
        this.name = name;
        this.payPeriod = payPeriod;
        this.incomeTax = incomeTax;
        this.netIncome = netIncome;
        this.superAmount = superAmount;
        this.grossSalary = grossSalary;
    }

}
