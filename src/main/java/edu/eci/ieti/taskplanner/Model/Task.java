package edu.eci.ieti.taskplanner.Model;

import java.util.Date;

/**
 *
 */
public class Task {

    private String id;
    private String owner;
    private String description;
    private String responsible;
    private Date dueDate;

    public Task(String id, String owner, String description, String responsible, Date dueDate) {
        this.id = id;
        this.owner = owner;
        this.description = description;
        this.responsible = responsible;
        this.dueDate = dueDate;
    }

    public String getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
