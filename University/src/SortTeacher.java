import java.util.Comparator;

public class SortTeacher implements Comparator<Teacher> {

    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.getsurname().compareTo(o2.getsurname());
    }
}
