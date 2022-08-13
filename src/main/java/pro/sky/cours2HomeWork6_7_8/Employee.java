package pro.sky.cours2HomeWork6_7_8;

public class Employee {
    private String firstName;

    private String secondName;


    public Employee( String firstName, String secondName ) {
        this.firstName = firstName;
        this.secondName = secondName;

    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public void setFirstName( String firstName ) {
        this.firstName = firstName;
    }

    public void setSecondName( String secondName ) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "Employee name: " + this.firstName +
                " Employee surname: " + this.secondName;
    }

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;
        if (!firstName.equals(firstName)) return false;
        return secondName.equals(secondName);
    }

    public int hashCode() {
        int resalt = firstName.hashCode();
        resalt = resalt + secondName.hashCode();
        return resalt;
    }
}
