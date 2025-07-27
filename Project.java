import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("==== Student Management System ====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Course: ");
                    String course = sc.nextLine();
                    manager.addStudent(new Student(id, name, age, course));
                    break;

                case 2:
                    for (Student s : manager.getAllStudents())
                        System.out.println(s);
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int sid = sc.nextInt();
                    Student found = manager.getStudentById(sid);
                    System.out.println(found != null ? found : "Not found");
                    break;

                case 4:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("New Age: ");
                    int newAge = sc.nextInt();
                    sc.nextLine();
                    System.out.print("New Course: ");
                    String newCourse = sc.nextLine();
                    manager.updateStudent(uid, newName, newAge, newCourse);
                    break;

                case 5:
                    System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt();
                    manager.deleteStudent(did);
                    break;
            }
        } while (choice != 6);

        System.out.println("Exiting...");
    }
}
