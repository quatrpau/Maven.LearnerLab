package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    private final Students students = Students.getInstance();
    private final Instructors instructors = Instructors.getInstance();
    public void hostLecture(Educator teacher, double numberOfHours){
        teacher.lecture(students.toArray(),numberOfHours);
    }
    public void hostLecture(long id, double numberOfHours){
        instructors.findById(id).lecture(students.toArray(),numberOfHours);
    }
    public Map<Student,Double> getStudyMap(){
        Map<Student,Double> studyMap = new HashMap<Student, Double>();
        for(Student student:students.toArray()) {
            studyMap.put(student,student.getTotalStudyTime());
        }
        return studyMap;
    }
}
