package com.xyzcorp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProspectTest {

    @Test
    public void testHealthyYoungProspectAsARisk1() {
        Prospect prospect = new Prospect();
        prospect.setBirthDate(1993, 2,1);
        prospect.setCurrentDate(2016, 5, 17);
        assertEquals(prospect.getRisk(), 1);
    }

    @Test
    public void testHealthyMiddleAgeProspectAsARisk2() {
        Prospect prospect = new Prospect();
        prospect.setBirthDate(1976, 2,1);
        prospect.setCurrentDate(2016, 5, 17);
        assertEquals(prospect.getRisk(), 2);
    }
}
