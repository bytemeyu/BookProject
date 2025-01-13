package com.bytemeyu.bookproject;

import com.bytemeyu.bookproject.book.Book;
import com.bytemeyu.bookproject.person.Person;

public class BookProject {
    public static void main(String[] args) {
        Person person1 = new Person("Anita", 29, "feminino");
        person1.currentStatus();
        person1.haveABirthday();
        person1.currentStatus();

        Book book1 = new Book("A Mulher de Trinta Anos", "Balzac", 300);
        book1.setReader(person1);
        book1.getDetails();
    }
}