package datastructure.queue;

class Node<T> {
    Node<T> next = null;
    T data = null;
}

public class ListQueue<T> {
    Node<T> front = null;
    Node<T> rear = null;

    public boolean isEmpty() {
        return front == null;
    }

    public void add(T data) {
        Node<T> newNode = new Node<T>();
        newNode.data = data;

        if (isEmpty())
            front = newNode;
        else
            rear.next = newNode;
        rear = newNode;
    }

    public T remove() {
        if (isEmpty()) {
            throw new RuntimeException("큐가 비었습니다.");
        }

        T data = front.data;

        if (front == rear) {
            //큐에 노드가 1개인 경우
            front = null;
            rear = null;
        } else {
            //큐에 노드가 2개 이상인 경우
            front = front.next;
        }

        return data;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("큐가 비었습니다");
            return null;
        }

        return front.data;
    }
}
