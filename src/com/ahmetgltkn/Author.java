package com.ahmetgltkn;

public class Author {
    private String name;
    private String nationality;

    public Author(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void printAuthorInfo(){
        System.out.println("Yazar Adı: " + name);
        System.out.println("Milliyeti: " + nationality);
        System.out.println();
    }
}
