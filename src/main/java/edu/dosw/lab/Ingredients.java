package edu.dosw.lab;

public class Ingredients {
  private final int price;
  private final String name;
  public Ingredients(String name, int price){
    this.price = price;
    this.name = name;
  }
  public String getName(){
    return name;
  }
  public int getPrice(){
    return price;
  }

}
