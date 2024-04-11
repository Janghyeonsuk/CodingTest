package Structure;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack<E> {
    private static final int DEFAULT_CAPACITY = 6; // 최소 용량 크기
    private Object[] arr; // 요소를 담을 내부 배열
    private int top; // 스택의 가장 마지막 요소를 가리키는 포인터

    // 생성자
    public MyStack() {
        this.arr = new Object[DEFAULT_CAPACITY]; // 6 용량으로 내부 배열 생성
        this.top = -1;
    }

    public boolean isFull() {
        // 마지막 요소 위치인 top이 배열 길이 - 1 과 같은 경우 끝까지 차있는 것과 같음
        return top == arr.length - 1;
    }

    public boolean isEmpty() {
        // 마지막 요소 위치인 top이 -1을 가리키는 경우, 배열이 비어있는 것과 같음
        return top == -1;
    }

    private void resize() {
        int arr_capacity = arr.length - 1; // 현재 배열의 용량에 -1 한 값을 얻음 (배열 인덱스는 0부터 시작하니까)

        // 용량이 꽉찬 경우
        if (top == arr_capacity) {
            // 넉넉하게 공간을 유지하기 위해 현재 용량의 두배로 설정
            int new_capacity = arr.length * 2;

            // 복사할 배열을 new_capacity 용량 만큼 설정하고 arr 원소들을 전체 복사해서 넣고 반환 (빈공간은 null)
            arr = Arrays.copyOf(arr, new_capacity);
            return;
        }

        // 용량에 비해 데이터 양이 적은 경우
        if (top < (arr_capacity / 2)) {
            // 기존 용량의 반을 설정
            int half_capacity = arr.length / 2;

            // half_capacity 와 디폴트 용량 중 큰걸 복사
            arr = Arrays.copyOf(arr, Math.max(half_capacity, DEFAULT_CAPACITY));
            return;
        }
    }

    public E push(E value) {
        // 1. 배열이 꽉 차있는지 검사한다.
        if (isFull())
            resize(); // 꽉 찼으면 배열 리사이징 실행

        // 2. 원소를 추가할 예정이니 마지막 요소 위치인 top을 1 증가시킨다.
        top++;

        // 3. 그리고 해당 배열 위치에 요소를 추가한다.
        arr[top] = value;

        // 4. 넣은 요소의 값을 반한다.
        return value;
    }

    @SuppressWarnings("unchecked")
    public E pop() {
        // 1. 배열이 비어있으면 예외 발생
        if (isEmpty())
            throw new EmptyStackException();

        // 2. 먼저 arr[top] 원소를 백업한다.
        E value = (E) arr[top];

        // 3. 해당 위치의 요소를 삭제한다.
        arr[top] = null;

        // 4. top을 1 감소 시킨다.
        top--;

        // 5. 혹시 들어있는 요소에 비해 빈공간이 많으면 최적화를 위해 리사이징을 해준다.
        resize();

        // 6. 백업한 요소를 반환한다.
        return value;
    }

    @SuppressWarnings("unchecked")
    public E peek() {
        // 1. 배열이 비어있으면 예외 발생
        if (isEmpty())
            throw new EmptyStackException();

        // 2. 스택의 마지막 원소 값만 반환한다. (삭제 X)
        return (E) arr[top];
    }

    public int search(E value) {
        // 스택 맨 위 서부터 아래로 순회하여 찾고자 하는 값의 위치를 구한다.
        for (int i = top; i >= 0; i--) {
            if (arr[i].equals(value)) {
                return i + 1;
            }
        }

        // 만일 찾고자 하는 값이 없다면 -1을 반환
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack); // [1, 2, 3, 4]

        System.out.println(stack.peek()); // 4

        System.out.println(stack.search(4)); // 4
        System.out.println(stack.search(3)); // 3

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack); // [1]
    }
}
/*

// ArrayList
public class Stack<E> {
    private ArrayList<E> list; // 요소를 담을 내부 리스트
    private int top; // 스택의 가장 마지막 요소를 가리키는 포인터

    // 생성자
    public Stack() {
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
}*/
