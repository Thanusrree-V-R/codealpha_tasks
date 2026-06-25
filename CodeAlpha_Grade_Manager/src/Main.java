import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        GradeManager manager = new GradeManager();

        int choice;

        do {

            System.out.println("\n================================");
            System.out.println("     STUDENT GRADE TRACKER");
            System.out.println("================================");

            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Show Average Grade");
            System.out.println("4. Show Highest Grade");
            System.out.println("5. Show Lowest Grade");
            System.out.println("6. Show Summary Report");
            System.out.println("7. Exit");

            System.out.print("\nEnter Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Grade: ");
                    double grade = scanner.nextDouble();

                    manager.addStudent(name, grade);

                    System.out.println("Student added successfully.");
                    break;

                case 2:

                    manager.displayStudents();
                    break;

                case 3:

                    System.out.printf(
                            "\nAverage Grade: %.2f%n",
                            manager.getAverageGrade()
                    );
                    break;

                case 4:

                    Student highest =
                            manager.getHighestGradeStudent();

                    if (highest != null) {

                        System.out.println(
                            "\nHighest Grade Student:"
                        );

                        System.out.println(
                                highest.getName()
                        );

                        System.out.println(
                                "Grade: "
                                + highest.getGrade()
                        );
                    }
                    break;

                case 5:

                    Student lowest =
                            manager.getLowestGradeStudent();

                    if (lowest != null) {

                        System.out.println(
                                "\nLowest Grade Student:"
                        );

                        System.out.println(
                                lowest.getName()
                        );

                        System.out.println(
                                "Grade: "
                                + lowest.getGrade()
                        );
                    }
                    break;

                case 6:

                    manager.displaySummaryReport();
                    break;

                case 7:

                    System.out.println(
                            "\nThank you for using the system."
                    );
                    break;

                default:

                    System.out.println(
                            "\nInvalid choice."
                    );
            }

        } while (choice != 7);

        scanner.close();
    }
}