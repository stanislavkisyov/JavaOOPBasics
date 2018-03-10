package Exercise.B_Encapsulation.C_AnimalFarm03;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        if (name.equals("") || name .equals(" ") || name == null ) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    private String calculateProductPerDay(int age) {
        if (age < 6 ) {
            return  "2";
        } else if (age <= 12) {
            return  "1";
        } else {
            return "0.75";
        }
    }

    public String productPerDay() {
        return calculateProductPerDay(this.age);
    }

}
