package org.example;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Germinal", 500, "Emila Zola", 1700);
        Book b2 = new Book("Kürk mantolu madonna", 250, "Sabahattin Ali", 1948);
        Book b3 = new Book("1984", 300, "George Orwell", 1950);
        Book b4 = new Book("Savaşçı", 600, "Doğan Cüceloğlu", 1996);
        Book b5 = new Book("Harry Potter", 450, "J. K. Rowling", 1990);

        TreeSet<Book> books=new TreeSet<>(new PageCompare());
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        Iterator<Book> it=books.iterator();
        while (it.hasNext()){
            System.out.println(it.next().getPage());
        }

        TreeSet<Book> books1=new TreeSet<>(new OrderName());
        books1.add(b1);
        books1.add(b2);
        books1.add(b3);
        books1.add(b4);
        books1.add(b5);
        Iterator<Book> it1=books1.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next().getName());
        }
    }
}