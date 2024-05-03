public class Gadget {
    private String model;
    private double price;
    private int weight;
    private String size;
    
    public Gadget(String model, double price, int weight, String size) {
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.size = size;
    }
    
    public String getModel() {
        return model;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public String getSize() {
        return size;
    }

    
}
