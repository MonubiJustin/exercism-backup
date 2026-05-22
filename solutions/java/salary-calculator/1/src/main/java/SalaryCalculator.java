public class SalaryCalculator {

    private final static double BASE_SALARY = 1000.0;
    
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? 0.85 : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
       return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
      int bonusMultiplier = bonusMultiplier(productsSold);

        return bonusMultiplier * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salaryMultiplier = salaryMultiplier(daysSkipped);
        double bonusForProductsSold = bonusForProductsSold(productsSold);

        double salary = 1000 * salaryMultiplier + bonusForProductsSold;

        return salary >= 2000 ? 2000 : salary;
    } 
}
