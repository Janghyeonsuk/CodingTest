package datastructure.queue;

import java.util.NoSuchElementException;

public class MyQueue<E> {
    int capacity;
    int front;
    int rear;
    Object[] queue;

    public MyQueue(int capacity) {
        this.capacity = capacity;
        this.front = 0;
        this.rear = 0;
        this.queue = new Object[capacity];
    }

    public boolean isFull() {
        return front == rear && queue[front] != null;
    }

    public boolean isEmpty() {
        return front == rear && queue[front] == null;
    }

    public void add(E data) throws Exception {
        if (isFull()) {
            System.out.println("큐에 더 이상 데이터를 저장할 공간이 없습니다.");
            throw new Exception();
        }
        queue[rear++] = data;
        rear = rear % queue.length;
    }

    @SuppressWarnings("unchecked")
    public E remove() {
        if (isEmpty()) {
            System.out.println("큐가 비어있습니다");
            throw new NoSuchElementException();
        }
        E removeData = (E) queue[front];
        queue[front++] = null;
        front = front % queue.length;

        return (E) removeData;
    }

    @SuppressWarnings("unchecked")
    public E element() {
        if (isEmpty()) {
            System.out.println("큐가 비어있습니다");
            throw new NoSuchElementException();
        }

        return (E) queue[front];
    }

    @SuppressWarnings("unchecked")
    public E peek() {
        if (isEmpty())
            return null;
        return (E) queue[front];
    }

    @SuppressWarnings("unchecked")
    public E back() {
        if (isEmpty())
            return null;
        return (E) queue[rear];
    }
}
