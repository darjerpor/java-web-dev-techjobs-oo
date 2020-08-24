package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job(){
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString(){
        String line1 = "ID: ";
        String line2 = "\nName: ";
        String line3 = "\nEmployer: ";
        String line4 = "\nLocation: ";
        String line5 = "\nPosition Type: ";
        String line6 = "\nCore Competency: ";

        //If all fields other than id are null, return empty fields
        if(name == null && employer == null && location == null &&
                positionType == null && coreCompetency == null){

            return(line1 + line2 + line3 + line4 + line5 + line6 + "\n");

        }else{ //if the field is not empty or null, add to appropriate line
                    //else, if the field is empty, add "Data not available" string to appropriate line
            if(name != null && name != ""){
                line1 += id;
                line2 += name;
            }else {
                line1 += id;
                line2 += "Data not available";
            }
            if(employer.getValue() != null && employer.getValue() != ""){
                line3 += employer.getValue();
            }else{
                line3 += "Data not available";
            }
            if(location.getValue() != null && location.getValue() != ""){
                line4 += location.getValue();
            }else{
                line4 += "Data not available";
            }
            if(positionType.getValue() != null && positionType.getValue() != ""){
                line5 += positionType.getValue();
            }else{
                line5 += "Data not available";
            }
            if(coreCompetency.getValue() != null && coreCompetency.getValue() != ""){
                line6 += coreCompetency.getValue();
            }else{
                line6 += "Data not available";
            }
            return (line1 + line2 + line3 + line4 + line5 + line6 + "\n");
        }

    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
