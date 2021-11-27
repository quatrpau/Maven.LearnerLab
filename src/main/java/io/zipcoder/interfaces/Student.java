package io.zipcoder.interfaces;
//how does using what you are extending as the type you are programming against work?
public class Student extends Person implements Learner {
    private double totalStudyTime = 0;
    public Student(long id, String name){
        super(id,name);
    }
    public void learn(double numberOfHours) {
        totalStudyTime+=numberOfHours;
    }

    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}
