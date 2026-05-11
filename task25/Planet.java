package task25;

public class Planet {
    boolean isGas;

    long distanceFromSun;

    public Planet(boolean isGas, long distanceFromSun){
        this.isGas = isGas;
        this.distanceFromSun = distanceFromSun;
    }

    @Override
    public String toString(){
        return "Is gas: " + isGas + "; distance: " + distanceFromSun;
    }
}

