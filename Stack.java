package ru.itis.homework_for_24febr;


public class Stack<T> implements IStack<T>{
    Element<T> head;
    Element<T> current;
    private int size;

    @Override
    public T pop() {
        current = head;
        for (int i = 0; i < size - 1;i++) {
            current = current.next;
        }
        T last = current.value;
        current = head;
        for (int i = 0; i < size - 2; i++) {
            current = current.next;
        }
        current.next = null;
        size--;
        return last;
    }
    @Override
    public void push(T e) throws EmptyElementException{
        if (e == null) throw new EmptyElementException();

        if (head == null) {
            head = new Element<T>(e);
            head.next = null;
        } else {
            current = head;
            for (int i = 0; i < size - 1; i++) {
                current = current.next;
            }
            current.next = new Element<T>(e);
        }
        size++;
    }

    @Override
    public int getSize() {
        return size;
    }


}
