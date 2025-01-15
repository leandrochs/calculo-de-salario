package incomeTax;

public class IncomeTax {
    public static double calculateDiscount(double salary) {
        double discountPercentage = defineTheDiscountPercentage(salary);
        return discountOnSalary(salary, discountPercentage);
    }

    private static double defineTheDiscountPercentage(double salary) {
        return incomeTaxDiscountRanges.getDiscountPercentage(salary);
    }

    private static double discountOnSalary(double salary, double discountPercentage) {
        return salary * (discountPercentage / 100);
    }
}
