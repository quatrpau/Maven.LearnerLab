package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    private final Students students = Students.getInstance();
    private final Instructors instructors = Instructors.getInstance();
    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture((Student[]) students.toArray(),numberOfHours);
    }
    public void hostLecture(long id, double numberOfHours){
        ((Teacher) instructors.findById(id)).lecture((Student[]) students.toArray(),numberOfHours);
    }
    public Map<Student,Double> getStudyMap(){
        //is the only way to get learner from the person array to cast?
        Map<Student,Double> studyMap = new HashMap<Student, Double>();
        for(Student student: (Student[])students.toArray()){
            studyMap.put(student,student.getTotalStudyTime());
        }
        return studyMap;
    }
}
