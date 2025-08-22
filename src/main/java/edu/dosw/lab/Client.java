package edu.dosw.lab;

public abstract class Client {
    private String type;

    public Client(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public abstract double calculateDiscount(double total);

}