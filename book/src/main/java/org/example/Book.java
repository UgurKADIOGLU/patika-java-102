package org.example;

import java.util.Date;

public class Book {
    private String name;
    private int page;
    private String authorName;
    private int developTime;

    public Book(String name, int page, String authorName, int developTime) {
        this.name = name;
        this.page = page;
        this.authorName = authorName;
        this.developTime = developTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getDevelopTime() {
        return developTime;
    }

    public void setDevelopTime(int developTime) {
        this.developTime = developTime;
    }
}
