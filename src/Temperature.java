public class Temperature {
    private double highTemp;
    private double lowTemp;
    private String scale;

    public Temperature(String scale,double highTemp,double lowTemp){
        this.highTemp = highTemp;
        this.lowTemp = lowTemp;
        if (scale.equals("F") || scale.equals("C")){
            this.scale = scale;
        }else {
            this.scale = "F";
        }
    }

    public static double convertCToF(double temp){
        return (temp * ((double)9/5)) + 32;
    }

    public static double convertFToC(double temp){
        return (temp - 32) * ((double)5/9);
    }

    public void changeToC(){
        if (scale.equals("F")){
            scale = "C";
            highTemp = convertFToC(highTemp);
            lowTemp = convertFToC(lowTemp);
        }else {  }

    }

    public void changeToF(){
        if (scale.equals("C")){
            scale = "F";
            highTemp = convertCToF(highTemp);
            lowTemp = convertCToF(lowTemp);
        }else {  }
    }

    public String tempInfo(){
        String str = "High Temperature: " + highTemp + scale + "\n";
        str += "Low Temperature: " + lowTemp + scale + "\n";
        return str;
    }

}
