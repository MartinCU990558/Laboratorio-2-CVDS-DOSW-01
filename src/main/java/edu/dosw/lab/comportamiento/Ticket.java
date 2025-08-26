package edu.dosw.lab.comportamiento;
public class Ticket {
    private String description;
    private String level;
    private String priority;

    public Ticket(String description , String level , String priority){
        this.description = description;
        this.level = level;
        this.priority = priority;
    }

    public String getDescription(){
        return description;
    }
    public String getLevel(){
        return level;
    }
    public String getPriority(){
        return priority;
    }
    
}
