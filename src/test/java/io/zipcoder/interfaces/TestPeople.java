package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPeople {
    private People p;
    private Person o;
    @Before
    public void before(){
        p = new People();
        o = new Person(1,"2");
        p.add(o);
    }
    @Test
    public void testAdd(){
        before();
        Assert.assertTrue(p.contains(o));
    }
    @Test
    public void testRemove(){
        before();
        p.remove(o);
        Assert.assertFalse(p.contains(o));
    }
    @Test
    public void testFindById(){
        testAdd();
        Assert.assertEquals(o,p.findById(o.getId()));
    }
}
