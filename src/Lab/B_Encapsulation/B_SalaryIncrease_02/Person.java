package Lab.B_Encapsulation.B_SalaryIncrease_02;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String secondName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = secondName;
        this.age = age;
        this.salary = salary;
    }

    void increase(double bonus) {
        if (this.age < 30) {
            bonus /= 2;
        }
        this.salary += this.salary * bonus / 100;
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %s leva", this.firstName, this.lastName, this.salary);
    }
}
