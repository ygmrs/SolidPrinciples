package openClosed;

public class Circle implements Shape{

    private double radius;

    @Override
    public double calculateArea() {
        return (22/7) * radius * radius;
    }

}
