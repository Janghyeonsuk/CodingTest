package Structure;

public class MyArray {

    int[] arr;
    int count;

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -999999999;

    public MyArray() {
        count = 0;
        ARRAY_SIZE = 26;
        arr = new int[ARRAY_SIZE];
    }

    public MyArray(int size) {
        count = 0;
        ARRAY_SIZE = size;
        arr = new int[size];
    }

    public void addElement(int num) {
        if (count >= ARRAY_SIZE) {
            System.out.println("not enough memory");
            return;
        }

        arr[count++] = num;
    }

    public void insertElement(int idx, int num) {
        if (count >= ARRAY_SIZE) {
            System.out.println("not enough memory");
            return;
        }

        if (idx < 0 || idx > count) {
            System.out.println("insert Error");
            return;
        }

        for (int i = count - 1; i >= idx; i--)
            arr[i + 1] = arr[i];        // 하나씩 이동

        arr[idx] = num;
        count++;
    }

    public int removeElement(int idx) {
        int ret = ERROR_NUM;

        if (isEmpty()) {
            System.out.println("There is no element");
            return ret;
        }

        if (idx < 0 || idx >= count) {  //index error
            System.out.println("remove Error");
            return ret;
        }

        ret = arr[idx];

        for (int i = idx; i < count - 1; i++)
            arr[i] = arr[i + 1];

        arr[--count] = 0;
        return ret;
    }

    public int getSize() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int getElement(int idx) {
        if (idx < 0 || idx >= count) {
            System.out.println("검색 위치 오류. 현재 배열 원소의 개수는 " + count + "개 입니다.");
            return ERROR_NUM;
        }

        return arr[idx];
    }

    public void printAll() {
        if (count == 0) {
            System.out.println("빈 배열입니다.");
            return;
        }

        for (int n : arr)
            System.out.print(n + " ");
        System.out.print("\n");
    }

    public void removeAll() {
        for (int i = 0; i < count; i++)
            arr[i] = 0;

        count = 0;
    }

    public static void main(String[] args) {
        String line = "====================================================";

        MyArray arr = new MyArray();
        arr.addElement(1);
        arr.addElement(2);
        arr.addElement(3);
        arr.insertElement(1, 4);
        arr.printAll();
        System.out.println(line);

        arr.removeElement(1);
        arr.printAll();
        System.out.println(line);

        arr.addElement(5);
        arr.printAll();
        System.out.println(line);

        arr.removeElement(1);
        arr.printAll();
        System.out.println(line);

        System.out.println(arr.getElement(2));
        System.out.println(line);

        arr.removeAll();
        arr.printAll();
        System.out.println(line);
        System.out.println(arr.isEmpty());
    }

}
