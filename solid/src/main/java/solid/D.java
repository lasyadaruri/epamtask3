package solid;


 public class D implements Vehicle1{

	    final int maxFuel;
	   int remainingFuel;
	     int power;

	    public D(final int maxFuel) {
	        this.maxFuel = maxFuel;
	        remainingFuel = maxFuel;
	    }
	    //@Override
	    public void accelerate1() {
	        power++;
	        remainingFuel--;
	    }
	}





	 class Driver {

	    private Vehicle1 veh;

	    public Driver(final Vehicle1 veh){
	        this.veh = veh;
	    }

	    public void increaseSpeed(){
	        veh.accelerate1();
	    }
	}



