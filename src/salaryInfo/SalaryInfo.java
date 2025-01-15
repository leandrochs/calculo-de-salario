package salaryInfo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SalaryInfo {
    public static void print(int position, double salary, double inssDiscount, double incomeTaxDiscount) {
        double netSalary = calculateNetSalary(salary, inssDiscount, incomeTaxDiscount);
        printMessages(position, salary, inssDiscount, incomeTaxDiscount, netSalary);
    }

    private static double calculateNetSalary(double salary, double inssDiscount, double incomeTaxDiscount) {
        return salary - (inssDiscount + incomeTaxDiscount);
    }

    private static void printMessages(
            int position,
            double salary,
            double inssDiscount,
            double incomeTaxDiscount,
            double netSalary
    ) {
        System.out.printf("Salário %s\n", position);
        System.out.printf("- Salário bruto: %.2f\n", salary);
        System.out.printf("- Quanto pagou ao INSS: %.2f\n", roundedValue(inssDiscount));
        System.out.printf("- Quanto pagou de Imposto de Renda: %.2f\n", roundedValue(incomeTaxDiscount));
        System.out.printf("- Salário líquido: %.2f\n\n", roundedValue(netSalary));
    }

    private static BigDecimal roundedValue(double value) {
        return new BigDecimal(value).setScale(2, RoundingMode.HALF_UP);
    }
}
