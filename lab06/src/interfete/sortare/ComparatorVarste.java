package interfete.sortare;

import java.util.Comparator;

public class ComparatorVarste implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getVarsta() - o2.getVarsta();
    }
}
