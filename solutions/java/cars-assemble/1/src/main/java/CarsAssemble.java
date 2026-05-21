public class CarsAssemble {

    private final static int CARS_PRODUCED_IN_ONE_HOUR = 221; 
    private final static int MINUTES_IN_ONE_HOUR = 60;

    public double productionRatePerHour(int speed) {
        if (speed >= 1 && speed <= 4)
            return speed * CARS_PRODUCED_IN_ONE_HOUR;
        else if (speed >= 4 && speed <= 8 )
            return (speed * CARS_PRODUCED_IN_ONE_HOUR * 90) / 100.0;
        else if (speed == 9)
             return (speed * CARS_PRODUCED_IN_ONE_HOUR * 80) / 100.0;
        else if (speed == 10)
            return (speed * CARS_PRODUCED_IN_ONE_HOUR * 77) / 100.0;
        else 
            return 0;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(productionRatePerHour(speed) / MINUTES_IN_ONE_HOUR);
    }
}
