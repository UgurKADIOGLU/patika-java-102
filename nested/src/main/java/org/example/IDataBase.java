package org.example;

public interface IDataBase <T>{
    public boolean add(T data);
    public boolean delete(T data);
    public boolean update(T data);
    public T select();

}
