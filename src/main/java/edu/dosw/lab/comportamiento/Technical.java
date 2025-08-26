package edu.dosw.lab.comportamiento;

public abstract class Technical {
    private String name;
    protected Technical nextTechnical; 
    public Technical(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setNextTechnical(Technical nextTechnical) {
        this.nextTechnical = nextTechnical;
    }

    public abstract boolean isResolve(Ticket ticket);
}

