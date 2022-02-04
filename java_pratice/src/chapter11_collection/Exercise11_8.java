package chapter11_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exercise11_8 {
    public static void calculateSchoolRank(List list) {
        Collections.sort(list);

        int prevRank = 0;
        int prevTotal = -1;
        int length = list.size();

        int same_cnt = 0;
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            Student s = (Student) iter.next();
            if (s.total == prevTotal) {
                s.schoolRank = prevRank;
                same_cnt++;
            } else {
                prevRank += 1+same_cnt;
                same_cnt=0;
                s.schoolRank = prevRank;
            }

            prevRank = s.schoolRank;
            prevTotal = s.total;
        }
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student("이자바",2,1,70,90,70));
        list.add(new Student("안자바",2,2,60,100,80));
        list.add(new Student("홍길동",1,3,100,100,100));
        list.add(new Student("남궁성",1,1,90,70,80));
        list.add(new Student("김자바",1,2,80,80,90));
        calculateSchoolRank(list);
        Iterator it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }

}
