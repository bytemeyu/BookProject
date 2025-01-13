package com.bytemeyu.bookproject;

public interface Publication {
    public abstract void openBook();
    public abstract void closeBook();
    public abstract void leafThroughBook();
    public abstract void advancePageOfTheBook();
    public abstract void backPageOfTheBook();
    public abstract void getDetails();
}
