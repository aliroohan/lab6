public class Student {
    private String name;
    private String email;
    private String cnic;
    private Course [] courses;
    private Address postalAddress;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCnic() {
        return cnic;
    }
    public void setCnic(String cnic) {
        this.cnic = cnic;
    }
    public Course[] getCourses() {
        return courses;
    }
    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
    public Address getPostalAddress() {
        return postalAddress;
    }
    public void setPostalAddress(Address postalAddress) {
        this.postalAddress = postalAddress;
    }
    public Student(String name, String cnic, Course[] courses, Address postalAddress) {
        setName(name);
        setCnic(cnic);
        setCourses(courses);
        setPostalAddress(postalAddress);
    }
}
