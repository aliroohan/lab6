import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student1:");
        System.out.println("Enter CNIC: ");
        String cnic = scanner.nextLine();

        System.out.println("Enter Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Address details: ");
        System.out.print("Street : ");
        String street = scanner.nextLine();
        System.out.print("Town : ");
        String town = scanner.nextLine();
        System.out.print("City : ");
        String city = scanner.nextLine();
        System.out.print("Country : ");
        String country = scanner.nextLine();
        System.out.print("Phone Number : ");
        String PhoneNumber = scanner.nextLine();
        Address address = new Address(street, town, city, country, PhoneNumber);

        System.out.println("Enter Course details: ");
        System.out.print("Course Code : ");
        String courseCode = scanner.nextLine();
        System.out.print("Course Title : ");
        String courseTitle = scanner.nextLine();
        Course[] courses = new Course[]{new Course(courseCode, courseTitle)};

        Student student1 = new Student(name, cnic, courses, address);

        // Print all attribute values of student1
        System.out.println(student1);

        System.out.println("Student2:");
        System.out.println("Enter CNIC: ");
        String cnic1 = scanner.nextLine();

        System.out.println("Enter Name: ");
        String name1 = scanner.nextLine();


        Address address1 = address;

        System.out.println("Enter Course details: ");
        System.out.print("Course Code : ");
        String courseCode1 = scanner.nextLine();
        System.out.print("Course Title : ");
        String courseTitle1 = scanner.nextLine();
        Course[] courses1 = new Course[]{new Course(courseCode1, courseTitle1)};


        // Create another Student object student2 using the same Address object as student1
        Student student2 = new Student(name1, cnic1, courses, address);

        // Change an attribute of the Address object from student1
        student1.getPostalAddress().setStreet("240");

        System.out.println(student2);


        scanner.close();
    }
}