package human;

public class Human {
    String lastName;
    String name;
    String middleName;

    public Human(String lastName, String name, String middleName) {
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;
    }

    public Human(String lastName, String name) {
        this.lastName = lastName;
        this.name = name;
    }

    public String getShortName() {
        if (middleName != null) {
            return lastName + " " + name.charAt(0)+"."+" "+middleName.charAt(0)+".";
        }
        else {
            return lastName + " " + name.charAt(0)+".";
        }

    }

    public String getFullName() {
        if (middleName != null) {
            return lastName + " " + name + " " + middleName;
        } else {
            return lastName + " " + name;
        }
    }

}
