package liskovSubstitution;

public class DevicesWithEngine extends TransportationDevice{

    Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void startEngine(){
        // starting engine
    }


}
