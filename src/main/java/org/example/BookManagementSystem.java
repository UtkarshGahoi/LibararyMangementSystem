package org.example;

import java.util.*;

public class BookManagementSystem {
    Book book;
    String userName;
    String userId;
    String toDate;
    String fromDate;



    public static Map<User,List<Book>> listList=new HashMap<>();

    public BookManagementSystem(Book book, String userName, String userId, String toDate, String fromDate) {
        this.book = book;
        this.userName = userName;
        this.userId = userId;
        this.toDate = toDate;
        this.fromDate = fromDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public Map<User, List<Book>> getListList() {
        return listList;
    }

    public void setListList(Map<User, List<Book>> listList) {
        this.listList = listList;
    }

    public static BookManagementSystem borrowBook(User user, Book book, String userName, String userId, String toDate, String fromDate){
        BookManagementSystem bookManagementSystem=new BookManagementSystem(book,userName,userId,toDate,fromDate);
        if(listList.containsKey(userName)){
            List<Book> books = listList.get(userName);
            books.add(book);
            listList.put(user,books);
        }
        else{
            List<Book>list=new ArrayList<>();
            list.add(book);
            listList.put(user,list);
        }
        return bookManagementSystem;
    }

    public static Map<User,List<Book>> getAllBooking(){
        return listList;
    }

}
