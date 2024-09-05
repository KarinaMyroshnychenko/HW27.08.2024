public class SalaryCalculator {
    public static void main(String[] args) {
        double hourlyWage = 15.0;
        int hoursWorked = 45;

        System.out.println("Weekly salary: " + calculateWeeklySalary(hourlyWage, hoursWorked) + " dollars");
    }

    public static double calculateWeeklySalary(double hourlyWage, int hoursWorked) {

        if (hourlyWage < 8) {
            hourlyWage = 8;
        }
        if (hoursWorked > 60) {
            hoursWorked = 60;
        }
        if (hoursWorked > 40) {
            int overtimeHours = hoursWorked - 40;
            return (40 * hourlyWage) + (overtimeHours * hourlyWage * 1.5);
        } else {
            return hoursWorked * hourlyWage;
        }
    }
}
