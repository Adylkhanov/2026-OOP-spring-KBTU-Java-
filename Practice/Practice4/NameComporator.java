package Practice.Practice4;
import java.util.*;


class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name); 
    }
}