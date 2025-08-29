package edu.dosw.lab.creacionales.Reto3;

public class StrategyEconomic implements StrategyCategory {
    @Override
    public int calculateSpeed(int speed){
        return speed - 20;
    }

    @Override
    public long calculatePrice(long price){
        return (long)(price * 0.6);
    }

    @Override
    public String equipment(){
        return "Aire acondicionado básico";
    }

    @Override
    public double comfort(){
        return 6.0;
    }
}
