package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class TestZipCodeWilmington {
    @Test
    public void testHostLecture(){
        ZipCodeWilmington zcw = new ZipCodeWilmington();
        zcw.hostLecture(1,34);
        Map<Student,Double> studymap = zcw.getStudyMap();
        //since the test in testInstructor is run first; the expected value should actually be 34/2 + 4 which is 21
        Assert.assertEquals(21, (double) studymap.get(Students.getInstance().findById(1)), 0.0);
    }
}
