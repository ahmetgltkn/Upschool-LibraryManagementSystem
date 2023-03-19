package com.ahmetgltkn;

public class Book {
    private String title;
    private Author author;
    private int pageCount;


    public Book(String title, Author author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title ;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void printBookInfo(){
        System.out.println("Kitap Adı: " + title);
        System.out.println("Yazar: " + author.getName());
        System.out.println("Sayfa sayısı: " + pageCount);
        System.out.println();
    }
}
