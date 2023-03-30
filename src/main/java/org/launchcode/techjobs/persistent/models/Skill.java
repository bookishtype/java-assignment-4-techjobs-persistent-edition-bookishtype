package org.launchcode.techjobs.persistent.models;


import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {


    private String description;

    /* This field has a many-to-many type relationship with skills.You’ll need to add the
    @ManyToMany annotation with an argument mappedBy="skills" to configure this mapping.
    */
    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();


    public Skill(){
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }


}