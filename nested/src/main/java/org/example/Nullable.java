package org.example;

public class Nullable<T extends Number> {
    private final T value;

    public Nullable(T value) {
        this.value = value;
    }
    public T getValue(){
        return this.value;
    }
    public boolean isNull(){
        return this.getValue()==null;
    }
    public void run(){
        if (isNull()){
            System.out.println("Bu değişken null dır.");
        }else {
            System.out.println(this.getValue());
        }
    }
}
