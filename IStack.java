package ru.itis.homework_for_24febr;

public interface IStack<T>{
    T pop();

    void push(T e) throws EmptyElementException;
    int getSize();
}
