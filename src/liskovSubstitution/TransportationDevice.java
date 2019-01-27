package liskovSubstitution;

public class TransportationDevice {

    String name;
    double speed;

    /*
    * The solution to these problems is a correct inheritance hierarchy
    * by the aid of distinct engine class like deviceWithEngine and
    * deviceWithoutEngine.
    * */

//    Engine engine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

//    public Engine getEngine() {
//        return engine;
//    }
//
//    public void setEngine(Engine engine) {
//        this.engine = engine;
//    }
//
//    public void startEngine(){
//        //starting engine
//    }


}
