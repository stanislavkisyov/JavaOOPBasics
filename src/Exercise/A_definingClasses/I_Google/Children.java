package Exercise.A_definingClasses.I_Google;

public class Children {
    private String childName;
    private String childBirthday;

    public Children(String childName, String childBirthday) {
        this.childName = childName;
        this.childBirthday = childBirthday;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.childName == null && this.childBirthday == null) {
            return sb.toString();
        }

        sb.append(String.format("%s %s", this.childName, this.childBirthday));
        return sb.toString();
    }
}
