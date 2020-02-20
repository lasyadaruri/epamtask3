package solid;

	

	public class I extends Vehicle implements RadioSwitch {

	    private boolean radioOn;

	    public boolean isRadioOn() {
	        return radioOn;
	    }

	    //@Override
	    public void turnRadioOn() {
	        radioOn = true;
	    }

	    //@Override
	    public void turnRadioOff() {
	        radioOn = false;
	    }
	}






	

 abstract class Vehicle implements EngineSwitch {

    private boolean engineRunning;

    public boolean isEngineRunning() {
        return engineRunning;
    }

    //@Override
    public void startEngine() {
        engineRunning = true;
    }

    //@Override
    public void shutDownEngine() {
        engineRunning = false;
    }

}


 


	 class Drone extends Vehicle implements CameraSwitch {

	    private boolean cameraOn;

	    public boolean isCameraOn() {
	        return cameraOn;
	    }

	   // @Override
	    public void turnCameraOn() {
	        cameraOn = true;
	    }

	   // @Override
	    public void turnCameraOff() {
	        cameraOn = false;
	    }
	}








