import inss.Inss;

public class Main {
    public static void main(String[] args) {

        for(String salaryReported : args) {

            double salary = Double.parseDouble(salaryReported);

            double inssDiscount = Inss.calculateDiscount(salary);

            double incomeTaxDiscount = incomeTax.calculateDiscount(salary);

            salaryInformation.printSalaryAndDeductions(salary, inssDiscount, incomeTaxDiscount);

        }

    }
}
