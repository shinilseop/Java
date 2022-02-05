package chapter12_gener_enum_anno;

import chapter7_OOP2.Product;

import java.util.ArrayList;

public class Exercise12_4 {
    public static<T extends Product> ArrayList<T> merge(
            ArrayList<T> list, ArrayList<T> list2) {
        ArrayList<T> newList = new ArrayList<>(list);

        newList.addAll(list2);

        return newList;
    }
}
