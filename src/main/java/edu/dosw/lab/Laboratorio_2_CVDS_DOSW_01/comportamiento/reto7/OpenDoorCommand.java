package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.comportamiento.reto7;

public class OpenDoorCommand implements Command {
    private final Door door;

    public OpenDoorCommand(Door door) {
        this.door = door;
    }

    @Override
    public String execute() {
        if (door.isOpen()) {
            return "Puerta ya abierta";
        }
        door.open();
        return "Puerta abierta";
    }

    @Override
    public String undo() {
        if (!door.isOpen()) {
            return "Puerta ya cerrada";
        }
        door.close();
        return "Puerta cerrada";
    }

    @Override
    public String getDescription() {
        return "Abrir puerta";
    }
}
