package chapter11_collection;

import java.util.Comparator;

public class ClassTotalComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        if (s1.ban > s2.ban) {
            return 1;
        } else if (s1.ban == s2.ban) {
            if (s1.total > s2.total) {
                return -1;
            } else if (s1.total == s2.total) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return -1;
        }
    }
}
