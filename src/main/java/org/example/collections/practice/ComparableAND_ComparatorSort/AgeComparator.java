package org.example.collections.practice.ComparableAND_ComparatorSort;

import java.util.Comparator;

public class AgeComparator implements Comparator<StudentComparator>{



    @Override
    public int compare(StudentComparator studentComparator, StudentComparator t1) {
        return  studentComparator.getAge()-t1.getAge();
    }
}
