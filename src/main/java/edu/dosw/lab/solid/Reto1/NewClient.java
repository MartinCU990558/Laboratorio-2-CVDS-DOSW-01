package edu.dosw.lab.solid.Reto1;

public class NewClient extends Client{
    public NewClient(){
        super("Nuevo");
    }
    @Override
    public double calculateDiscount(double total){
        return total * 0.05;
    }

}