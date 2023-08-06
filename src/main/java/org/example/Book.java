package org.example;

public class Book {
    String name;
    String id;
    String writer;

    public Book(String name, String id, String writer) {
        this.name = name;
        this.id = id;
        this.writer = writer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
