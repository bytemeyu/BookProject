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

    }

    @Override
    public void closeBook() {

    }

    @Override
    public void leafThroughBook() {

    }

    @Override
    public void advancePageOfTheBook() {

    }

    @Override
    public void backPageOfTheBook() {

    }

    //details method?
}
