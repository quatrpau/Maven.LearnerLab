package io.zipcoder.interfaces;

public final class Students extends People {
    private static final Students INSTANCE = new Students();
    private Students(){
        Person p = new Student(1,"Paul");
        Person p2 = new Student(2, "Paul 2");
        this.add(p);
        this.add(p2);
    }
    public static Students getInstance(){
        return Students.INSTANCE;
    }
}
