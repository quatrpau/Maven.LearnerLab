package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPeople {
    private People<Student> s;
    private Student o;
    @Before
    public void before(){
        o = new Student(707,"2");
        s = Students.getInstance();
    }
    @Test
    public void addTest(){
        before();
        //do not fully understand why adding here would affect removeTest although it may have something to do with
        //static status.
        s.add(o);
        Assert.assertTrue(s.contains(o));
        after();
        //this resets the list to its original state
    }
    @Test
    public void removeTest(){
        before();
        s.add(o);
        s.remove(o);
        Assert.assertFalse(s.contains(o));
    }
    @Test
    public void findByIdTest(){
        before();
        s.add(o);
        Assert.assertEquals(o,s.findById(o.getId()));
        after();
    }
    @After
    public void after(){
        s.remove(o);
    }
    //tests execute in alphabetical order?
}
