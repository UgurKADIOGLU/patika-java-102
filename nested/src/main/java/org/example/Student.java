package org.example;

public class Student<T> implements IDataBase<T>{

    @Override
    public boolean add(T data) {
        System.out.println("Veri eklendi.");
        return false;
    }

    @Override
    public boolean delete(T data) {
        return false;
    }

    @Override
    public boolean update(T data) {
        return false;
    }

    @Override
    public T select() {
        return null;
    }
}
