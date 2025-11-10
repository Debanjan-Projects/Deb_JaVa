package class_obj_problem;

class course {

    static int maxCapacity = 100;

    String courseName;
    int enrollments;
    String[] enrolledStudents;

    course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity) {
        course.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName) {
        if (enrollments < maxCapacity) {
            enrolledStudents[enrollments] = studentName;
            enrollments++;
        } else {
            System.out.println("Course is full!");
        }
    }

    void unenrollStudent(String studentName) {
        if (enrollments > 0) {
            System.out.println(studentName + " removed from this course");
            enrollments--;
        } else {
            System.out.println("No students to remove.");
        }
    }

    // ✅ Added main method for testing
    public static void main(String[] args) {
        course c = new course("Java Programming");
        c.enrollStudent("Debanjan");
        c.enrollStudent("Roy");
        c.unenrollStudent("Debanjan");
    }
}
