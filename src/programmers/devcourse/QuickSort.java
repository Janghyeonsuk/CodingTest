package programmers.devcourse;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class MyData implements Comparable<MyData> {
    int v;

    public MyData(int v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return String.valueOf(v);
    }

    @Override
    public int compareTo(MyData o) {
        return Integer.compare(v, o.v);
    }
}

public class QuickSort {
    public static void main(String[] args) {
        List<MyData> list = new LinkedList<>();

        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(new MyData(r.nextInt(50)));
        }

        System.out.println("Before sorting: " + list);
        list = quickSorted(list);
        System.out.println("After sorting: " + list);
    }

    static List<MyData> quickSorted(List<MyData> list) {
        if (list.size() <= 1) return list;

        MyData pivot = list.remove(0);
        List<MyData> lesser = new LinkedList<>();
        List<MyData> greater = new LinkedList<>();

        for (MyData m : list) {
            if (pivot.compareTo(m) > 0) lesser.add(m);
            else greater.add(m);
        }

        List<MyData> merged = new LinkedList<>();
        //오름차순
        merged.addAll(quickSorted(lesser));
        merged.add(pivot);
        merged.addAll(quickSorted(greater));

        //내림차순
        merged.addAll(quickSorted(lesser));
        merged.add(pivot);
        merged.addAll(quickSorted(greater));

        return merged;
    }
}
