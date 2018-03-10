package Exercise.A_definingClasses.I_Google;

public class Parents {
    private String parentName;
    private String parentBirthday;

    public Parents(String parentName, String parentBirthday) {
        this.parentName = parentName;
        this.parentBirthday = parentBirthday;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.parentName == null && this.parentBirthday == null) {
            return sb.toString();
        }
        sb.append(System.lineSeparator()).append(String.format("%s %s", this.parentName, this.parentBirthday));
        return sb.toString();
    }
}
