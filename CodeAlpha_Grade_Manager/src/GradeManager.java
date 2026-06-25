import java.util.ArrayList;

public class GradeManager {

    private ArrayList<Student> students;

    public GradeManager() {
        students = new ArrayList<>();
    }

    public void addStudent(String name, double grade) {
        students.add(new Student(name, grade));
    }
public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("\nNo student records found.");
            return;
        }

        System.out.println("\n========== STUDENT LIST ==========");

        for (Student student : students) {
            System.out.printf(
                "Name: %-20s Grade: %.2f%n",
                    student.getName(),
                    student.getGrade()
            );
        }
          }

    public double getAverageGrade() {

        if (students.isEmpty()) {
            return 0;
        }

        double total = 0;

        for (Student student : students) {
            total += student.getGrade();
        }

        return total / students.size();
    }
 public Student getHighestGradeStudent() {

        if (students.isEmpty()) {
            return null;
        }

        Student highest = students.get(0);

        for (Student student : students) {

            if (student.getGrade() > highest.getGrade()) {
                highest = student;
            }
        }

        return highest;
    }
      public Student getLowestGradeStudent() {

        if (students.isEmpty()) {
            return null;
        }

        Student lowest = students.get(0);

        for (Student student : students) {

            if (student.getGrade() < lowest.getGrade()) {
                lowest = student;
            }
        }

        return lowest;
    }
     public void displaySummaryReport() {

        if (students.isEmpty()) {
            System.out.println("\nNo data available.");
            return;
        }

        System.out.println("\n==================================");
        System.out.println("      STUDENT SUMMARY REPORT");
        System.out.println("==================================");

        displayStudents();

        System.out.printf(
                "\nAverage Grade: %.2f%n",
                getAverageGrade()
        );
         Student highest = getHighestGradeStudent();
        Student lowest = getLowestGradeStudent();

        System.out.printf(
                "Highest Grade: %.2f (%s)%n",
                highest.getGrade(),
                highest.getName()
        );

        System.out.printf(
                "Lowest Grade: %.2f (%s)%n",
                lowest.getGrade(),
                lowest.getName()
        );
    }
}