public class Planes {
    //properties


    private String planeType;
    private int fuelLevel;
    private int passengerCount;
    private String flightStatus;
    private String location;
    private String AirPortActivity;
    private int MaxPassengers;
    private String LandingGearStatus;

    //constructor
    public Planes(String planeType, String flightStatus, String location, int MaxPassengers){
        this.planeType = planeType;
        this.flightStatus = flightStatus;
        this.fuelLevel = 0;
        this.passengerCount = 0;
        this.location = location;
        this.AirPortActivity = "";
        this.MaxPassengers = MaxPassengers;
        this.LandingGearStatus = "Deployed";
    }

    //methods
    //set planeType--------------//S
    public void setPlaneType(String planeType){
        this.planeType = planeType;
    }
    //getPlaneType--------------//G
    public String getPlaneType(){
        return this.planeType;
    }

    //set flightStatus--------------//S
    public void setFlightStatus(String E){
        this.flightStatus = E;
    }
    //getFlightStatus--------------//G
    public String getFlightStatus(){
        return  this.flightStatus;
    }

    //setPassenger count--------------//S
    public void setPassengerCount(int passengerCount1){
        this.passengerCount = passengerCount1;
    }

    //getPassenger count--------------//G
    public int getPassengerCount(){
        return this.passengerCount;
    }

    //setFuelLevel--------------//S
    public void setFuelLevel(int eheheh){
        this.fuelLevel = eheheh;
    }

    //getFuelLevel--------------//G
    public int getFuelLevel(){
        return this.fuelLevel;
    }

    //settingLocation----------//S
    public void setLocation(String locationE){
        this.location = locationE;
    }
    //getLocation
    public String getLocation(){
        return this.location;
    }

    //setAirport Activity----------//S
    public void setAirPortActivity(String flightActivit){ this.AirPortActivity = flightActivit; }

    //getAirPort Activity--------------//G
    public String getAirPortActivity (){return this.AirPortActivity; }

    //getMaxPassengers Activity----------//S
    public int getMaxPassengers(){return  this.MaxPassengers;}


    //setLanding gear
    public void setLandingGearStatus(String landingGearStatus){this.LandingGearStatus = landingGearStatus;}

    //getLanding gear
    public String getLandingGearStatus(){return this.LandingGearStatus;}
}
