package io.zipcoder.interfaces;

public final class Instructors extends People{
    private static final Instructors INSTANCE = new Instructors();
    private Instructors(){
        Instructor leon = new Instructor(1,"Leon");
        this.add(leon);
    }
    public static Instructors getInstance(){
        return Instructors.INSTANCE;
    }
}
