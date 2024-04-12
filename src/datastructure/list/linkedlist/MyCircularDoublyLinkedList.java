package datastructure.list.linkedlist;

import java.util.NoSuchElementException;

public class MyCircularDoublyLinkedList<E> {

    private Node<E> head; // 노드의 첫 부분을 가리키는 레퍼런스
    private Node<E> tail; // 노드의 끝 부분을 가리키는 레퍼런스

    private int size; // 리스트 요소 갯수

    // 생성자
    public MyCircularDoublyLinkedList() {
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
            for (int i = size; i > index; i--) {
                n = n.prev;
            }
        }

        return n;
    }

    public void addFirst(E value) {

        // 1. head와 tail을 임시 백업함
        Node<E> first = head;
        Node<E> last = tail;

        // 2. 새 노드를 추가 (이때 첫번째 노드니까 prev는 null이 되고 next는 head가 가리키는 노드가 되게 된다)
        Node<E> new_node = new Node<>(null, value, first);

        // 3. 노드를 추가하였으니 리스트 크기 증가
        size++;

        // 4. 첫번째 기준이 변경되었으니 head를 삽입된 새 노드로 참조하도록 업데이트
        head = new_node;

        if (first == null) {
            // 5. 만일 빈 리스트에서 최초의 요소 추가였을 경우,
            tail = new_node; // tail도 첫째 노드를 바라보도록 업데이트

            // circular 처리
            new_node.next = new_node; // 추가 노드는 서로 자기 자신을 참조하게 됨
            new_node.prev = new_node;
        } else {
            // 6. 만일 빈 리스트가 아닐경우,
            first.prev = new_node; // 추가되기 이전 첫번째이었던 노드에서 prev를 새 노드로 참조하도록 업데이트

            // circular 처리
            last.next = new_node; // 마지막 노드의 next를 추가 노드를 바라보도록 참조
            new_node.prev = last; // 추가 노드(첫번째)의 prev를 마지막 노드를 바라보도록 참조
        }
    }

    public void addLast(E value) {

        // 1. head와 tail을 임시 백업함
        Node<E> first = head;
        Node<E> last = tail;

        // 2. 새 노드를 추가 (이때 마지막 노드니까 next는 null이 되고 prev는 tail이 가리키는 노드가 되게 된다)
        Node<E> new_node = new Node<>(last, value, null);

        // 3. 노드를 추가하였으니 리스트 크기 증가
        size++;

        // 4. 마지막 노드 기준이 변경되었으니 tail을 삽입된 새 노드로 참조하도록 업데이트
        tail = new_node;

        if (last == null) {
            // 5. 만일 빈 리스트에서 최초의 요소 추가였을 경우,
            head = new_node; // tail도 첫째 노드를 바라보도록 업데이트

            // circular 처리
            new_node.next = new_node; // 추가 노드는 서로 자기 자신을 참조하게 됨
            new_node.prev = new_node;
        } else {
            // 6. 만일 빈 리스트가 아닐경우,
            last.next = new_node; // 추가되기 이전 마지막이었던 노드에서 next를 새 노드로 참조하도록 업데이트

            // circular 처리
            first.prev = new_node; // 첫번째 노드의 prev를 추가 노드를 바라보도록 참조
            new_node.next = first; // 추가 노드(마지막)의 next를 첫번째 노드를 바라보도록 참조
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

        // 3. 두번째 노드와 마지막 노드를 임시 저장
        Node<E> first = head.next;
        Node<E> last = tail;

        // 4. 첫번째 노드의 내부 요소를 모두 삭제
        head.next = null;
        head.item = null;
        head.prev = null;

        // 5. 요소가 삭제 되었으니 크기 감소
        size--;

        // 6. head가 다음 노드를 가리키도록 업데이트
        head = first;

        if (first == null) {
            // 7. 만일 리스트의 유일한 값을 삭제해서 빈 리스트가 될 경우, tail도 null 처리
            tail = null;
        } else {
            // 8. 만일 빈 리스트가 아닐경우, circular 처리
            first.prev = last; // 삭제되기 이전 두번째 이었던 first가 첫번째 노드가 되니 prev를 마지막 노드에 연결
            last.next = first; // 마지막 노드의 next도 첫번째 노드인 first에 연결
        }

        // 9. 마지막으로 삭제된 요소를 반환
        return value;
    }

    public E removeLast() {

        // 1. 만약 삭제할 요소가 아무것도 없으면 에러
        if (tail == null) {
            throw new NoSuchElementException();
        }

        // 2. 삭제될 마지막 요소의 데이터를 백업
        E value = tail.item;

        // 3. 마지막 노드의 이전 노드와 첫번째 노드를 임시 저장
        Node<E> last = tail.prev;
        Node<E> first = head;

        // 4. 마지막 노드의 내부 요소를 모두 삭제
        tail.item = null;
        tail.prev = null;
        tail.next = null;

        // 5. 요소가 삭제 되었으니 크기 감소
        size--;

        // 6. tail이 이전 노드를 가리키도록 업데이트
        tail = last;

        if (last == null) {
            // 7. 만일 리스트의 유일한 값을 삭제해서 빈 리스트가 될 경우, head도 null 처리
            head = null;
        } else {
            // 8. 만일 빈 리스트가 아닐경우, circular 처리
            first.prev = last; // 삭제되기 이전 두번째 이었던 first가 첫번째 노드가 되니 prev를 마지막 노드에 연결
            last.next = first; // 마지막 노드의 next도 첫번째 노드인 first에 연결
        }

        // 9. 마지막으로 삭제된 요소를 반환
        return value;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "[]";
        }

        Node<E> n = head;
        String result = "[";

        // circular 연결 리스트는 노드의 next가 끝이 없기 때문에 인덱스 사이즈로 순회하여야 한다.
        for (int i = 0; i < size; i++) {
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

        int i = 0;
        while (i < size) {
            i++;

            result.append("  Node@").append(String.format("%-10s", n.hashCode())).append("  →  ");

            if (n.prev != null) {
                result.append("[").append(n.prev.hashCode()).append(" | ");
            } else {
                result.append("[").append(n.prev).append(" | ");
            }

            result.append(n.item).append(" | ");

            if (n.next != null) {
                result.append(n.next.hashCode()).append("]");
            } else {
                result.append(n.next).append("]");
            }

            result.append(", \n");

            n = n.next;
        }

        result.append("]");

        return result.toString();
    }
}
