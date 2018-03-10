package Lab.B_Encapsulation.A_SortByNameAndAge_01;

public class Person {
    private String firstName;
    private String lastName;
    private int age;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("%s %s is %d years old.", this.getFirstName(), this.lastName, this.getAge());
    }

}
