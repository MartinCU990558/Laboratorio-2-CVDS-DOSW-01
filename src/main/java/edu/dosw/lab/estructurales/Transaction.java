package edu.dosw.lab.estructurales;

public class Transaction {
    private double amount;
    private double convertedAmount;
    private String originBadge;

    public Transaction(String originBadge, double amount, double convertedAmount){
        this.originBadge = originBadge;
        this.amount = amount;
        this.convertedAmount = convertedAmount;
    }

    public double getAmount(){
        return amount;
    }

    public double getConvertedAmount(){
        return convertedAmount;
    }

    public String getOriginBadge(){
        return originBadge;
    }
}
