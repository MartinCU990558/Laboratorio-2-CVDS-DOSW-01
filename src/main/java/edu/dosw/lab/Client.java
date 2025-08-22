public abstract class Client {
    private String type;

    public client(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public abstract double CalculateDiscount(double total) {}

}