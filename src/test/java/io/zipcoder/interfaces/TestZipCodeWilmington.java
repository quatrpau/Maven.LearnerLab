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
        Assert.assertEquals(17, (double) studymap.get(Students.getInstance().findById(1)), 0.0);
    }
}
