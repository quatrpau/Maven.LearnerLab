package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        long eid = 123;
        String en = "";
        Person person = new Person(eid, en);
        Assert.assertEquals(eid,person.getId());
        Assert.assertEquals(en, person.getName());
    }
    @Test
    public void testSetName(){
        String en = "";
        Person p = new Person(123, "asdf");
        p.setName(en);
        Assert.assertEquals(en,p.getName());
    }
}
