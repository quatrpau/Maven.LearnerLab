package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void test(){
        Assert.assertTrue(Instructors.getInstance().contains(new Instructor(1,"Leon")));
    }
}
