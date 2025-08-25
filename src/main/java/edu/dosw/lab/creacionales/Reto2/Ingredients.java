package edu.dosw.lab.creacionales.Reto2;

public class Ingredients {
  private final Double price;
  private final String name;
  public Ingredients(String name, Double price){
    this.price = price;
    this.name = name;
  }
  public String getName(){
    return name;
  }
  public Double getPrice(){
    return price;
  }

}
