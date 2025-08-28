package edu.dosw.lab.comportamiento.Reto6;

enum Priority {
    BAJA(2), MEDIA(3), ALTA(4);

    private final int level;
    Priority(int level){ 
        this.level = level; 
    }

    public int getLevel(){ 
        return level; 
    }
}