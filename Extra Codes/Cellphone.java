
public class Cellphone {
    String brand;
    String color;
    double size;
    double price;
    boolean secondHand;
    
    public Cellphone(){
        this.brand = "Samsung";
        this.color = "Black";
        this.size = 6.5;
        this.price = 30999.00;
        this.secondHand = false;
    }
    
    public Cellphone(String brand, String color, double size, double price, boolean secondHand){
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
        this.secondHand = secondHand;
    }
    
    public String getBrand(){
        return this.brand;
    } 

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSecondHand() {
        return secondHand;
    }

    public void setSecondHand(boolean secondHand) {
        this.secondHand = secondHand;
    }
    
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public void takePhoto(){
        System.out.println("Capturing image ...");
    }
}
