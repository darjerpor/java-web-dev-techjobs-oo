package org.launchcode.techjobs_oo.Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.launchcode.techjobs_oo.*;

public class JobTest {

    public static Job job1,job2,job3,job4,job5,job6,job7;

    @BeforeClass
    public static void makeJobInstances(){
        job1 = new Job();
        job2 = new Job();
        job3 = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        job4 = new Job("Frycook",
                new Employer("Krusty Krab"),
                new Location("Bikini Bottom"),
                new PositionType("Food Preparation"),
                new CoreCompetency("Patty Flipping"));
        job5 = new Job("Frycook",
                new Employer("Krusty Krab"),
                new Location("Bikini Bottom"),
                new PositionType("Food Preparation"),
                new CoreCompetency("Patty Flipping"));
        job6 = new Job("Frycook",
                new Employer("Krusty Krab"),
                new Location(null),
                new PositionType(null),
                new CoreCompetency("Patty Flipping"));
        job7 = new Job("Frycook",
                new Employer("Krusty Krab"),
                new Location(null),
                new PositionType(null),
                new CoreCompetency(null));
    }

    @Test
    public void testSettingJobId(){
        assertEquals(1,job1.getId());
        assertEquals(2,job2.getId());
        assertEquals(3,job3.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals("Product tester",job3.getName());
        assertEquals("ACME",job3.getEmployer().toString());
        assertEquals("Desert",job3.getLocation().getValue());
        assertEquals("Quality control",job3.getPositionType().getValue());
        assertEquals("Persistence",job3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        assertFalse(job4.equals(job5));
    }

    @Test
    public void testEmptyJobObjectToString(){
        assertEquals(("ID: "
                + "\nName: "
                + "\nEmployer: "
                + "\nLocation: "
                + "\nPosition Type: "
                + "\nCore Competency: " +"\n")
                ,job1.toString());

    }

    @Test
    public void testAllFieldsFullToString(){
        assertEquals(("ID: " + job5.getId()
                        + "\nName: " + job5.getName()
                        + "\nEmployer: " + job5.getEmployer().getValue()
                        + "\nLocation: " + job5.getLocation().getValue()
                        + "\nPosition Type: " + job5.getPositionType().getValue()
                        + "\nCore Competency: " + job5.getCoreCompetency().getValue() + "\n")
                ,job5.toString());
    }

    @Test
    public void testEmptyFieldsLeaveMessageToString() {
        assertEquals(("ID: " + job6.getId()
                        + "\nName: " + job6.getName()
                        + "\nEmployer: " + job6.getEmployer().getValue()
                        + "\nLocation: " + "Data not available"
                        + "\nPosition Type: " + "Data not available"
                        + "\nCore Competency: " + job6.getCoreCompetency().getValue() + "\n")
                ,job6.toString());
        assertEquals(("ID: " + job7.getId()
                        + "\nName: " + job7.getName()
                        + "\nEmployer: " + job7.getEmployer().getValue()
                        + "\nLocation: " + "Data not available"
                        + "\nPosition Type: " + "Data not available"
                        + "\nCore Competency: " + "Data not available" + "\n")
                , job7.toString());
    }
}
