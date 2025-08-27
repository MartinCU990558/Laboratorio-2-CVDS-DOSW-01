package edu.dosw.lab.comportamiento.Reto6;

public class Ticket {
    private String description;
    private Difficult level;
    private Priority priority;
    private String result = "";  
    private String technicianName;

    public Ticket(String description, Difficult level, Priority priority){
        this.description = description;
        this.level = level;
        this.priority = priority;
    }

    public String getDescription(){ 
        return description; 
    }

    public Difficult getLevel(){ 
        return level; 
    }

    public Priority getPriority(){ 
        return priority; 
    }

    public String getResult(){ 
        return result; 
    }

    public String getTechnicianName(){ 
        return technicianName; 
    }
    
    public void setTechnicianName(String technicianName){
        this.technicianName = technicianName;
    }

    public void setSolve(String technician){
        this.technicianName = technician;     
        this.result += (this.result.isEmpty() ? "" : " ") + technician + " resolvió el problema.";
    }

    public void addResult(String msg){
        this.result += (this.result.isEmpty() ? "" : " ") + msg;
    }
}
