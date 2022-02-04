package chapter11_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercise11_1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        ArrayList kyo = new ArrayList();
        ArrayList cha = new ArrayList();
        ArrayList hap = new ArrayList();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        Iterator iter = list1.iterator();
        while (iter.hasNext()) {
            int num = (int) iter.next();

            if (list2.contains(num)) {
                kyo.add(num);
            } else {
                cha.add(num);
            }

            hap.add(num);
        }

        iter = list2.iterator();
        while (iter.hasNext()) {
            int num = (int) iter.next();
            if (!list1.contains(num)) {
                hap.add(num);
            }
        }

//        kyo.addAll(list1); // list1 kyo . 의 모든 요소를 에 저장한다
//        kyo.retainAll(list2); // list2 kyo . 와 의 공통요소만 남기고 삭제한다
//        cha.addAll(list1);
//        cha.removeAll(list2); // cha list2 . 에서 와 공통된 요소들을 모두 삭제한다
//        hap.addAll(list1); // list1 hap . 의 모든 요소를 에 저장한다
//        hap.removeAll(kyo); // hap kyo . 에서 와 공통된 모든 요소를 삭제한다
//        hap.addAll(list2); // list2 hap .

        System.out.println("list1="+list1);
        System.out.println("list2="+list2);
        System.out.println("kyo="+kyo);
        System.out.println("cha="+cha);
        System.out.println("hap="+hap);
    }
}
