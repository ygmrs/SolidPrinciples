package interfaceSegregation;

public class ToyCar implements Toy, Moveable{

    double price;
    String color;

    @Override
    public void move() {
        System.out.println("Toycar: start moving car.");
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return "ToyCar: Moveable Toy car - Price: " + price + " Color: " + color;
    }
}
