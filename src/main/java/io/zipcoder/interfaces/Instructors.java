package io.zipcoder.interfaces;

public final class Instructors extends People{
    private static final Instructors INSTANCE = new Instructors();
    private Instructors(){
        this.add(new Instructor(1,"Leon"));
    }
    public static Instructors getInstance(){
        return Instructors.INSTANCE;
    }
}
