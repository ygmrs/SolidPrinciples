package dependencyInversion;

public class LightBulb implements Switchable{

    @Override
    public void turnOn(){
        System.out.println("LightBulb: Bulb turn on...");
    }

    @Override
    public void turnOff(){
        System.out.println("LightBulb: Bulb turn off...");
    }

}
