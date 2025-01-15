import incomeTax.IncomeTax;
import inss.Inss;
import salaryInfo.SalaryInfo;

public class Main {
    public static void main(String[] args) {

        int position = 0;

        for(String salaryReported : args) {

            double salary = Double.parseDouble(salaryReported);

            double inssDiscount = Inss.calculateDiscount(salary);

            double incomeTaxDiscount = IncomeTax.calculateDiscount(salary);

            SalaryInfo.print(++position, salary, inssDiscount, incomeTaxDiscount);
        }
    }
}
