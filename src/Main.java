public class Main {

    public static double calculate_yearly_salary(double hours_per_week, double cost_per_hour, int vacation_days){
        int weeks_per_year = 52;
        int vacation_hours_per_day = 8;
        return (weeks_per_year * hours_per_week - vacation_days * vacation_hours_per_day) * cost_per_hour;
    }
    public static void main(String[] args){
        double gross_salary = calculate_yearly_salary(40, 812, 40);
        System.out.println("Your yearly salary is " + gross_salary);
    }
}