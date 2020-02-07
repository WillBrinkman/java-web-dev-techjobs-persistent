package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    public Skill(){

    }

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs;

    private String description;

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}