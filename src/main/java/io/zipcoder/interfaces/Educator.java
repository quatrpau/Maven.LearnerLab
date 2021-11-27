package io.zipcoder.interfaces;
//enum implementation?
public enum Educator implements Teacher {
    LEON(1);
    final Instructor instruct;
    int id;
    double timeWorked = 0;
    Educator(int id){
        this.id = id;
        instruct = new Instructor(id,this.name());
        this.adder(instruct);
    }
    private void adder(Instructor instruct){
        Instructors.getInstance().add(instruct);
    }
    public double getTimeWorked(){
        return timeWorked;
    }
    public void teach(Learner learner,double numberOfHours){
        instruct.teach(learner,numberOfHours);
        timeWorked+=numberOfHours;
    }
    public void lecture(Learner[] learners, double numberOfHours){
        instruct.lecture(learners,numberOfHours);
        timeWorked+=numberOfHours;
    }
}
