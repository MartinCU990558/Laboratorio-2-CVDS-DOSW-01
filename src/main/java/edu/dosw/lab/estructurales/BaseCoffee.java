package edu.dosw.lab.estructurales;

public class BaseCoffee extends Coffee{
    @Override
    public double getPrice(){
        return 2000;
    }
    @Override
    public String getDescription(){
        return "Cafe Base";
    }
}