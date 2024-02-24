package ru.itis.homework_for_24febr;

public class Set<T> implements ISet<T>{
    private Object[] mass;
    private int size;

    public Set() {
        mass = new Object[10];
        size = 0;
    }
    @Override
    public int getSize() {
        return size;
    }
    @Override
    public void add(T e) throws EmptyElementException, SameElementException {
        if (e == null) throw new EmptyElementException();

        if (size == mass.length) {
            Object[] temp = new Object[mass.length * 3];
            System.arraycopy(mass, 0, temp, 0, mass.length);
            mass = temp;
        }

        if (canBeAdded(e)) mass[size++] = (T)e;
    }

    public boolean canBeAdded(T e) throws SameElementException {
        for (int i = 0; i < size; i++) {
            if (e.equals(mass[i])) throw new SameElementException();
            return false;
        }
        return true;
    }
    @Override
    public boolean contains(T e){
        for (int i = 0; i < size; i++) {
            if (mass[i].equals(e)) return true;
        }
        return false;
    }
    @Override
    public void delete(int index) throws IndexOutOfBoundsException {
        if (index >= mass.length) throw new IndexOutOfBoundsException();
        Object[] arr = new Object[mass.length - 1];
        System.arraycopy(mass, 0, arr, 0, index);
        for (int i = index; i < arr.length; i++) {
            arr[i] = mass[i + 1];
        }
        mass = arr;
        size--;
    }
    @Override
    public Object[] asList() {
        return mass;
    }

}
