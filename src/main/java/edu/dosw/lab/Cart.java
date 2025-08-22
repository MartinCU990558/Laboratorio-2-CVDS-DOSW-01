package edu.dosw.lab;
import java.util.HashMap;
import java.util.Map;
public class Cart{
    public int quantity;
    private Map<Product,Integer> products = new HashMap<>();

    public Map<Product,Integer> getProducts(){
        return products;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getSubTotal(){
        return products.entrySet().stream().
                mapToDouble(e->e.getKey().getPrice()*e.getValue()).sum();
    }

}