package Structure.stack;

import java.util.ArrayList;

public class ListStack<E> {
    private ArrayList<E> list; // 요소를 담을 내부 리스트
    private int top; // 스택의 가장 마지막 요소를 가리키는 포인터

    // 생성자
    public ListStack() {
        this.list = new ArrayList<>();
        this.top = -1; // 기본 빈 값을 표현하기 위해 -1 로 초기화
    }

    public boolean isFull() {
        return top == list.size() - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    // ArrayList에서 알아서 리사이징 되니 구현할 필요가 없다.
    // private void resize() {}

    public E push(E value) {
        list.add(++top, value); // 리스트의 ++top 위치에 value를 추가
        return value;
    }

    public E pop() {
        E value = list.get(top);
        list.remove(top--); // 리스트의 top 위치의 요소를 삭제하고 top 감소
        return value;
    }

    public E peek() {
        return list.get(top);
    }

    public int search(E value) {
        // 스택은 같은 요소값이 있으면 가장 마지막에 추가한 요소를 먼저 반환하기 때문에 lastIndexOf() 메서드를 사용한다.
        int result = list.lastIndexOf(value);

        if (result != -1) {
            return top - result + 1;
        } else {
            return result;
        }
    }

    @Override
    public String toString() {
        return list.toString(); // ArrayList의 toString() 메서드만 호출 하면 된다.
    }
}