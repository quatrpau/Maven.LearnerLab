package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestInstructor {
    private Student s;
    private Instructor i;
    @Before
    public void before(){
        s = new Student(123,"");
        i = new Instructor(123,"");
    }
    @Test
    public void testImplementation() {
        before();
        Assert.assertTrue(i instanceof Teacher);
    }
    @Test
    public void testInheritance(){
        before();
        Assert.assertTrue(i instanceof Person);
    }
    @Test
    public void testTeach(){
        before();
        double e = 2;
        i.teach(s,e);
        Assert.assertEquals(e,s.getTotalStudyTime(),0);
    }
    @Test
    public void testLecture(){
        before();
        double e = 2;
        i.lecture(new Student[]{s, new Student(1232, "")},4);
        Assert.assertEquals(e,s.getTotalStudyTime(),0);

    }
}
