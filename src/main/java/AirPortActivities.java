public class AirPortActivities {
//takeoff method. when called it changes the aircraft activity status to takooff from taxi to take off Uses method below to verify where aircraft is.
    public void takeOff(String whatAmIFlying){

    findAirCraft(whatAmIFlying).setAirPortActivity("--TAKING OFF--"); //since this is an objhect you can change its chariteristics on the fly (pun intended)
        System.out.println(String.format("%s taking off MSX DB", whatAmIFlying)); //this prints out what "what am i flying" which could be an a380 for eg

        //takes fuel away thing to implement
    }

    //LANDING METHOD--------------------------------------------------------------------------------//
    public void Landing(String whatAmIFlying){ //sets airport activity to landing
        findAirCraft(whatAmIFlying).setAirPortActivity("--LANDING--");
        System.out.println(String.format("%s landing MSX DB", whatAmIFlying));
    }

    //TAXI METHOD--------------------------------------------------------------------------------//
    public void Taxi(String whatAmIFlying){ //sets airport activity to taxi
        findAirCraft(whatAmIFlying).setAirPortActivity("--TAXI--");
        System.out.println(String.format("%s taxi MSX DB", whatAmIFlying));
    }

    //FUEL METHOD--------------------------------------------------------------------------------//
    public String fuelPlane(String whatAmIFlying){
        if(findAirCraft(whatAmIFlying).getFuelLevel() != 100){
            findAirCraft(whatAmIFlying).setFuelLevel(100);
            System.out.println(String.format("%s fuel MSX", whatAmIFlying));
        }else{
            System.out.println(String.format("%s fuel is at 100 already", whatAmIFlying));
            return "Aircraft fuel is already at 100";
        }
    return null;
    }

    //LOAD PASSENGERS--------------------------------------------------------------------------------//
    public String loadPlaneWPassengers(String whatAmIFlying){
        if(findAirCraft(whatAmIFlying).getPassengerCount() == 0 ){
        findAirCraft(whatAmIFlying).setPassengerCount(findAirCraft(whatAmIFlying).getMaxPassengers());//finds the airCraft max amount of passengers then sets the amout of passengers to that amount
        }else{
            System.out.println(String.format("%s already has max passengers", whatAmIFlying));
            return "passenger capacity is already met";
        }
    return  null;
    }

    //DEPLOY LANDING GEAR--------------------------------------------------------------------------------//
    public String deployAirCraftLandingGear(String whatAmIFlying){
        if (findAirCraft(whatAmIFlying).getLandingGearStatus() == "Deployed"){
            return "landing gear are already deployed";
        }else{
            findAirCraft(whatAmIFlying).setLandingGearStatus("Deployed");
            System.out.println(String.format("%s landing legs are: deployed", whatAmIFlying));
        }
        return null;
    }

    //RETRACT LANDING GEAR--------------------------------------------------------------------------------//
    public String retractAirCraftLandingGear (String whatAmIFlying){
        if(findAirCraft(whatAmIFlying).getLandingGearStatus() == "Retracted"){
            return "landing gear is already retracted";
        }else{
            findAirCraft(whatAmIFlying).setLandingGearStatus("Retracted");
            System.out.println(String.format("%s Landing legs are: %b",whatAmIFlying,findAirCraft(whatAmIFlying).getLandingGearStatus())); //creates a string with the aircraft name and its landing gear status.
        }
        return null;
    }


    //find AirCraft method to use to change specific charteristices on objects
    public Planes findAirCraft(String nameOfAircraft){ //this goes through planeSelectiojn and looks for the "nameOfAircraft" and returns the object of what your looking for
        for (Planes whatImflying: BumpkinAir.planeSelection) {
        if(whatImflying.getPlaneType() == nameOfAircraft){
            return whatImflying;
        }
        }
        return null;
    }
    //Adding hours whenever a pilot lands a lane

    //Setting the pilot name
}
