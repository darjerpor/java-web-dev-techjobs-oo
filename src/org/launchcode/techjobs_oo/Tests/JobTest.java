package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.launchcode.techjobs_oo.Job;

public class JobTest {

    public Job job1,job2;

    @Before
    public void makeJobInstances(){
        job1 = new Job();
        job2 = new Job();
    }


    @Test public void testSettingJobId(){
        assertEquals(1,job1.getId());
        assertEquals(2,job2.getId());
    }


}
