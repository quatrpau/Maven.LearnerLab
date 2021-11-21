package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestStudent {
    private Student student;
    @Before
    public void before(){
        student = new Student(12,"dsf");
    }
    @Test
    public void testImplementation(){
        before();
        Assert.assertTrue(student instanceof Learner);
    }
    @Test
    public void testInheritance() {
        before();
        Assert.assertTrue(student instanceof Person);
    }
    @Test
    public void testLearn(){
        before();
        double expected = 34;
        student.learn(34);
        Assert.assertEquals(expected, student.getTotalStudyTime(), 0.0);
    }
}
