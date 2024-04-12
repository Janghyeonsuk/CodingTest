package datastructure.list.linkedlist;

import java.util.NoSuchElementException;
import java.util.Objects;

public class MyDoublyLinkedList<E> {
    private Node<E> head; // 노드의 첫 부분을 가리키는 레퍼런스
    private Node<E> tail; // 노드의 끝 부분을 가리키는 레퍼런스

    private int size; // 리스트 요소 갯수

    // 생성자
    public MyDoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // inner static class
    private static class Node<E> {
        private E item; // Node에 담을 데이터
        private Node<E> next; // 다음 Node 객체를 가르키는 래퍼런스
        private Node<E> prev; // 이전 Node 객체를 가르키는 래퍼런스

        // 생성자 (이전 노드 포인트 | 데이터 | 다음 노드 포인트)
        Node(Node<E> prev, E item, Node<E> next) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node<E> search(int index) {
        Node<E> n; // 반환할 노드

        if ((size / 2) > index) {
            // 1. 만일 인덱스가 시작에 가까우면, 순차 탐색
            n = head;
            for (int i = 0; i < index; i++) {
                n = n.next;
            }
        } else {
            // 2. 만일 인덱스가 끝에 가까우면, 역순 탐색
            n = tail;
            for (int i = size - 1; i > index; i--) {
                n = n.prev;
            }
        }

        return n;
    }

    public void addFirst(E value) {

        // 1. head를 임시 백업함
        Node<E> first = head;

        // 2. 새 노드를 추가 (이때 첫번째 노드니까 prev는 null이 되고 next는 head가 가리키는 노드가 되게 된다)
        Node<E> new_node = new Node<>(null, value, first);

        // 3. 노드를 추가하였으니 리스트 크기 증가
        size++;

        // 4. 첫번째 기준이 변경되었으니 head를 삽입된 새 노드로 참조하도록 업데이트
        head = new_node;

        if (first == null) {
            // 5. 만일 빈 리스트에서 최초의 요소 추가였을 경우, tail도 첫째 노드를 바라보도록 업데이트
            tail = new_node;
        } else {
            // 6. 만일 빈 리스트가 아닐경우, 추가되기 이전 첫번째이었던 노드에서 prev를 새 노드로 참조하도록 업데이트
            first.prev = new_node;
        }
    }

    public void addLast(E value) {
        // 1. tail를 임시 백업함
        Node<E> last = tail;

        // 2. 새 노드를 추가 (이때 마지막 노드니까 next는 null이 되고 prev는 tail이 가리키는 노드가 되게 된다)
        Node<E> new_node = new Node<>(last, value, null);

        // 3. 노드를 추가하였으니 리스트 크기 증가
        size++;

        // 4. 마지막 기준이 변경되었으니 tail를 삽입된 새 노드로 참조하도록 업데이트
        tail = new_node;

        if (last == null) {
            // 5. 만일 빈 리스트에서 최초의 요소 추가였을 경우, head도 첫째 노드를 바라보도록 업데이트
            head = new_node;
        } else {
            // 6. 만일 빈 리스트가 아닐경우, 추가되기 이전 마지막이었던 노드에서 next를 새 노드로 참조하도록 업데이트
            last.next = new_node;
        }
    }

    public boolean add(E value) {
        addLast(value);
        return true;
    }

    public void add(int index, E value) {
        // 1. 인덱스 범위 체크
        // 인덱스가 0보다 작거나 size 보다 클 경우 에러
        // (인덱스가 size보다 크면 마지막 요소 다음 빈공간의 다음 빈공간을 가리키는 거니까)
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        // 2. 추가하려는 index가 0이면 addFirst 호출
        if (index == 0) {
            addFirst(value);
            return;
        }

        // 3. 추가하려는 index가 size와 같으면 addLast 호출
        if (index == size) {
            addLast(value);
            return;
        }

        // 4. 추가하려는 위치의 다음 노드 얻기
        Node<E> next_node = search(index);

        // 5. 추가하려는 위치의 이전 노드 얻기
        Node<E> prev_node = next_node.prev;

        // 6. 새 노드 생성 (바로 이전 / 다음 노드와 연결됨)
        Node<E> new_node = new Node<>(prev_node, value, next_node);

        // 7. 노드를 추가하였으니 리스트 크기 증가
        size++;

        // 8. 이전 노드의 next를 새 노드에 연결
        prev_node.next = new_node;

        // 9. 다음 노드의 prev를 새 노드에 연결
        next_node.prev = new_node;
    }

    public E removeFirst() {

        // 1. 만약 삭제할 요소가 아무것도 없으면 에러
        if (head == null) {
            throw new NoSuchElementException();
        }

        // 2. 삭제될 첫번째 요소의 데이터를 백업
        E value = head.item;

        // 3. 두번째 노드를 임시 저장
        Node<E> first = head.next;

        // 4. 첫번째 노드의 내부 요소를 모두 삭제
        head.next = null;
        head.item = null;

        // 5. 요소가 삭제 되었으니 크기 감소
        size--;

        // 6. head가 다음 노드를 가리키도록 업데이트
        head = first;

        if (first == null) {
            // 7. 만일 리스트의 유일한 값을 삭제해서 빈 리스트가 될 경우, tail도 null 처리
            tail = null;
        } else {
            // 8. 만일 빈 리스트가 아닐경우, 삭제되기 이전 두번째 이었던 first가 첫번째 노드가 되니 prev를 null 처리
            first.prev = null;
        }

        // 9. 마지막으로 삭제된 요소를 반환
        return value;
    }

    public E remove() {
        return removeFirst();
    }

    public E removeLast() {

        // 1. 만약 삭제할 요소가 아무것도 없으면 에러
        if (tail == null) {
            throw new NoSuchElementException();
        }

        // 2. 삭제될 첫번째 요소의 데이터를 백업
        E value = tail.item;

        // 3. 마지막 노드의 이전 노드를 임시 저장
        Node<E> last = tail.prev;

        // 4. 마지막 노드의 내부 요소를 모두 삭제
        tail.item = null;
        tail.prev = null;

        // 5. 요소가 삭제 되었으니 크기 감소
        size--;

        // 6. tail이 이전 노드를 가리키도록 업데이트
        tail = last;

        if (last == null) {
            // 7. 만일 리스트의 유일한 값을 삭제해서 빈 리스트가 될 경우, head도 null 처리
            head = null;
        } else {
            // 8. 만일 빈 리스트가 아닐경우, 삭제되기 이전 마지막의 이전 노드 이었던 last가 마지막 노드가 되니 next를 null 처리
            last.next = null;
        }

        // 9. 마지막으로 삭제된 요소를 반환
        return value;
    }

    public E remove(int index) {

        // 1. 인덱스가 0보다 작거나 size 보다 크거나 같은 경우 에러 (size와 같을 경우 빈 공간을 가리키는 거니까)
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        // 2. 인덱스가 0이면 removeFirst 메서드 실행
        if (index == 0) {
            return removeFirst();
        }

        // 3. 인덱스가 size - 1(마지막 요소 위치) 이면 removeLast 메서드 실행
        if (index == size - 1) {
            return removeLast();
        }

        // 4. 삭제할 위치의 노드 저장
        Node<E> del_node = search(index);

        // 5. 삭제할 위치의 이전 노드 저장
        Node<E> prev_node = del_node.prev;

        // 6. 삭제할 위치의 다음 노드 저장
        Node<E> next_node = del_node.next;

        // 7. 삭제될 첫번째 요소의 데이터를 백업
        E value = del_node.item;

        // 8. 삭제 노드의 내부 요소를 모두 삭제
        del_node.item = null;
        del_node.prev = null;
        del_node.next = null;

        // 9. 요소가 삭제 되었으니 크기 감소
        size--;

        // 10. 이전 노드가 다음 노드를 가리키도록 업데이트
        prev_node.next = next_node;

        // 11. 다음 노드가 이전 노드를 가리키도록 업데이트
        next_node.prev = prev_node;

        // 12. 마지막으로 삭제된 요소를 반환
        return value;
    }

    public boolean remove(Object value) {

        // 1. 삭제 노드를 저장할 변수 선언
        Node<E> del_node = null;

        // 2. 리스트를 루프할 변수 선언
        Node<E> i = head;

        // 3. 노드의 next를 순회하면서 해당 값을 찾는다.
        while (i != null) {

            // 노드의 값과 매개변수 값이 같으면
            if (Objects.equals(i.item, value)) {
                del_node = i; // 삭제 노드에 요소를 대입하고 break
                break;
            }

            i = i.next;
        }

        // 4. 만일 찾은 요소가 없다면 false 리턴
        if (del_node == null) {
            return false;
        }

        // 5. 만약 삭제하려는 노드가 head(첫번째 요소) 라면, 기존 removeFirst()를 사용
        if (del_node == head) {
            removeFirst();
            return true;
        }

        // 6. 만약 삭제하려는 노드가 last(마지막 요소) 라면, 기존 removeLast()를 사용
        if (del_node == tail) {
            removeLast();
            return true;
        }

        // 7. 이전 노드, 다음 노드 구하기
        Node<E> prev_node = del_node.prev;
        Node<E> next_node = del_node.next;

        // 8. 삭제 요소 데이터 모두 제거
        del_node.item = null;
        del_node.prev = null;
        del_node.next = null;

        // 9. 요소가 삭제 되었으니 크기 감소
        size--;

        // 10. 이전 노드와 다음 노드 끼리 서로 링크드 설정
        prev_node.next = next_node;
        next_node.prev = prev_node;

        return true;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        return search(index).item;
    }

    public void set(int index, E value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        // 1. search 메소드를 이용해 교체할 노드를 얻는다.
        Node<E> replace_node = search(index);

        // 2. 교체할 노드의 요소를 변경한다.
        replace_node.item = null;
        replace_node.item = value;
    }

    public int indexOf(Object value) {
        Node<E> n = head;
        int i = 0;
        while (n != null) {
            if (Objects.equals(value, n.item)) {
                return i;
            }

            i++;
            n = n.next;
        }

        return -1;
    }

    public int lastIndexOf(Object value) {
        Node<E> n = tail;
        int i = size - 1;
        while (n != null) {
            if (Objects.equals(value, n.item)) {
                return i;
            }

            i--;
            n = n.prev;
        }

        return -1;
    }


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        // i.next가 null이 면 마지막을 의미하는거니, null 이 아닐때 까지 순회
        for (Node<E> i = head; i.next != null; ) {
            Node<E> next_node = i.next; // i에 관한 모든 값을 지울 것이기 때문에 미리 백업한다.

            i.item = null;
            i.prev = null;
            i.next = null;

            i = next_node;
        }

        head = null;
        tail = null;

        size = 0; // 모든 요소를 지웠으니 size도 초기화
    }

    public boolean contains(Object value) {
        return indexOf(value) != -1; // -1 이 아니라는 말은 요소가 리스트에 존재한다는 것이다.
    }

    @Override
    public String toString() {
        if (head == null) {
            return "[]";
        }

        Node<E> n = head;
        String result = "[";

        while (n.next != null) {
            result += n.item + ", ";
            n = n.next;
        }

        // n이 마지막일 경우 n.next가 null이니 루프문을 빠져나오게 되서 마지막 노드 삽입 처리를 해주어야 한다.
        result += n.item + "]";

        return result;
    }

    public String toString2() {
        if (head == null) {
            return "[]";
        }

        Node<E> n = head;
        StringBuilder result = new StringBuilder();

        result.append("[\n");

        for (int i = 0; i < size; i++) {

            result.append("  Node@").append(String.format("%-10s", n.hashCode())).append("  →  ");

            if (n.prev != null) {
                result.append("[").append(n.prev.hashCode()).append(" | ");
            } else {
                result.append("[").append("null").append(" | ");
            }

            result.append(n.item).append(" | ");

            if (n.next != null) {
                result.append(n.next.hashCode()).append("]");
            } else {
                result.append("null").append("]");
            }

            result.append(", \n");

            n = n.next;
        }

        result.append("]");

        return result.toString();
    }
}
