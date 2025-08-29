package edu.dosw.lab.creacionales.Reto3;

public class StrategyLuxury implements StrategyCategory{

     @Override
    public int calculateSpeed(int baseSpeed){
        return baseSpeed + 30;
    }
    
    @Override
    public long calculatePrice(long basePrice){
        return (long) (basePrice * 2); 
    }
    
    @Override
    public String equipment(){
        return "Aire acondicionado + GPS";
    }
    
    @Override
    public double comfort(){
        return 9.5;
    }
}
    

