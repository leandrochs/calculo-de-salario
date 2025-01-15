package inss;

public class Inss {

    public static double calculateDiscount(double salary) {
        if (isAboveTheMaximumSalaryRange(salary))
            return maximumDiscount();
        double percentage = defineThePercentageOfTheRange(salary);
        return defineSalaryDiscount(salary, percentage);
    }

    private static boolean isAboveTheMaximumSalaryRange(double salary) {
        double maximumSalaryForDiscount = inssDiscountRanges.RANGE_4.getUpperLimit();
        return salary > maximumSalaryForDiscount;
    }

    private static double maximumDiscount() {
        double maximumSalaryForDiscount = inssDiscountRanges.RANGE_4.getUpperLimit();
        double maximumDiscountPercentage = inssDiscountRanges.RANGE_4.getDiscountPercentage();

        return maximumSalaryForDiscount * (maximumDiscountPercentage/100);
    }

    private static double defineThePercentageOfTheRange(double salary) {
        return inssDiscountRanges.getDiscountPercentage(salary);
    }

    private static double defineSalaryDiscount(double salary, double percentageOfTheRange) {
        return salary * (percentageOfTheRange /100);
    }
}
