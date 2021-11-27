package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor>{
    private static final Instructors INSTANCE = new Instructors();
    private Instructors(){
        Instructor leon = new Instructor(1,"Leon");
        this.add(leon);
    }

    public Instructor[] toArray() {
        return this.personList.toArray(new Instructor[0]);
    }

    public static Instructors getInstance(){
        return Instructors.INSTANCE;
    }
}
