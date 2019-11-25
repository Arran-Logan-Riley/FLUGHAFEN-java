public class AirPortActivities {
//takeoff method. when called it changes the aircraft activity status to takooff from taxi to take off Uses method below to verify where aircraft is.
    public String takeOff(Stirng whatAmIFlying){

    }

    //landing method

    //taxi method


    //find AirCraft method
    public Planes findAirCraft(String nameOfAircraft){ //this goes through planeSelectiojn and looks for the "nameOfAircraft" and returns the object of what your looking for
        for (Planes whatImflying: BumpkinAir.planeSelection) {
        if(whatImflying.getPlaneType() == nameOfAircraft){
            return whatImflying;
        }
        }
        return null;
    }
}
