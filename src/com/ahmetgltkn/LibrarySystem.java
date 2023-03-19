package com.ahmetgltkn;

import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    private List<Book>  books ;
    private List<Author> authors;
    private List<User> users;
    private List<LibraryWorker> libraryWorkers;

    public LibrarySystem() {
        books = new ArrayList<>();
        authors = new ArrayList<>();
        users = new ArrayList<>();
        libraryWorkers = new ArrayList<>();
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public void removeBook(Book book){
        this.books.remove(book);
    }

    public void addAuthor(Author author){
        this.authors.add(author);
    }
    public void addUser(User user){
        this.users.add(user);
    }
    public void removeUser(User user){
        this.users.remove(user);
    }

    public void addWorker(LibraryWorker libraryWorker){
        this.libraryWorkers.add(libraryWorker);
    }

    public void listBooks(){
        System.out.println("***********Kitaplar****************");
        for (Book book : this.books){
            book.printBookInfo();
        }
    }
    public void listAuthors(){
        System.out.println("***********Yazarlar****************");
        for (Author author : this.authors){
            author.printAuthorInfo();
        }
    }

    public void listUsers(){
        System.out.println("***********Kullanıcılar****************");
        for (User user : this.users){
            user.printUserInfo();
        }
    }

    public void listWorkers(){
        System.out.println("***********Kütüphane Çalışanları****************");
        for (LibraryWorker worker : this.libraryWorkers){
            worker.printWorkerInfo();
        }
    }
}
