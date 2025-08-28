package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.comportamiento.reto7;

public class TurnOnLightCommand implements Command {
    private final Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public String execute() {
        if (light.isOn()) {
            return "Luz ya encendida";
        }
        light.turnOn();
        return "Luz encendida";
    }

    @Override
    public String undo() {
        if (!light.isOn()) {
            return "Luz ya apagada";
        }
        light.turnOff();
        return "Luz apagada";
    }

    @Override
    public String getDescription() {
        return "Encender luz";
    }
}
