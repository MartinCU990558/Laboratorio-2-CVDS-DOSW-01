package edu.dosw.lab.creacionales.Reto3;

public class StrategyUsed implements StrategyCategory {

     @Override
    public int calculateSpeed(int baseSpeed){
        return baseSpeed - 10;
    }
    
    @Override
    public long calculatePrice(long basePrice){
        return (long) (basePrice * 0.5);
    }
    
    @Override
    public String equipment(){
        return "Equipamiento estándar usado";
    }
    
    @Override
    public double comfort(){
        return 7.0;
    }
}
    
