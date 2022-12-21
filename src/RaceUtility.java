public class RaceUtility {

    public static double milesToKm(double miles){
        return miles * 1.609;
    }

    public static double kmToMiles(double km){
        return km / 1.609;
    }

    public static String makeProper(String str){
        String proper = str.substring(0,1).toUpperCase();
        for (int i = 1; i <= str.length() - 1; i++){
            String lttr = str.substring(i,i+1);
            if (!str.substring(i-1,i).equals(" ")){
                proper += lttr.toLowerCase();
            }else{
                proper += lttr.toUpperCase();
            }
        }
        return proper;
    }
}
