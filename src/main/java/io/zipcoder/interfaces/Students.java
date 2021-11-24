package io.zipcoder.interfaces;

public final class Students extends People {
    private static final Students INSTANCE = new Students();
    private Students(){
        this.add(new Student(1,"Paul"));
    }
    public static Students getInstance(){
        return Students.INSTANCE;
    }

}
