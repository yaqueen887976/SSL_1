package com.yaqin.Static;

/*Given a database table “Book” with columns (id, isbn, name, author, publish date),
define a java class that matches this table and then use a static block to initialize
this table with some records*/

import java.util.Date;

public class Book {
    private static int id;
    private static String isbn;
    private static String name;
    private static String author;
    private static Date date;

    static Book book1 = new Book(1,"978-3-16-148410-0","Thinking in Java","Author1",new Date(2014, 02, 11));
    static Book book2 = new Book(2,"978-3-16-123456-2","Thinking in Python","Author2",new Date(2012, 03, 11));
    public Book(int id, String isbn, String name, String author, Date date){
        this.id = id;
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    /*
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return "id: "+getId() + " isbn: "+getIsbn() + " name: "+getName()+ " author: "+getAuthor()+ " date: "+dateFormat.format(getDate());
    }
    */
    @Override
    public String toString() {
       return ""+getId();
    }
}
