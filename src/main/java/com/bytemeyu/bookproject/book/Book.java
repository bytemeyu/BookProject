package com.bytemeyu.bookproject.book;

import com.bytemeyu.bookproject.Publication;
import com.bytemeyu.bookproject.person.Person;

public class Book implements Publication {
    private String title;
    private String author;
    private int totalPages;
    private int currentPage;
    private boolean opened;
    private Person reader;

    public Book(String title, String author, int totalPages) {
        setTitle(title);
        setAuthor(author);
        setTotalPages(totalPages);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public boolean isOpened() {
        return opened;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
    }

    public Person getReader() {
        return reader;
    }

    public void setReader(Person reader) {
        this.reader = reader;
    }

    @Override
    public void openBook() {
        this.setOpened(true);
        System.out.println(this.getTitle() + "was opened.");
    }

    @Override
    public void closeBook() {
        this.setOpened(false);
        System.out.println(this.getTitle() + "was closed.");
    }

    @Override
    public void leafThroughBook() {

    }

    @Override
    public void advancePageOfTheBook() {
        int currentPage = this.getCurrentPage();
        this.setCurrentPage(currentPage + 1);
        System.out.println("We were on page " + currentPage + ", now we are on page " + this.getCurrentPage() + ".");
    }

    @Override
    public void backPageOfTheBook() {
        int currentPage = this.getCurrentPage();
        this.setCurrentPage(currentPage - 1);
        System.out.println("We were on page " + currentPage + ", now we are on page " + this.getCurrentPage() + ".");
    }

    @Override
    public void getDetails() {
        String bookDetails =
                "---------\n" +
                "Book Title: " + this.getTitle() + "\n" +
                "Book Author: " + this.getAuthor() + "\n" +
                "Total Pages: " + this.getTotalPages() + "\n" +
                "Current Page: " + this.getCurrentPage() + "\n" +
                "Is it open? " + this.isOpened() + "\n" +
                "Reader: " + this.getReader().getName() + "\n" +
                        "---------\n";

        System.out.println(bookDetails);
    }
}
