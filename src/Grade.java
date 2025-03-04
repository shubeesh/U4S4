import java.util.Comparator;

public class Grade implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getGrade(), o2.getGrade());
    }
}
