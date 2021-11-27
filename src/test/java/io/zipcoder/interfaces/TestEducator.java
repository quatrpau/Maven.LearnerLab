package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestEducator {
    private Student s;
    @Before
    public void before(){
        s = new Student(1,"Paul");
    }
    @Test
    public void testImplementation(){
        Assert.assertTrue(Educator.LEON instanceof Teacher);
    }
    @Test
    public void testTeach(){
        before();
        Educator.LEON.teach(s,1231);
        Assert.assertEquals(1231, (double) s.getTotalStudyTime(), 0.0);
    }
    @Test
    public void testLecture(){
        //apparently Students.getInstance() is a non-static context
        Educator.LEON.lecture(Students.getInstance().toArray(),8);
        Assert.assertEquals(4,Students.getInstance().findById(1).getTotalStudyTime(),0.0);
    }
}
