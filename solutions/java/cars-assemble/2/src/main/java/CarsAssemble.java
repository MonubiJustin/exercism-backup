public class CarsAssemble {

    private final static int HOURLY_PRODUCTION_RATE = 221; 
    private final static int MINUTES_PER_HOUR = 60;

    public double productionRatePerHour(int speed) {
        if (speed >= 1 && speed <= 4)
            return speed * HOURLY_PRODUCTION_RATE;
        else if (speed >= 4 && speed <= 8 )
            return (speed * HOURLY_PRODUCTION_RATE * 90) / 100.0;
        else if (speed == 9)
             return (speed * HOURLY_PRODUCTION_RATE * 80) / 100.0;
        else if (speed == 10)
            return (speed * HOURLY_PRODUCTION_RATE * 77) / 100.0;
        else 
            return 0;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(productionRatePerHour(speed) / MINUTES_PER_HOUR);
    }
}
