public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Employee(String firstName, String lastName, Date birthDate, Date hireDate) {
        setFirstName(firstName);
        setLastName(lastName);
        setBirthDate(birthDate);
        setHireDate(hireDate);
    }
    public String toString() {
        return "First Name : " + firstName + "\nLast Name : " + lastName + "\nDate of Birth : " + birthDate.toString() + "\nHiring Date : " + hireDate.toString();
    }
}
