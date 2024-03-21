import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter CNIC: ");
        String cnic = scanner.nextLine();

        System.out.println("Enter Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Address details: ");
        String street = scanner.nextLine();
        String town = scanner.nextLine();
        String city = scanner.nextLine();
        String country = scanner.nextLine();
        String postalCode = scanner.nextLine();
        Address address = new Address(street, town, city, country, postalCode);

        System.out.println("Enter Course details: ");
        String courseCode = scanner.nextLine();
        String courseTitle = scanner.nextLine();
        Course[] courses = new Course[]{new Course(courseCode, courseTitle)};

        Student student1 = new Student(name, cnic, courses, address);

        // Print all attribute values of student1
        System.out.println(student1);

        // Create another Student object student2 using the same Address object as student1
        Student student2 = new Student("Student2", "123456", courses, address);

        // Change an attribute of the Address object from student1
        student1.getAddress().setStreet("New Street");

        // Check if it also changes for student2
        System.out.println("Student1 Address: " + student1.getAddress());
        System.out.println("Student2 Address: " + student2.getAddress());

        scanner.close();
    }
}