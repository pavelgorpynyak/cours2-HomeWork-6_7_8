package pro.sky.cours2HomeWork6_7_8;

import java.util.Objects;

public class Employee {
    private final String firstName;

    private final String lastName;


    public Employee( String firstName, String lastName ) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }



    @Override
    public String toString() {
        return "Employee name: " + this.firstName +
                " Employee surname: " + this.lastName;
    }

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getFirstName().equals(employee.getFirstName()) && getLastName().equals(employee.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName());
    }
}
