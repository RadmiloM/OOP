import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private Integer grade;
    private List<Course> courses;

    public Student(String name, Integer grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public void remove(Course course) {
        this.courses.remove(course);
    }

    public List<Course> getCourses() {
        return this.courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", courses=" + courses +
                '}';
    }
}

class Course {
    private String name;
    private Double duration;

    public Course(String name, Double duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student("Marko",10);
        Course math = new Course("Mathematics",4.5);
        Course serbian = new Course("Serbian",3.1);
        Student secondStudent = new Student("Damir",8);
        Student thirdStudent = new Student("Filip",8);
        student.getCourses().add(math);
        student.getCourses().add(serbian);
        System.out.println("Student with two courses");
        System.out.println(student.getCourses());
        System.out.println("Student after removal of the course");
        student.getCourses().remove(serbian);
        System.out.println(student.getCourses());
    }
}
