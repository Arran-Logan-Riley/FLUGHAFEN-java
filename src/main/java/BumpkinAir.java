import java.util.ArrayList;
import java.util.List;

public class BumpkinAir {
    private Double HoursToLemonWater;
    static List<PilotClass> pilotClasses = new ArrayList<>();
    static List<Planes> planeSelection = new ArrayList<>(); //this stores all the created planes vv


    public String createNewPlane() { //method to create an object to add to the plane selection. This refrences the Planes constructor
        planeSelection.add(new Planes("A380", "Landed", "Bumpkin_Air", 555)); //Ask constructor to add a new object to plane list
        planeSelection.add(new Planes("747-400", "Landed", "Bumpkin_Air", 416));
        planeSelection.add(new Planes("DC-8", "Landed", "Bumpkin_Air", 269));
        return "planes added";
    }

    public String createPilot(){
        pilotClasses.add(new PilotClass());

        return "pilot added";
    }


    //control tower
    //land & take off control
    public Boolean canIland(String landData, String takeOffData) {
        if (takeOffData == "Bumpkin_Air" && landData == "lemon_water") {
            return true;
        } else {
            return false;
        }
    }

    //hanger state (what is in the hanger)
    public String whatTypeOfAirCraftAreAvaliavbleAtBumpkin_Air(String location) {
        String airCraft = "";
        if (location == "Bumpkin_Air") {
            for (Planes currentPlane : planeSelection) {
            airCraft += currentPlane.getPlaneType();
            }
        }
        return airCraft;
    }
}


