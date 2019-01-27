package liskovSubstitution;

public class Bicycle extends DevicesWithoutEngine{

    /*
    * Problem! Bicycle is a transportation device
    * but does not have engine.
    * */
    @Override
    public void startMoving(){
        //starting engine
    }
}
