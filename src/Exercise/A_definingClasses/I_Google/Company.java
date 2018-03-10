package Exercise.A_definingClasses.I_Google;

public class Company {
    private String companyName;
    private String department;
    private double salary;

    public Company() {
    }

    public Company(String companyName, String department, double salary) {
        this.companyName = companyName;
        this.department = department;
        this.salary = salary;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Company:");
        if (this.companyName == null && this.department == null && salary == 0) {
            return sb.toString();
        }
        sb.append(System.lineSeparator())
                .append(String.format("%s %s %.2f", this.companyName, this.department, this.salary));
        return sb.toString();
    }
}
