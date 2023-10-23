package org.example;

public class DynamicArray<T> {
    int sizE = 0;
    int capacity = 10;
    T[] array;

    public DynamicArray() {
        this.array = (T[]) new Object[capacity];

    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
    }


    public void add(T data) {
        //int i=0;
        if (sizE >= capacity) {
            int newCapacity = (int) (capacity * 2);
            Object[] newArray = new Object[newCapacity];

            for (int i = 0; i < sizE; i++) {
                newArray[i] = array[i];
            }
            capacity = newCapacity;
            array = (T[]) newArray;
        }
        this.array[sizE] = data;
        sizE++;
    }

    //System.out.println(array[sizE]);


    public void size() {
        System.out.println("Dizinin eleman sayısı : " + sizE);
    }

    public void getCapacity() {
        System.out.println("Dizinin kapasitesi : " + capacity);
    }

    public T get(int data) {
        return array[data];
    }

    public void remove(int data) {

        /*for(int i = 0; i < sizE; i++) {
            if(array[i] == data) {*/
        for (int j = 0; j < (sizE - data - 1); j++) {
            array[data + j] = array[data + j + 1];
        }
        array[sizE - 1] = null;
        sizE--;

    }


    public void set(int index, T data) {
        array[index] = data;
    }

    private void grow() {
        int newCapacity = (int) (capacity * 2);
        T[] newArray = (T[]) new Object[newCapacity];

        for (int i = 0; i < capacity; i++) {
            newArray[i] = array[i];
        }
        T[] array = (T[]) new Object[newCapacity];
        capacity = newCapacity;
        for (int i = 0; i < capacity; i++) {
            array[i] = newArray[i];
        }
    }

    private void shrink() {

        int newCapacity = (int) (capacity / 2);
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < sizE; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = (T[]) newArray;
    }

    public String toString() {

        String string = "";

        for (int i = 0; i < capacity; i++) {
            string += array[i] + ", ";
        }
        if (string != "") {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        } else {
            string = "[]";
        }
        return string;
    }
}
