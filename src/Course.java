public class Course {
    private String CourseCode;
    private String CourseTitle;

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String courseCode) {
        CourseCode = courseCode;
    }

    public String getCourseTitle() {
        return CourseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        CourseTitle = courseTitle;
    }

    public Course(String courseCode, String courseTitle) {
        setCourseCode(courseCode);
        setCourseTitle(courseTitle);
    }

    public String toString() {
        return "Course Code: " + CourseCode + "\nCourse Title: " + CourseTitle;
    }
}
