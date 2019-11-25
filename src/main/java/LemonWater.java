public class LemonWater {





    //control tower
    public Boolean canIland (String landData, String takeOffData){
        if(takeOffData == "lemon_water" && landData == "Bumpkin_Air"){
            return true;
        }else{
            return false;
        }
    }
}
