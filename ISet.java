package ru.itis.homework_for_24febr;

public interface ISet<T>{

    int getSize();

    void add(T e) throws EmptyElementException, SameElementException;

    boolean contains(T e);

    void delete (int index) throws IndexOutOfBoundsException;

    Object[] asList();

}
