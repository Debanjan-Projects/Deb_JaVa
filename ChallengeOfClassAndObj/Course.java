package ChallengeOfClassAndObj;

public class Course {

    // static variable
    static int maxCapacity = 100;

    // instance variables
    String courseName;
    int enrollments;
    String[] enrolledStudents;

    // static block
    static {
        System.out.println("Currently we all are present in static block");
    }

    // instance initializer block
    {
        maxCapacity++;
    }

    // constructor
    Course(String courseName, String firstStudent) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
        enrollStudent(firstStudent);
    }

    // static method
    static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }

    // instance methods
    void enrollStudent(String studentName) {
        enrolledStudents[enrollments] = studentName;
        enrollments++;
        System.out.println(studentName + " enrolled in " + courseName);
    }

    void unenrollStudent(String studentName) {
        System.out.println(studentName + " removed from " + courseName);
        enrollments--;
    }

    // main method
    public static void main(String[] args) {
        Course course1 = new Course("Java Basics", "Papun");
        course1.enrollStudent("Rohit");
        course1.enrollStudent("Amit");

        course1.unenrollStudent("Amit");
    }
}
