import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private List<Course> courses;

    public School() {
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void add(Student student) {
        this.students.add(student);
    }

    public void add(Teacher teacher) {
        teachers.add(teacher);
    }

    public void add(Course course) {
        this.courses.add(course);
    }

    public void remove(Student student) {
        this.students.remove(student);
    }

    public void remove(Teacher teacher) {
        this.teachers.remove(teacher);
    }

    public void remove(Course course) {
        this.courses.remove(course);
    }
}
