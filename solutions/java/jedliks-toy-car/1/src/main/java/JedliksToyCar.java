public class JedliksToyCar {

    private int distance = 0;
    private int batteryPercentage = 100;

    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        return batteryPercentage > 0 ? "Battery at " + batteryPercentage + "%" : "Battery empty";
    }

    public void drive() {
        if (batteryPercentage > 0){
            distance += 20;
            batteryPercentage--;
        }
    }
}
