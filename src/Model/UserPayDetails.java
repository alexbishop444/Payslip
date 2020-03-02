package Model;

public class UserPayDetails {
    private String firstName;
    private String lastName;
    private double salary;
    private double superAmount;
    private String startDate;
    private String endDate;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public double getSuperAmount() {
        return superAmount;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public UserPayDetails(String firstName, String lastName, double salary, double superAmount, String startDate, String endDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.superAmount = superAmount;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
