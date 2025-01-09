import discountCalculations.Calculate;

public class Main {
    public static void main(String[] args) {

        for(String salaryReported : args) {

            double salary = Double.parseDouble(salaryReported);

            double inssDiscount = Calculate.inssDiscount(salary);

            double incomeTaxDiscount = Calculate.incomeTaxDiscount(salary);

            salaryInformation.printSalaryAndDeductions(salary, inssDiscount, incomeTaxDiscount);

        }

    }
}
