public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Ali", "12345", new Course[]{new Course("CS101", "Introduction to Computer Science")}, new Address("Street 1", "Town 1", "City 1", "Country 1", "1234567890"));
        System.out.println(student1.getName());
    }
}
