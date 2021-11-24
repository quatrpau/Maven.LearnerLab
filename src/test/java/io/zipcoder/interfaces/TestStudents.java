package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestStudents {
    @Test
    public void test(){
        Assert.assertTrue(Students.getInstance().contains(new Student(1,"Paul")));
    }
}
