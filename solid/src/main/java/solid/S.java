package solid;

public class S {
	

	    public void reFuel(final Vehicle2 vehicle){
	        final int remainingFuel = vehicle.getRemainingFuel();
	        final int additionalFuel = vehicle.getMaxFuel() - remainingFuel;
	        vehicle.setRemainingFuel(remainingFuel + additionalFuel);
	    }

}



 class Vehicle2{

    private final int maxFuel;
    private int remainingFuel;

    public Vehicle2(final int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }
    public void setRemainingFuel(final int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }

    public void accelerate() {
        remainingFuel--;
    }
}





