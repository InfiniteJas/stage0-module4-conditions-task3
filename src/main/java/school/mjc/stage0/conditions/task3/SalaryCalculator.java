package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary <= 10000 && salary >= 0) {
            double taxedSalary = salary * 0.85;
            System.out.println(taxedSalary);
        } else if (salary > 10000 && salary <= 20000) {
            double taxedSalary = salary * 0.82;
            System.out.println(taxedSalary);
        } else if (salary > 20000) {
            double taxedSalary = salary * 0.8;
            System.out.println(taxedSalary);
        } else {
            System.out.println("wrong input!");
        }
    }
}
