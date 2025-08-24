package edu.dosw.lab.solid.Reto1;
import java.util.HashMap;
import java.util.Map;
public class Cart{
    private int quantity;
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

    public void putProduct(Product product,int quantity){
        products.put(product,quantity);

    }

}