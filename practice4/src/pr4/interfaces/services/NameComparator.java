package pr4.interfaces.services;

import java.util.Comparator;
import pr4.interfaces.model.StudentRecord;

public class NameComparator implements Comparator<StudentRecord> {

    @Override
    public int compare(StudentRecord s1, StudentRecord s2) {
        return s1.getName().compareTo(s2.getName());
    }
}