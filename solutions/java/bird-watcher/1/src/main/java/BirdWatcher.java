
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
       return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int n : birdsPerDay){
            if (n == 0) return true;
        }

        return false;    
    }

    public int getCountForFirstDays(int numberOfDays) {
        int length = birdsPerDay.length;
        int sum = 0;

        if (numberOfDays < length)
            for(int i = 0; i < numberOfDays; i++){
                sum += birdsPerDay[i];
            }
        else 
            for(int num: birdsPerDay){
                sum += num;
            }

        return sum;
    }

    public int getBusyDays() {
       int count = 0;
        for(int n : birdsPerDay){
            if (n >= 5)
                count++;
        }

        return count;
    }
}
