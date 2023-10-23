package org.example;
public class Main {
    public static void main(String[] args) {
        DynamicArray<String> dynamicArray=new DynamicArray<>();
        //System.out.println(dynamicArray.capacity);
        for (int i=0;i<25;i++){
            dynamicArray.add(Integer.toString(i) );
        }
        dynamicArray.set(1,"50");
        dynamicArray.size();
        dynamicArray.getCapacity();
        dynamicArray.remove(2);
        dynamicArray.size();
        System.out.println(dynamicArray.toString());
    }
}