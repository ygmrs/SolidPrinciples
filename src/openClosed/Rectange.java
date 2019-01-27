package openClosed;

public class Rectange implements Shape{

    private double length;
    private double width;

    @Override
    public double calculateArea() {
        return length * width;
    }

}
