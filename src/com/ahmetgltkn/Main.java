package com.ahmetgltkn;

public class Main {

    public static void main(String[] args) {

        Author author = new Author("Victor Hugo", "Fransız");
        Author author2 = new Author("Reşat Nuri", "Türk");

        Book book = new Book("Sefiller", author ,1230);
        Book book2 = new Book("Çalıkuşu", author2,123);
        Book book3 = new Book("Yaprak Dökümü", author2,600);

        User user = new User("Ahmet","ahmetgltkn@","istanbul");
        User user2 = new User("Asım","asımkilic@","ankara");
        User user3 = new User("selika","selika@","antalya");

        LibraryWorker worker = new LibraryWorker("Tuğba", "müdür");

        LibrarySystem librarySystem = new LibrarySystem();
        librarySystem.addBook(book);
        librarySystem.addBook(book2);
        librarySystem.addBook(book3);
        librarySystem.removeBook(book2);
        librarySystem.removeBook(book3);
        librarySystem.removeBook(book);

        librarySystem.listBooks();

        librarySystem.addAuthor(author);
        librarySystem.addAuthor(author2);
        librarySystem.listAuthors();

        librarySystem.addUser(user);
        librarySystem.addUser(user2);
        librarySystem.addUser(user3);
        librarySystem.listUsers();


        librarySystem.addWorker(worker);
        librarySystem.listWorkers();

    }
}
