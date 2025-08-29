package edu.dosw.lab.comportamiento.Reto7;

public class CommandDoors implements Command {
    private Doors door;
    private boolean open;
    private String user;

    public CommandDoors(Doors door, boolean isOpen, String user) {
        this.door = door;
        this.open = isOpen;
        this.user = user;
    }

    @Override
    public void execute() {
        if (open) {
            door.openDoor();
        } else {
            door.closeDoor();
        }
    }
    
    @Override
    public void undo() {
        if (open) {
            door.closeDoor();
        } else {
            door.openDoor();
        }
    }
    
    @Override
    public String getUser() {
        return user;
    }
    
    @Override
    public String getDescription() {
        return open ? "Abrir puerta" : "Cerrar puerta";
    }
}