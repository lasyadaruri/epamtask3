package solid;

public class O {
	



	    public int power;
	    public int suspensionHeight;

	    public int getPower() {
	        return power;
	    }

	    public int getSuspensionHeight() {
	        return suspensionHeight;
	    }

	    public void setPower(final int power) {
	        this.power = power;
	    }

	    public void setSuspensionHeight(final int suspensionHeight) {
	        this.suspensionHeight = suspensionHeight;
	    }

	}








 class EventHandler extends O {

	    private O vehicle;

	    public EventHandler(final O vehicle) {
	        this.vehicle = vehicle;
	    }

	    public void changeDrivingMode(final DrivingMode drivingMode){
	        vehicle.setPower(drivingMode.getPower());
	        vehicle.setSuspensionHeight(drivingMode.getSuspensionHeight());
	        // now, when we need to add another mode (e.g. ECONOMY) just create a new class: Economy.
	    }
	}




	 class Comfort implements DrivingMode {

	    private static final int POWER = 400;
	    private static final int SUSPENSION_HEIGHT = 20;

	   // @Override
	    public int getPower() {
	        return POWER;
	    }

	   // @Override
	    public int getSuspensionHeight() {
	        return SUSPENSION_HEIGHT;
	    }
	}

	
		 class Sport implements DrivingMode {

		    private static final int POWER = 500;
		    private static final int SUSPENSION_HEIGHT = 10;

		   //@Override
		    public int getPower() {
		        return POWER;
		    }

		    public int getSuspensionHeight() {
		        return SUSPENSION_HEIGHT;

	}
		}


			 class Economy implements DrivingMode{

			    private static final int POWER = 300;
			    private static final int SUSPENSION_HEIGHT = 20;

			   // @Override
			    public int getPower() {
			        return POWER;
			    }

			   // @Override
			    public int getSuspensionHeight() {
			        return SUSPENSION_HEIGHT;
			    }
			}



