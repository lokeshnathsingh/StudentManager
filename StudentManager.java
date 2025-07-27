import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Student getStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public void updateStudent(int id, String name, int age, String course) {
        Student s = getStudentById(id);
        if (s != null) {
            s.setName(name);
            s.setAge(age);
            s.setCourse(course);
        }
    }

    public void deleteStudent(int id) {
        students.removeIf(s -> s.getId() == id);
    }
}
