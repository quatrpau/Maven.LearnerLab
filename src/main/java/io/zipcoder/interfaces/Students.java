package io.zipcoder.interfaces;

public final class Students extends People<Student> {
    private static final Students INSTANCE = new Students();
    private Students(){
        Student p = new Student(1,"Paul");
        Student p2 = new Student(2, "Paul 2");
        this.add(p);
        this.add(p2);
    }
    @Override
    public Student[] toArray() {
        return this.personList.toArray(new Student[0]);
    }

    public static Students getInstance(){
        return Students.INSTANCE;
    }
}
