package edu.dosw.lab;
public class OldClient extends Client{
    public OldClient(){
        super("Frecuente");
    }
    @Override
    public double calculateDiscount(double total){
        return total * 0.1;
    }

}